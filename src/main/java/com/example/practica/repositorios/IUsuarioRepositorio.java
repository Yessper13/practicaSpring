package com.example.practica.repositorios;

import com.example.practica.modelos.Usuario;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer> {

    List<Usuario>BusquedaPorNombre(String nombre);
    Iterable<Usuario>BuscarPorNombreIt(String nombre); //Preguntar cuando se usa Iterable a Juan Jose

    Optional<Usuario>BuscarPorCedula(Integer cedula);
    Iterable<Usuario>BuscarPorCedulaIt(Integer cedula); //Preguntar cuando se usa Iterable a Juan Jose

    Optional<Usuario>BuscarPorCorreo(String correo);
    Iterable<Usuario>BuscarPorCorreoIt(String correo);

}
