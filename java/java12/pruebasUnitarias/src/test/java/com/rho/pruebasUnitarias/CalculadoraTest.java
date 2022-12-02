package com.rho.pruebasUnitarias;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Clase de prueba de calculadora")
public class CalculadoraTest {
	Calculadora calc = new Calculadora(true);
	
	@Test
	@DisplayName("Metodo que prueba si la suma es correcta")
	void pruebaSuma() {
		//Calculadora calc = new Calculadora(true);
		
		assertEquals(4, calc.suma(2, 2), "deberian ser 4");
	}
	@Test
	@DisplayName("probar si la calc esta prendida")
	void pruebaIsOn() {
		//Calculadora calc = new Calculadora(true);
		assertTrue(calc.isOn());
	}
	@Test
	@DisplayName("Prueba de division")
	void pruebadiv() {
		assertEquals(1.5, calc.division(3, 2), "deberian ser 1.5");
	}
	

}
