/**
 * 
 */
package com.lucas.restaurantedata.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.lucas.restaurantedata.connection.ConnectionFactory;
import com.lucas.restaurantedata.dao.RestauranteDAO;
import com.lucas.restauranteentities.entity.Restaurante;
import com.lucas.restauranteentities.entity.TipoRestaurante;
import com.lucas.restaurantedata.myexceptions.RestauranteException;

/**
 * @author lucas
 *Clase que implementa los metodos de CRUD de la interfaz restauranteDAO
 */
public class RestauranteDAOImpl implements RestauranteDAO {

	static {
		try {
			ConnectionFactory.conectar();
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.err.println("Error de base de datos: " + e.getMessage() );
		}
	}
	
	@Override
	public int guardar(Restaurante restaurante) throws SQLException {
		String sql = "INSERT INTO restaurante (nombre, imagen, slogan, idTipoRestaurante, fechaCreacion, estatus, idMenu)" +
			"VALUES ('"+ restaurante.getNombre() +"', '"+ restaurante.getImagen() +"', '', '"+ restaurante.getIdRestaurante() +"', '"+ restaurante.getFechaCreacion() +"', "+ restaurante.isEstatus() +", "+ restaurante.getMenu().getIdMenu() +");";
		//invoco el metodo de ConnectionFactory
		int ejecutado = ConnectionFactory.ejecutarSQL(sql);  //en ejecutado va a ser 1 si se guarda, y 0 si no se guarda
		
		return ejecutado;
	}

	@Override
	public int actualizar(Restaurante restaurante) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(Restaurante restaurante) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Restaurante> consultar() throws SQLException, RestauranteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurante consultarPorId(int IdTipoRestaurante) {
		// TODO Auto-generated method stub
		return null;
	}

}
