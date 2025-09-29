package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sesion2.Calculadora;

class CalculadoraTest
{
	@BeforeAll
	// El metodo se ejecuta antes del primer test 1 unica vez
	static void setUpBeforeClass() throws Exception
	{
		System.out.println("Before All");
	}

	@AfterAll
	// El metodo se ejecuta despues del ultimo test 1 unica vez
	static void tearDownAfterClass() throws Exception
	{
		System.out.println("After All");
	}

	@BeforeEach
	// El metodo se ejecuta antes de cada test
	void setUp() throws Exception
	{
		System.out.println("Before Each");
	}

	@AfterEach
	// El metodo se ejecuta despues de cada test
	void tearDown() throws Exception
	{
		System.out.println("After Each");
	}
	
	@Test
	void sumaTest()
	{
		int valorEsperado=3;
		int  v1=2;
		int  v2=1;
		int valorReal=Calculadora.suma(v1,v2);
		assertEquals(valorEsperado, valorReal);
	}
	
	@Test
	void restaTest()
	{
		int valorEsperado=3;
		int  v1=4;
		int  v2=1;
		int valorReal=Calculadora.resta(v1,v2);
		assertEquals(valorEsperado, valorReal);
	}
	
	@Test
	void multiplicacionTest()
	{
		int valorEsperado=6;
		int  v1=2;
		int  v2=3;
		int valorReal=Calculadora.multiplicacion(v1,v2);
		assertEquals(valorEsperado, valorReal);
	}
	
	@Test
	void divisionTest()
	{
		int valorEsperado=3;
		int  v1=6;
		int  v2=2;
		int valorReal=Calculadora.division(v1,v2);
		assertEquals(valorEsperado, valorReal);
	}
	
	@Test
	void divisionPorCeroTest()
	{
		int valorEsperado=-1;
		int  v1=6;
		int valorReal=Calculadora.division(v1,0);
		assertEquals(valorEsperado, valorReal);
	}

}
