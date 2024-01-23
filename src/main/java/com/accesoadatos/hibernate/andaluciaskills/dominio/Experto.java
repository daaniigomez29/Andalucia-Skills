package com.accesoadatos.hibernate.andaluciaskills.dominio;

import javax.persistence.*;

@Entity
@Table(name = "experto")
public class Experto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    @OneToOne
    @JoinColumn
    private Especialidad id_especialidad;

    @OneToOne
    @JoinColumn
    private Usuario id_usuario;

    public Experto(String nombre) {
        this.nombre = nombre;
    }

    public Experto(String nombre, Especialidad id_especialidad, Usuario id_usuario) {
        this.nombre = nombre;
        this.id_especialidad = id_especialidad;
        this.id_usuario = id_usuario;
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
        return "Experto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
