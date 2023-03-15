package com.lucas.restaurantedata.entity;
/**
 * @author lucas MAPEO
 * Clase que representa una entidad de la clase menu de la base de datos
 */
public class Menu extends CommonEntity{ //CommonEntity es una superclass
	
	/**
	 * Identificador del menu
	 */
	private int idMenu;
	
	
	/**
	 * Clave del menu
	 */
	private String clave;
	
	private String descripcion;

	public int getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
