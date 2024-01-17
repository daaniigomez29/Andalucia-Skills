package com.accesoadatos.hibernate.andaluciaskills.dao;

import com.accesoadatos.hibernate.andaluciaskills.utiles.EntityManagerUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public abstract class AbstractDao<T> implements Dao<T> {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();
    private Class<T> clazz;

    @Override
    public Optional<T> get(int id){
        return Optional.ofNullable(entityManager.find(clazz,id));
    }

    @Override
    public List<T> getAll(){
        String ql = "FROM " + clazz.getName();
        Query query = entityManager.createQuery(ql);
        return query.getResultList();
    }

    @Override
    public void save(T t){
        executeInsideTransaction(entityManager -> entityManager.persist(t));
    }

    @Override
    public void update(T t){
        executeInsideTransaction(entityManager -> entityManager.merge(t));
    }

    @Override
    public void delete(T t){
        executeInsideTransaction(entityManager -> entityManager.remove(t));
    }

    public EntityManager getEntityManager(){return entityManager;}

    private void executeInsideTransaction(Consumer<EntityManager> action){
        EntityTransaction tx = entityManager.getTransaction();
        try{
            tx.begin();
            action.accept(entityManager);
            tx.commit();
        } catch (RuntimeException e){
            tx.rollback();
            throw e;
        }
    }

    public void setClazz(Class clazz){
        this.clazz = clazz;
    }
}
