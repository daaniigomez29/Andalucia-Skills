package com.accesoadatos.hibernate.andaluciaskills.dao;

import com.accesoadatos.hibernate.andaluciaskills.dominio.PuntuacionPrueba;

import javax.persistence.Query;
import java.util.List;
import com.accesoadatos.hibernate.andaluciaskills.dominio.Prueba;
import com.accesoadatos.hibernate.andaluciaskills.dominio.Competidor;

public class PuntuacionPruebaDao extends AbstractDao<PuntuacionPrueba>{
    public PuntuacionPruebaDao(){setClazz(PuntuacionPrueba.class);}

    public List<PuntuacionPrueba> findPuntuacionByCompetidor(){
        String sql = "select pp.puntuacion, p.nombre, c.nombre from " +  PuntuacionPrueba.class.getName() + " pp " + "join " + Prueba.class.getName() + " p " + "on " + "pp.prueba_id = p.id" +
                " join "+ Competidor.class.getName() + " c on pp.competidor_id = c.id";
        Query query = getEntityManager().createQuery(sql);
        return query.getResultList();
    }
}
