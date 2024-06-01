package com.mx.Relaciones.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.Relaciones.domain.Marca;

@Repository
public interface MarcaDao extends JpaRepository<Marca, Integer>{

}
