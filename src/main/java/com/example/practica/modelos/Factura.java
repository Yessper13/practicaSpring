package com.example.practica.modelos;

import com.example.practica.ayudas.MetodoPagos;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.ArrayList;

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
    @JsonBackReference(value = "relacionClienteFactura")
    private Cliente  cliente;

    @OneToMany(mappedBy = "factura")
    @JsonManagedReference(value = "relaciondetallefacturafactura")
    private ArrayList<DetalleFactura>  detalleFactura;

    @ManyToOne
    @JoinColumn(name = "fk_vendedor", referencedColumnName = "id")
    @JsonBackReference(value = "relacionVendedorFactura")
    private Vendedor vendedor;

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
