package com.lucas.restaurantedata.entity;

import java.time.LocalDateTime;

/**
 * @author lucas
 * Clase que contiene campos que se reutilizan en todos los campos que mapean a las tablas de mysql
 */
public class CommonEntity {
	
	//Fecha de creacion del tipo de restaurante
	private LocalDateTime fechaCreacion;
	
	//Fecha de modificacion del tipo de restaurante
	private LocalDateTime fechaModificacion;
	
	//Estatus habilitado o deshabilitado del tipo de restaurante
	private boolean estatus;

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(LocalDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

}
