package com.lucas.restaurantedata.dao.impl.test;

/**
 * 
 */

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import com.lucas.restaurantedata.dao.impl.RestauranteDAOImpl;
import com.lucas.restaurantedata.entity.Menu;
import com.lucas.restaurantedata.entity.Restaurante;
import com.lucas.restaurantedata.entity.TipoRestaurante;

class RestauranteDAOImplTest {

	@Test
	void testGuardar() {
		//System.out.println("imprimir la primera prueba unitara junit");
		
		RestauranteDAOImpl restauranteDAOImpl = new RestauranteDAOImpl();
		
		Restaurante restaurante = new Restaurante();
		restaurante.setNombre("Restaurante Hiroshima");
		restaurante.setImagen("images.png");
		restaurante.setEstatus(true);
		restaurante.setFechaCreacion(LocalDateTime.now());
		
		TipoRestaurante tipoRestaurante = new TipoRestaurante();
		tipoRestaurante.setIdTipoRestaurante(20);
		restaurante.setTipoRestaurante(tipoRestaurante);
		
		Menu menu = new Menu();
		menu.setIdMenu(4);
		restaurante.setMenu(menu);
		
		int guardado = 0;
		try {
			//el primer caso EXITOSO! si guardado es > 0 
			guardado = restauranteDAOImpl.guardar(restaurante);
			assertTrue(guardado > 0);
			System.out.println("Se guardo exitosamente");
			
		} catch (SQLException e) {
			//Segundo caso no exitoso, no se guardo porque hubo un error
			assertTrue(guardado == 0);
			System.out.println("No se guardo");
			e.printStackTrace();
		}
	}

}
