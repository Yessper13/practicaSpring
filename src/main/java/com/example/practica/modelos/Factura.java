package com.example.practica.modelos;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @CreationTimestamp
    private LocalDate fechaFactura;

    private MetodoPagos metodoPago;

    public Factura() {
    }


}
