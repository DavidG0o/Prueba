package com.ProyectoDavidDeportes.David.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProyectoDavidDeportes.David.app.variables.Jugador;


public interface JugadorRepositorio extends JpaRepository<Jugador, Integer> {

}
