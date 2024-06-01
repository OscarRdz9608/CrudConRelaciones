package com.mx.Relaciones.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.Relaciones.domain.Modelo;

@Repository
public interface ModeloDao extends JpaRepository<Modelo, Integer>{

}
