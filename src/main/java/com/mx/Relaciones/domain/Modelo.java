package com.mx.Relaciones.domain;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="MODELOS_MARCA_AUTO")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Data
public class Modelo {
	

	
	@Id
	@Column(name="ID", columnDefinition = "NUMBER", length = 20, nullable = false)
	private int id;
	
	@Column(name="MODELO", columnDefinition = "NVARCHAR2(50)", length = 50, nullable = false)
	private String modelo;
	
	@Column(name="COLOR", columnDefinition = "NVARCHAR2(50)", length = 50, nullable = false)
	private String color;
	
	@Column(name="TIPO", columnDefinition = "NVARCHAR2(50)", length = 50, nullable = false)
	private String tipo;
	
	@Column(name="NUM_PUERTAS", columnDefinition = "NUMBER", length = 50, nullable = false)
	private int numPuertas;
	
	@Column(name="PRECIO", columnDefinition = "NUMBER", length = 50, nullable = false)
	private double precio;
	
	@JoinColumn(name="MARCA_ID")
	@ManyToOne(fetch=FetchType.EAGER)
	private Marca marca;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	
	

	
	
	
}
