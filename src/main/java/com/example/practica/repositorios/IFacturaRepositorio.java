package com.example.practica.repositorios;

import com.example.practica.modelos.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IFacturaRepositorio extends JpaRepository<Factura, Integer> {

    List<Factura> BuscarPorFecha(Date fecha);
    Iterable<Factura>BuscarPorFechaIt(Date fecha);



}
