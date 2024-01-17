package com.accesoadatos.hibernate.andaluciaskills.dominio;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "puntuacion_prueba")
public class PuntuacionPrueba implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "competidor_id")
    private Competidor competidor_id;

    @Id
    @ManyToOne
    @JoinColumn(name = "prueba_id")
    private Prueba prueba;

    private int puntuacion;

    public PuntuacionPrueba(int puntuacion){
        this.puntuacion = puntuacion;
    }

}
