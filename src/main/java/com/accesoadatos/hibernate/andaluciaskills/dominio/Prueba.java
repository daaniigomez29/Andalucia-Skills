package com.accesoadatos.hibernate.andaluciaskills.dominio;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "prueba")
public class Prueba {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;

    @ManyToMany(mappedBy = "pruebas")
    private Set<Competidor> competidores = new HashSet<>();

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
