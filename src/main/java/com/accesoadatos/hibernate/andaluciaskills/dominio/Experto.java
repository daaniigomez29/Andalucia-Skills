package com.accesoadatos.hibernate.andaluciaskills.dominio;

import javax.persistence.*;

@Entity
@Table(name = "experto")
public class Experto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    @ManyToOne
    @JoinColumn
    private Especialidad id_especialidad;

    @OneToOne
    @JoinColumn
    private Usuario id_usuario;

    public Experto(String nombre) {
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
        return "Experto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
