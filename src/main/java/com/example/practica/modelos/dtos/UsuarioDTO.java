package com.example.practica.modelos.dtos;

public class UsuarioDTO {
    private String nombre;
    private Integer telefono;
    private String correo;
    private Integer edad;

    public UsuarioDTO() {}

    public UsuarioDTO(String nombre, Integer telefono, String correo, Integer edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
