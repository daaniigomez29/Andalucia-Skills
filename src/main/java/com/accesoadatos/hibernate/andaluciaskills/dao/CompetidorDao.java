package com.accesoadatos.hibernate.andaluciaskills.dao;

import com.accesoadatos.hibernate.andaluciaskills.dominio.Competidor;

import javax.persistence.Query;
import java.util.List;

public class CompetidorDao extends AbstractDao<Competidor>{

    public CompetidorDao(){setClazz(Competidor.class);}

    public List<String> findAllCentros(){
        String sql = "SELECT DISTINCT c.centro FROM " + Competidor.class.getName() + " c";
        System.out.println(sql);
        Query query = getEntityManager().createQuery(sql);
        return query.getResultList();
    }

}
