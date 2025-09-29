 package com.mongodb.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;

import java.time.LocalDateTime;

@Document(collection = "Cliente de Autos")
public class Cliente {


    @Id
    private String id;
    private String precio;
    private String modelo
    private String nombre;

    @Indexed(unique = true)
    private String email;

    private String telefono;

    public Cliente() {
    }


    public Cliente(String id, String precio, String modelo, String telefono, String email, String nombre) {
        this.id = id;
        this.precio = precio;
        this.modelo = modelo;
        this.telefono = telefono;
        this.email = email;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
