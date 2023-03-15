package com.lucas.restaurantedata.entity;
/**
 * MAPEO DE TABLA DEL MYSQL CON EL JAVA
 */
import java.time.LocalDateTime;
import java.util.List;

public class TipoRestaurante extends CommonEntity {
	
	//Identificador del tipo de restaurante
	private int idTipoRestaurante;
	
	//Descripcion del tipo de restaurante
	private String descripcion;
	

	
	/**
	 * Restaurante que pertenecen a un tipo de restaurante
	 */
	private List<Restaurante> restaurante;

	public int getIdTipoRestaurante() {
		return idTipoRestaurante;
	}

	public void setIdTipoRestaurante(int idTipoRestaurante) {
		this.idTipoRestaurante = idTipoRestaurante;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	
	
}
