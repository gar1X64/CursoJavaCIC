package es.cic.bootcamp.ejercicio001;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
 @BeforeEach
 void setUp() throws Exception{
	 
 }
 @Test
 void testSumar() {
	 Calculadora calculadora = new Calculadora();
	 
	 int resultado = calculadora.sumar(4,5);
	 
	 assertEquals(9, resultado, "la suma es correcta");
	 }
}
