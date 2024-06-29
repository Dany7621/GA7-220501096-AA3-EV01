package com.ProyectoSENA.modulo.controllers;

// Clase que representa la información de los clientes
public class InformacionClientes {

    // Atributos privados de la clase
    private Integer ID;
    private String Nombre;
    private String Apellido;
    private Integer Cedula;
    private Integer Telefono;
    
    // Constructor que inicializa todos los atributos de la clase
    public InformacionClientes(Integer id, String nombre, String apellido, Integer cedula, Integer telefono) {
        ID = id;
        Nombre = nombre;
        Apellido = apellido;
        Cedula = cedula;
        Telefono = telefono;
    }

    // Constructor vacío, necesario para algunas operaciones de Spring
    public InformacionClientes() {

    }
    // Métodos 'get' para obtener el valor de cada atributo
    public Integer getId() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public Integer getCedula() {
        return Cedula;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    // Métodos 'set' para establecer el valor de cada atributo
    public void setId(Integer id) {
        ID = id;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setCedula(Integer cedula) {
        Cedula = cedula;
    }

    public void setTelefono(Integer telefono) {
        Telefono = telefono;
    }
}
