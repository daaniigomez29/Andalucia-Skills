package com.accesoadatos.hibernate;

import com.accesoadatos.hibernate.andaluciaskills.dao.*;
import com.accesoadatos.hibernate.andaluciaskills.dominio.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        CompetidorDao competidorDao = new CompetidorDao();
        Competidor competidor = new Competidor("Daniel", "Centro");

        EspecialidadDao especialidadDao = new EspecialidadDao();
        Especialidad especialidad = new Especialidad(1, "BBDD");

        ExpertoDao expertoDao = new ExpertoDao();
        Experto experto = new Experto("El Xokas");

        PruebaDao pruebaDao = new PruebaDao();
        Prueba prueba = new Prueba("Cascos");

        PuntuacionPruebaDao puntuacionPruebaDao = new PuntuacionPruebaDao();
        PuntuacionPrueba puntuacionPrueba = new PuntuacionPrueba(20);

        UsuarioDao usuarioDao = new UsuarioDao();
        Usuario usuario = new Usuario("dgb", "111");



    }
}
