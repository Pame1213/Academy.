package com.mongodb.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cliente de autos")
public class clientes de  Autos {

    @Id
    private String id;
    private String precio;
    private String modelo;
    private String nombre;
    // Constructor vacío
    public Autos() {}

    // Constructor con todos los campos
    public Autos(String precio, String modelo, String nombre {
        this.nombre = nombre;
        this.precio = modelo;
        this.nombre = modelo;
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = precio; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }


