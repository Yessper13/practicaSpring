package com.example.practica.modelos;

import com.example.practica.ayudas.Preferencia;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.lang.ref.Reference;
import java.util.ArrayList;

@Entity
@Table(name="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    @Enumerated(EnumType.STRING)
    private Preferencia preferencia;

    @OneToOne
    @JoinColumn(name = "FK_usuarioCliente", referencedColumnName = "id")
    @JsonManagedReference(value = "relacionusuariocliente")
    private Usuario usuario;


    @OneToMany(mappedBy = "cliente")
    @JsonManagedReference(value = "relacionClienteFactura")
    private ArrayList<Factura> factura;

    public Cliente() {
    }

    public Cliente(Integer id, Preferencia preferencia) {
        this.id = id;
        this.preferencia = preferencia;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Preferencia getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(Preferencia preferencia) {
        this.preferencia = preferencia;
    }

}
