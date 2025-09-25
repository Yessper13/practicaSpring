package com.example.practica.modelos;

import com.example.practica.ayudas.Estado;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "productos")

public class Producto {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
 @Column
    private String nombreProducto;
    @Column
    private String descripcionProducto;
    @Column
    private Double valor;
    @Column
    @Enumerated
    private Estado estado;
    @Column
    private Integer stock;
    @ManyToOne
    @JoinColumn(name = "fk_proveedor", referencedColumnName = "id")
    @JsonBackReference(value = "relacionproveedoraproductos")
    private Proveedor proveedor;


    @OneToMany (mappedBy = "producto")
   @JsonManagedReference(value = "relaciondetallefacturaproducto")
    private ArrayList<DetalleFactura> detalleFactura;

    public Producto() {
    }

    public Producto(Integer id, String nombreProducto, String descripcionProducto, Double valor, Estado estado, Integer stock) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.valor = valor;
        this.estado = estado;
        this.stock = stock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Double getPrecio() {
        return valor;
    }

    public void setPrecio(Double precio) {
        this.valor = valor;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
