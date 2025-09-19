package com.example.practica.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "detalleFactura")
public class DetalleFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "cantidad", length = 100, nullable = false, unique = false)
    private Integer cantidad;
    @Column(name = "subtotal", length = 100, nullable = false, unique = false)
    private double subtotal;
    @Column(name = "iva", length = 100, nullable = false, unique = false)
    private Integer iva;
    @Column(name = "precio", length = 100, nullable = false, unique = false)
    private Integer precio;


    @ManyToOne
    @JsonBackReference(value = "relaciondetallefacturaproducto")
    @JoinColumn(name = "fk_producto", referencedColumnName = "id")
    private Producto producto;

    @ManyToOne
    @JsonBackReference(value = "relaciondetallefacturafactura")
    @JoinColumn(name = "fk_factura", referencedColumnName = "id")
    private Factura factura;

    public DetalleFactura() {}

    public DetalleFactura(Integer id, Integer cantidad, double subtotal, Integer iva, Integer precio) {
        this.id = id;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.iva = iva;
        this.precio = precio;
    }

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}
    public Integer getCantidad() {return cantidad;}
    public void setCantidad(Integer cantidad) {this.cantidad = cantidad;}
    public double getSubtotal() {return subtotal;}
    public void setSubtotal(double subtotal) {this.subtotal = subtotal;}
    public Integer getIva() {return iva;}
    public void setIva(Integer iva) {this.iva = iva;}
    public Integer getPrecio() {return precio;}
    public void setPrecio(Integer precio) {this.precio = precio;}


}
