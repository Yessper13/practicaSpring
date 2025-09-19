package com.example.practica.modelos;

import com.example.practica.ayudas.Roles;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "nombre", unique = false, nullable = false, length = 50)
    private String nombre;
    @Column (unique = false, nullable = false, length = 10)
    private Integer telefono;
    @Column(unique = false, nullable = false, length = 50)
    private String direccion;
    @Column(unique = true, nullable = false, length = 50)
    private String correo;
    @Column(unique = false, nullable = false, length = 3)
    private Integer edad;
    @Column(unique = true, nullable = false, length = 10)
    private Integer cedula;
    @Column
    @Enumerated(EnumType.STRING)
    private Roles roles;
    //relacion usuario -> cliente
    @OneToOne (mappedBy = "usuario")
    @JsonBackReference(value = "relacionusuariocliente")
    private Cliente cliente;
    //relacion usuario -> proveedor
    @OneToOne(mappedBy = "usuario")
    @JsonBackReference(value = "relacionUsuarioProveedor")
    private Proveedor proveedor;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, Integer telefono, String direccion, String correo, Integer edad, Integer cedula, Roles roles) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.edad = edad;
        this.cedula = cedula;
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
}
