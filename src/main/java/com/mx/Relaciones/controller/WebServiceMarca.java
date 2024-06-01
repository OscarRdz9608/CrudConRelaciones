package com.mx.Relaciones.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Relaciones.domain.Marca;
import com.mx.Relaciones.service.ImpMarca;

@RestController
@RequestMapping("/marca")
@CrossOrigin("*")
public class WebServiceMarca {

	@Autowired private ImpMarca imp;
	
	@GetMapping("/")
	public String test(){
		return "Hello world";
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> listar(){
		var listar = imp.listar();
		if (listar.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}else {
			return ResponseEntity.status(HttpStatus.OK).body(listar);
		}
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> guardar(@RequestBody Marca marca){
	HashMap<String, String> respuesta = new HashMap<>();
		imp.guardar(marca);
		respuesta.put("message", "guardado");
	
		
		return new ResponseEntity<Map<String, String>>(respuesta, HttpStatus.OK);
		//return ResponseEntity.ok(respuesta);
	
	}
	
	
	@PostMapping("/edit")
	public ResponseEntity<?> edit(@RequestBody Marca marca){
	HashMap<String, String> respuesta = new HashMap<>();
		imp.editar(marca);
		respuesta.put("message", "editado");
		
		return new ResponseEntity<Map<String, String>>(respuesta, HttpStatus.OK);
		//return ResponseEntity.ok(respuesta);	
	}
	
	
	@PostMapping("/delete")
	public ResponseEntity<?> delete(@RequestBody Marca marca){
	HashMap<String, String> respuesta = new HashMap<>();
		imp.eliminar(marca);
		respuesta.put("message", "editado");		
		return new ResponseEntity<Map<String, String>>(respuesta, HttpStatus.OK);
		//return ResponseEntity.ok(respuesta);	
	}
	
	
	@PostMapping("/search")
	public ResponseEntity<?> search(@RequestBody Marca marca){
		Marca marc= imp.buscar(marca);	
		return ResponseEntity.status(HttpStatus.OK).body(marc);
	}	
	
	
	
	
}
