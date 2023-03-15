package com.lucas.restaurantedata.connection;
/**
 * @author lucas
 * Clase que se encarga de realizar la configuracion, la conexion y habilitar la transacciones
 * de una base de datos
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
	/**
	 * propiedad Connection y nombre, indica si tiene conexion habilitada o desabhilitada
	 */
	private static Connection connection; 
	
	private static Statement statement;
	
	
	/**
	 * Metodo que nos permite conectar a la base de datos
	 * @return objeto connection con la informacion de la base de datos conectada || null
	 * @throws ClassNotFoundException Excepcion generada al no cargar el driver de conexion
	 * @SQLException excepcion generada al no conectarse a la base de datos
	 */
	public static Connection conectar() throws ClassNotFoundException, SQLException {
		
		//Paso 1: Cargar el driver de conexion
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Paso 2: Establecer los datos de conexion
		String url = "jdbc:mysql://localhost:3306/restaurante?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user = "root";
		String password = "Rracing159753*";
		
		//Paso 3: Establecer la conexion
		connection = DriverManager.getConnection(url,user,password);
		statement = connection.createStatement(); //habilitando proceso para ejecutar sentencias SQL
		return connection;
		}
	
	
	/**
	 * Permite ejecutar sentencias INSERT, UPDATE y DELETE
	 * @param sql parametro con la sentencia a ejecutarse
	 * @return 1 en caso de ser exitoso, 0 en caso de error
	 * @throws SQLException Excepcion ejecutada en caso de error al ejecutar la sentencia SQL
	 */
	public static int ejecutarSQL(String sql) throws SQLException {
	System.out.println("Query " + sql); //Query puede ser un delete, insert, etc
	return statement.executeUpdate(sql);
	}
	
	/**
	 * Permite ejecutar sentencias SELECT
	 * @param sql parametro con la sentencia a ejecutarse
	 * @return objeto con formacion obtenida de la sentencia SELECT
	 * throws SQLException Excepcion ejecutada en caso de error al ejecutar la sentencia SQL
	 */
	public static ResultSet ejecutarSQLSelect(String sql) throws SQLException {
		System.out.println("Query " + sql);
		return statement.executeQuery(sql);
	}	
}


