package com.example.practica.modelos;

import com.example.practica.ayudas.MetodoPagos;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    @CreationTimestamp
    private LocalDate fechaFactura;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MetodoPagos metodoPago;

    @ManyToOne
    @JoinColumn(name = "fk_Cliente", referencedColumnName = "id")
    @JsonBackReference(value = "realacionClienteFactura")
    private Cliente cliente;

    @OneToMany(mappedBy = "factura")
    @JsonManagedReference(value = "relaciondetallefacturafactura")
    private DetalleFactura detalleFactura;

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
