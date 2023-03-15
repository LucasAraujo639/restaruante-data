package com.lucas.restaurantedata.dao;

import java.sql.SQLException;
import java.util.List;

import com.lucas.restaurantedata.entity.Restaurante;
import com.lucas.restaurantedata.myexceptions.RestauranteException;

/**
 * @author lucas
 *	Interfaz que porporciona CRUD para las transacciones hacia la base de datos en la tabla restuarante
 */
public interface RestauranteDAO {
	/**
	 * Metodo que permite guardar registros de tipo restaurante
	 * @param tipoRestaurante
	 * @return 1 en caso de ser exitoso, 0 en caso de no guardarlo
	 * @throws SQLException Excepcion generada en caso de error de la sentencia SQL.
	 */
	int guardar(Restaurante restaurante) throws SQLException;
	
	/**
	 * Metodo que permite actualizar registros de tipo restaurante
	 * @param idRestaurante
	 * @return 1 en caso de ser exitoso, 0 en caso de no actualizarlo
	 * @throws SQLException Excepcion generada en caso de error de la sentencia SQL.
	 */
	int actualizar(Restaurante restaurante) throws SQLException;
	
	
	/**
	 * Metodo que permite eliminar registros de tipo restaurante
	 * @param idRestaurante
	 * @return 1 en caso de ser exitoso, 0 en caso de no eliminarlo
	 * @throws SQLException Excepcion generada en caso de error de la sentencia SQL.
	 */
	int eliminar(Restaurante restaurante) throws SQLException;
	
	/**
	 * Metodo que permite consultar registros de restaurante
	 * @param restaurante
	 * @return 1 en caso de ser exitoso, 0 en caso de no eliminarlo
	 * @throws SQLException Excepcion generada en caso de error de la sentencia SQL.
	 * @throws RestauranteException excepcion personalizada que genera un mensaje mas especifico
	 */
	List<Restaurante> consultar() throws SQLException, RestauranteException;
	
	/**
	 * Metodo que permite consultar un registro de un tipo de restaurante por identificador
	 * @return Tipo de restaurante consultado | null
	 * 
	 */
	Restaurante consultarPorId(int IdTipoRestaurante);
}
