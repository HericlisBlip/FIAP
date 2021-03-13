import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculadoraSomas {

	@Test
	public void testeSoma13com55() {
		int numero1 = 13;
		int numero2 = 55;
		int numeroResultanteEsperado = 68;
		
		Calculadora cal = new Calculadora();
		int numeroResultanteReal =cal.somar(numero1, numero2);
		assertEquals(numeroResultanteEsperado, numeroResultanteReal);
	}

	@Test
	public void testeSoma32com15() {
		int numero1 = 32;
		int numero2 = 15;
		int numeroResultanteEsperado = 47;
		
		Calculadora cal = new Calculadora();
		int numeroResultanteReal =cal.somar(numero1, numero2);
		assertEquals(numeroResultanteEsperado, numeroResultanteReal);
	}
	@Test
	public void testeSoma136com11() {
		int numero1 = 136;
		int numero2 = 11;
		int numeroResultanteEsperado = 147;
		
		Calculadora cal = new Calculadora();
		int numeroResultanteReal =cal.somar(numero1, numero2);
		assertEquals(numeroResultanteEsperado, numeroResultanteReal);
	}
}
