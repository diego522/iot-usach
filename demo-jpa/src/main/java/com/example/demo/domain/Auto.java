package com.example.demo.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by dfs1 on 28-08-17.
 */
@Table
@Entity
public class Auto {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "Marca no debe estar en blanco")
    @Column(name = "AUTO_MARCA", length = 1000)
    private String marca;

    @Column(name = "ANIO_FAB")
    private int anioFab;

    private String modelo;


    @PrePersist
    public void prePersist() {
        if (modelo.isEmpty()) {
            modelo = "Sin Modelo";
        }
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioFab() {
        return anioFab;
    }

    public void setAnioFab(int anioFab) {
        this.anioFab = anioFab;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
