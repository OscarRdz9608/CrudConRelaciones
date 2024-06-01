package com.mx.Relaciones.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="MARCA_AUTO")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Data
public class Marca {
	

	
	@Id
	@Column(name="ID", columnDefinition = "NUMBER", length = 20, nullable = false)
	private int id;
	
	@Column(name="MARCA", columnDefinition = "NVARCHAR2(50)", length = 50, nullable = false)
	private String marca;
	
	@Column(name="PAIS", columnDefinition = "NVARCHAR2(50)", length = 50, nullable = false)
	private String pais;
	
	@Column(name="SUCURSAL", columnDefinition = "NVARCHAR2(50)", length = 50, nullable = false)
	private String sucursal;
	
	@Column(name="NUM_EMPLEADOS", columnDefinition = "NUMBER", length = 50, nullable = false)
	private double numEmpleados;
	
	
	
	///RELACION EN LA TABLA 1 SIEMPRE SE PASA UNA LISTA DE OBJETOS EN ESTE CASO ES MODELOS
	@OneToMany(mappedBy ="marca", cascade =  CascadeType.ALL)
	List<Modelo> listaModelos = new ArrayList<>();
 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public double getNumEmpleados() {
		return numEmpleados;
	}

	public void setNumEmpleados(double numEmpleados) {
		this.numEmpleados = numEmpleados;
	}

	
	
}
