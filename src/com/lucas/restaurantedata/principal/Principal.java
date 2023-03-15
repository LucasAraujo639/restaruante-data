package com.lucas.restaurantedata.principal;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import java.sql.Connection;
import com.lucas.restaurantedata.connection.ConnectionFactory;
import com.lucas.restaurantedata.dao.impl.TipoRestauranteDAOImpl;
import com.lucas.restaurantedata.entity.TipoRestaurante;
import com.lucas.restaurantedata.myexceptions.RestauranteException;

/**
 * @author lucas
 * Clase principal para probar la conexion a la base de datos
 */
public class Principal {
	public static void main(String[] args) throws SQLException {
		/** try { LA CONEXION AHORA NO LO HAGO EN LA CLASE PRINCIPAL, LO HAGO EN TipoRestaurante 
			Connection conexionGenerada = ConnectionFactory.conectar(); // conexionGenerada guarda un objeto adentro 
			if(conexionGenerada != null) System.out.print("La conexion ha sido exitosa");
		} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		*/
		
		//::::::::::::::: PRUEBA INSERT ::::::::::::::
		
//		TipoRestauranteDAOImpl tipoRestauranteDAOImpl = new TipoRestauranteDAOImpl();
//		
//		TipoRestaurante tipoRestaurante = new TipoRestaurante();
//		
//		tipoRestaurante.setDescripcion("Griego");
//		tipoRestaurante.setFechaCreacion(LocalDateTime.now());
//		tipoRestaurante.setEstatus(true);
//		
//		
//		try {
//			int guardado = tipoRestauranteDAOImpl.guardar(tipoRestaurante);
//				
//			//Si el tipo de restaurante se guardo en la base de datos muestra este mensaje		
//			if(guardado > 0) {
//				System.out.println("El tipo de restaurante " + tipoRestaurante.getDescripcion() + " Fue guardado correctamente");}
//				else {System.out.println("Ocurrio un error al guardar el tipo de restaurante");	
//				
//			}
//		} catch (SQLException e) {
//			System.err.println("ERROR: " + e.getMessage());
//			e.printStackTrace();
//		}
		
		//::::::::::::: PRUEBA UPDATE ::::::::::::::::::
		
	TipoRestauranteDAOImpl tipoRestauranteDAOImpl = new TipoRestauranteDAOImpl();
//		
//		TipoRestaurante tipoRestaurante = new TipoRestaurante();
//		tipoRestaurante.setIdTipoRestaurante(29);
//		tipoRestaurante.setDescripcion("Japones");
//		tipoRestaurante.setFechaModificacion(LocalDateTime.now());
//		tipoRestaurante.setEstatus(false);
//		
//		try {
//			int guardado = tipoRestauranteDAOImpl.actualizar(tipoRestaurante);
//				
//			//Si el tipo de restaurante se guardo en la base de datos muestra este mensaje		
//			if(guardado > 0) {
//				System.out.println("El tipo de restaurante " + tipoRestaurante.getDescripcion() + " Fue actualizado correctamente");}
//				else {System.out.println("Ocurrio un error al actualizar el tipo de restaurante");	
//				
//			}
//		} catch (SQLException e) {
//			System.err.println("ERROR: " + e.getMessage());
//			e.printStackTrace();
//		}
		
		
		//:::::::: PRUEBA DELETE :::::::::::

		
//		try {
//			int eliminado = tipoRestauranteDAOImpl.eliminar(24);
//				
//			//Si el tipo de restaurante se elimino en la base de datos muestra este mensaje		
//			if(eliminado > 0) {
//				System.out.println(" Fue eliminado correctamente");}
//				else {System.out.println("Ocurrio un error al eliminar el tipo de restaurante");	
//				
//			}
//		} catch (SQLException e) {
//			System.err.println("ERROR: " + e.getMessage());
//			e.printStackTrace();
//		}
	
	//::::::::: PRUEBA SELECT :::::::::::
	
	try {//ACA ARREGLAR LO DE ERROR Y VER EL VIDEO QUE FALTA NUMERO 63
		
		List<TipoRestaurante> tiposConsultados = tipoRestauranteDAOImpl.consultar();
		
		for (TipoRestaurante tipoRestaurante : tiposConsultados) {
			System.out.println("ID: " + tipoRestaurante.getIdTipoRestaurante());
			System.out.println("Descripcion: " + tipoRestaurante.getDescripcion());
			System.out.println("ESTATUS: " + tipoRestaurante.isEstatus() + "\n");
			
		}
		
	} catch (SQLException e) {
		System.err.println("ERROR : " + e.getMessage());
		e.printStackTrace();
	} catch (RestauranteException e) {
		System.err.println(e.getErrorCode());
		e.printStackTrace();
	}
		}
	}

