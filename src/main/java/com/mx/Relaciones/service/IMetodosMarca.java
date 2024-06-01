package com.mx.Relaciones.service;

import java.util.List;

import com.mx.Relaciones.domain.Marca;

public interface IMetodosMarca {

	public void guardar(Marca marca);
	public void editar(Marca marca);
	public void eliminar(Marca marca);
	
	public Marca buscar(Marca marca);
	public List<Marca> listar();
	
}
