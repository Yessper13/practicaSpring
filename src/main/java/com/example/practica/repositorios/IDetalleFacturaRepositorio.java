package com.example.practica.repositorios;

import com.example.practica.modelos.DetalleFactura;
import com.example.practica.modelos.Factura;
import com.example.practica.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IDetalleFacturaRepositorio extends JpaRepository<DetalleFactura, Integer> {

    List<Producto> BuscarPorProductoPorId (Integer Id);
    List<Factura> BuscarPorFacturaPorId (Integer Id);

    List<DetalleFactura> BuscarPorCantidad (Integer Cantidad);


}
