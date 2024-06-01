package com.mx.Relaciones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Relaciones.dao.MarcaDao;
import com.mx.Relaciones.domain.Marca;

@Service
public class ImpMarca implements IMetodosMarca{

	@Autowired private MarcaDao dao;
	
	
	@Override
	public void guardar(Marca marca) {
		// TODO Auto-generated method stub
		dao.save(marca);
	}

	@Override
	public void editar(Marca marca) {
		// TODO Auto-generated method stub
		dao.save(marca);
	}

	@Override
	public void eliminar(Marca marca) {
		// TODO Auto-generated method stub
		dao.delete(marca);
	}

	@Override
	public Marca buscar(Marca marca) {
		// TODO Auto-generated method stub
		Marca mar= dao.findById(marca.getId()).orElse(null);
		return mar;
	}

	@Override
	public List<Marca> listar() {
		// TODO Auto-generated method stub
		List<Marca> listMarca = dao.findAll();
		return listMarca;
	}
	
	

}
