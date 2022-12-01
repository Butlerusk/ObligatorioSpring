package com.example.ObligatorioSpring.entity;


import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "viajes")
public class Viaje  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 20)
    @NotNull
    private String destino;

    @Column
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column
    @NotNull
    private String modalidad;

    @Column
    @NotNull
    private Double precio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Viaje(Integer id, @NotNull String destino, @NotNull Date fecha, @NotNull String modalidad,
            @NotNull Double precio) {
        this.id = id;
        this.destino = destino;
        this.fecha = fecha;
        this.modalidad = modalidad;
        this.precio = precio;
    }

    public Viaje() {
    }

}
