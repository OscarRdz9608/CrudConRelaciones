package com.mx.Relaciones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Relaciones.dao.ModeloDao;
import com.mx.Relaciones.domain.Modelo;

@Service
public class ImpModelo implements IMetodosModelo {

	@Autowired private ModeloDao dao;
	
	
	@Override
	public void guardar(Modelo modelo) {
		// TODO Auto-generated method stub
		dao.save(modelo);
	}

	@Override
	public void editar(Modelo modelo) {
		// TODO Auto-generated method stub
		dao.save(modelo);
	}

	@Override
	public void eliminar(Modelo modelo) {
		// TODO Auto-generated method stub
		dao.delete(modelo);
	}

	@Override
	public Modelo buscar(Modelo modelo) {
		// TODO Auto-generated method stub
		Modelo model= dao.findById(modelo.getId()).orElse(null);
		return model;
	}

	@Override
	public List<Modelo> listar() {
		// TODO Auto-generated method stub
		List<Modelo> listModelo = dao.findAll();
		return listModelo;
	}
}
