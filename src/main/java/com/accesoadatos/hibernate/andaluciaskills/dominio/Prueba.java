package com.accesoadatos.hibernate.andaluciaskills.dominio;

import javax.persistence.*;

@Entity
@Table(name = "prueba")
public class Prueba {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;

    public Prueba(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Prueba{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
