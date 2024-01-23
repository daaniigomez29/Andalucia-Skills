package com.accesoadatos.hibernate;

import com.accesoadatos.hibernate.andaluciaskills.dao.*;
import com.accesoadatos.hibernate.andaluciaskills.dominio.*;


public class App 
{
    public static void main( String[] args ) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.SEVERE);

        /* Pruebas para la inserción de datos
        EspecialidadDao especialidadDao = new EspecialidadDao();
        Especialidad especialidad = new Especialidad(1, "BBDD");

        CompetidorDao competidorDao = new CompetidorDao();
        Competidor competidor = new Competidor("Daniel", "Centro", especialidad);

        PruebaDao pruebaDao = new PruebaDao();
        Prueba prueba = new Prueba("Cascos");

        PuntuacionPruebaDao puntuacionPruebaDao = new PuntuacionPruebaDao();
        PuntuacionPrueba puntuacionPrueba = new PuntuacionPrueba(competidor, prueba,20);

        UsuarioDao usuarioDao = new UsuarioDao();
        Usuario usuario = new Usuario("dgb", "111");

        ExpertoDao expertoDao = new ExpertoDao();
        Experto experto = new Experto("El Xokas", especialidad, usuario);

        especialidadDao.save(especialidad);
        competidorDao.save(competidor);
        pruebaDao.save(prueba);
        usuarioDao.save(usuario);
        expertoDao.save(experto);
        puntuacionPruebaDao.save(puntuacionPrueba);
         */


        CompetidorDao competidorDao = new CompetidorDao();
        //Mostrar todos los centros que participan en la competición
        System.out.println(competidorDao.findAllCentros());

        //Recuperar las puntuaciones con los nombres de las pruebas y los competidores
        /* Crear competidor con prueba y puntuación para la query
        Competidor competidor = new Competidor("Sergio", "IES Valle Inclán");
        competidorDao.save(competidor);
        PruebaDao pruebaDao = new PruebaDao();
        Prueba prueba1 = new Prueba("Examen Acceso a datos");
        pruebaDao.save(prueba1);
        PuntuacionPruebaDao puntuacionPruebaDao = new PuntuacionPruebaDao();
        PuntuacionPrueba puntuacionPrueba = new PuntuacionPrueba(competidor, prueba1,30);
        puntuacionPruebaDao.save(puntuacionPrueba);
         */

        PuntuacionPruebaDao puntuacionPruebaDao = new PuntuacionPruebaDao();
        System.out.println(puntuacionPruebaDao.findPuntuacionByCompetidor());
    }
}
