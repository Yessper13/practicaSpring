package com.example.practica.repositorios;

import com.example.practica.ayudas.MetodoPagos;
import com.example.practica.modelos.Cliente;
import com.example.practica.modelos.Factura;
import com.example.practica.modelos.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface IFacturaRepositorio extends JpaRepository<Factura, Integer> {

    List<Factura> BuscarPorFecha();
    Iterable<Factura>BuscarPorFechaIt(LocalDate fechaFactura);

    List<Factura>BuscarFacturaPorCliente(Integer id);

    List<Factura>BuscarPorVendedor(Integer id);

    List<Factura>BuscarPorMetodosDePago(Integer id,String metodoPagos);
}
