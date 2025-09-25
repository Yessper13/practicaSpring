package com.example.practica.modelos;

import com.example.practica.ayudas.Cargos;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.ArrayList;

@Entity
@Table(name="vendedor")
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @Enumerated(EnumType.STRING)
    private Cargos cargo;

    @OneToOne
    @JoinColumn(name = "fk_Usuario", referencedColumnName = "id")
    @JsonManagedReference(value = "relacionUsuarioVendedor")
    private Usuario usuario;

    @OneToMany(mappedBy = "vendedor")
    @JsonManagedReference(value = "relacionVendedorFactura")
    private ArrayList <Factura> factura;

    public Vendedor() {
    }

    public Vendedor(Integer id, Cargos cargo) {
        this.id = id;
        this.cargo = cargo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cargos getCargo() {
        return cargo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }
}
