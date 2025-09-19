package com.example.practica.modelos;

import com.example.practica.ayudas.TipoProveedor;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name="proveedor")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="tipoProveedor",nullable = false, unique = false)
    private TipoProveedor tipoProveedor;

    @OneToOne
    @JoinColumn(name="fk_usuarioProveedor", referencedColumnName = "id")
    @JsonManagedReference(value = "relacionUsuarioProveedor")
    private Usuario usuario;

    public Proveedor() {
    }

    public Proveedor(Integer id, TipoProveedor tipoProveedor) {
        this.id = id;
        this.tipoProveedor = tipoProveedor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoProveedor getTipoProveedor() {
        return tipoProveedor;
    }

    public void setTipoProveedor(TipoProveedor tipoProveedor) {
        this.tipoProveedor = tipoProveedor;
    }
}
