package com.mx.Relaciones.service;

import java.util.List;

import com.mx.Relaciones.domain.Modelo;

public interface IMetodosModelo {

	
	public void guardar(Modelo modelo);
	public void editar(Modelo modelo);
	public void eliminar(Modelo modelo);
	
	public Modelo buscar(Modelo modelo);
	public List<Modelo> listar();
	
	
}
