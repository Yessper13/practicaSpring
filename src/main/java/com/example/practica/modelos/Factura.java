package com.example.practica.modelos;

import com.example.practica.ayudas.MetodoPagos;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @CreationTimestamp
    private LocalDate fechaFactura;
    @Enumerated(EnumType.STRING)
    private MetodoPagos metodoPago;

    public Factura() {
    }

    public Factura(Integer id, LocalDate fechaFactura, MetodoPagos metodoPago) {
        this.id = id;
        this.fechaFactura = fechaFactura;
        this.metodoPago = metodoPago;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(LocalDate fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public MetodoPagos getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPagos metodoPago) {
        this.metodoPago = metodoPago;
    }
}
