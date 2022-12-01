package com.example.ObligatorioSpring.entity;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    @Size(min = 7, max = 8)
    private Integer ci;

    @Column(length = 30)
    @NotNull
    private String nombre;

    @Column(length = 30)
    @NotNull
    private String apellido;

    @Column(length = 50)
    @NotNull
    private String email;

    @Column
    @NotNull
    @Value("${some.key:false}")
    private boolean premium;

   

    public Cliente(Integer id, @NotNull @Size(min = 7, max = 8) Integer ci, @NotNull String nombre,
            @NotNull String apellido, @NotNull String email, @NotNull boolean premium) {
        this.id = id;
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.premium = premium;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCi() {
        return ci;
    }

    public void setCi(Integer ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cliente() {
    }

    
}
