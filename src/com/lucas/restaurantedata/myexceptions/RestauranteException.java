package com.lucas.restaurantedata.myexceptions;

import com.lucas.restaurantedata.enums.CodigoEnum;

/**
 * Excepcion personalizada para los errores ocasionados en restaurante
 * @author lucas
 *
 */
public class RestauranteException extends Exception {
	private int errorCode;
	public RestauranteException() {
		
	}
	/**
	 * Constructor sobrecargado que muestra el codigo y mensaje de error
	 * @param mensaje a mostrar al usuario
	 * @param codigoEnum codigo de error de la enumeracion
	 */
	public RestauranteException(String mensaje, CodigoEnum codigoEnum) {
		super(mensaje);
		this.errorCode = codigoEnum.getCode();
	}
	/**
	 * @return the errorCode
	 */
	public int getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
