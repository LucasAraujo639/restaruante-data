/**
 * 
 */
package com.lucas.restaurantedata.dao.impl;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lucas.restaurantedata.connection.ConnectionFactory;
import com.lucas.restaurantedata.dao.TipoRestauranteDAO;
import com.lucas.restauranteentities.entity.TipoRestaurante;
import com.lucas.restaurantedata.enums.CodigoEnum;
import com.lucas.restaurantedata.myexceptions.RestauranteException;

/**
 * @author lucas
 * Clase que implementa el CRUD y otros elementos personalizados de transacciones a la base de datos en la tabla tipo_restaurante
 */
public class TipoRestauranteDAOImpl implements TipoRestauranteDAO {
	
	//Bloque static{} se ejecuta primero que todos
	static {
		try {
			ConnectionFactory.conectar();
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.err.println("Error de base de datos: " + e.getMessage() );
		}
	}
	
	@Override
	public int guardar(TipoRestaurante tipoRestaurante) throws SQLException {
		String sql = "INSERT INTO tipo_restaurante (descripcion, fechaCreacion, estatus) VALUES('"+ tipoRestaurante.getDescripcion() +"','"+ tipoRestaurante.getFechaCreacion() +"',"+ tipoRestaurante.isEstatus() +");";
		
		//invoco el metodo de ConnectionFactory
		int ejecutado = ConnectionFactory.ejecutarSQL(sql);  //en ejecutado va a ser 1 si se guarda, y 0 si no se guarda
		
		return ejecutado;
	}

	@Override
	public int actualizar(TipoRestaurante tipoRestaurante) throws SQLException {
		String sql = "UPDATE tipo_restaurante set descripcion = '"+ tipoRestaurante.getDescripcion() +"' , fechaModificacion = '"+ tipoRestaurante.getFechaModificacion() +"' , estatus = "+ tipoRestaurante.isEstatus() +" WHERE idTipoRestaurante = "+ tipoRestaurante.getIdTipoRestaurante() +";";
		
		//invoco el metodo de ConnectionFactory
		int ejecutado = ConnectionFactory.ejecutarSQL(sql);  //en ejecutado va a ser 1 si se guarda, y 0 si no se guarda
		
		return ejecutado;
	}

	public int eliminar(int idTipoRestaurante) throws SQLException {
		
		String sql = "DELETE FROM tipo_restaurante WHERE idTipoRestaurante = "+ idTipoRestaurante +";";
		
		//invoco el metodo de ConnectionFactory
		int ejecutado = ConnectionFactory.ejecutarSQL(sql);  //en ejecutado va a ser 1 si se guarda, y 0 si no se guarda
		
		return ejecutado;
	}

	@Override
	public List<TipoRestaurante> consultar() throws SQLException, RestauranteException  {
		String sql = "SELECT * FROM restaurante.tipo_restaurante order by descripcion;";
		ResultSet rs = null;
		try {
			rs = ConnectionFactory.ejecutarSQLSelect(sql);
		} catch (Exception e) {
			throw new RestauranteException("Error de sintaxis en la sentencia " + sql, CodigoEnum.SINTAXIS_SQL_ERROR_CODE);
		}
		
		List<TipoRestaurante> tiposRestaurante = new ArrayList<TipoRestaurante>();
		
		//Verifico si el objeto ResultSet viene con infromacion
		if(rs != null) {
			while (rs.next()) {
				TipoRestaurante tipoRestaurante = new TipoRestaurante();
				tipoRestaurante.setIdTipoRestaurante(rs.getInt("idTipoRestaurante")); //recomendable usar el nombre de los campos como idtiporestaurante
				tipoRestaurante.setDescripcion(rs.getString("descripcion"));
				tipoRestaurante.setFechaCreacion(rs.getTimestamp("fechaCreacion").toLocalDateTime());
		 
				tipoRestaurante.setFechaModificacion(rs.getTimestamp("fechaModificacion") != null ? rs.getTimestamp("fechaModificacion").toLocalDateTime() : null);
				
				tipoRestaurante.setEstatus(rs.getBoolean("estatus"));
				
				tiposRestaurante.add(tipoRestaurante);
			}
		}
		return tiposRestaurante;
	}

	@Override // me falto ver este video numero 63
	public TipoRestaurante consultarPorId(int IdTipoRestaurante) {
		// TODO Auto-generated method stub
		return null;
	}

}
