package com.example.practica.modelos;

import jakarta.persistence.*;

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

    


    public Producto() {
    }

    public Producto(Integer id, String nombreProducto, String descripcionProducto, Double precio, Estado estado, Integer stock) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precio = precio;
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
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
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
