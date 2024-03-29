package com.accesoadatos.hibernate.andaluciaskills.dominio;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "especialidad")
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private int cod;

    private String nombre;

    @OneToOne(mappedBy = "id_especialidad")
    private Experto experto;

    @OneToMany(mappedBy = "id_especialidad")
    private Set<Competidor> competidores = new HashSet<>();
    public Especialidad(int cod, String nombre) {
        this.cod = cod;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Especialidad{" +
                "id=" + id +
                ", cod=" + cod +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
