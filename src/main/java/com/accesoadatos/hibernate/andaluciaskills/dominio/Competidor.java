package com.accesoadatos.hibernate.andaluciaskills.dominio;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "competidor")
public class Competidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String centro;

    @ManyToOne
    @JoinColumn
    private Especialidad id_especialidad;

    @OneToMany
    @JoinTable(name = "puntuacion_prueba",
    joinColumns = @JoinColumn(name = "competidor_id"),
    inverseJoinColumns = @JoinColumn(name = "prueba_id"))
    private Set<Prueba> pruebas = new HashSet<>();

    public Competidor(String nombre, String centro) {
        this.nombre = nombre;
        this.centro = centro;
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

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    @Override
    public String toString() {
        return "Competidor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", centro='" + centro + '\'' +
                '}';
    }
}
