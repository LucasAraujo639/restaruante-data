/**
 * 
 */
package com.lucas.restaurantedata.enums;

/**
 * @author lucas
 * Enumeracion que contiene los codigos de error del aplicativo.
 */
public enum CodigoEnum {
	
	SINTAXIS_SQL_ERROR_CODE(100); //variable con mayuscula es CONSTANTE
	private int code;
	
	/**
	 * Constructor privado default de enumeracion
	 * @param code
	 */
	CodigoEnum(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}  
}
