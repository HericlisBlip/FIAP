import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteCalculadoraSubtrair {

	@Test
	public void testeSubtrai13com55() {
		int numero1 = 13;
		int numero2 = 55;
		int numeroResultanteEsperado = -42;
		
		Calculadora cal = new Calculadora();
		int numeroResultanteReal =cal.subtrair(numero1, numero2);
		assertEquals(numeroResultanteEsperado, numeroResultanteReal);
	}
	
	@Test
	public void testeSubtrai32com15() {
		int numero1 = 32;
		int numero2 = 15;
		int numeroResultanteEsperado = 17;
		
		Calculadora cal = new Calculadora();
		int numeroResultanteReal =cal.subtrair(numero1, numero2);
		assertEquals(numeroResultanteEsperado, numeroResultanteReal);
	}
	@Test
	public void testeSubtrai136com11() {
		int numero1 = 136;
		int numero2 = 11;
		int numeroResultanteEsperado = 125;
		
		Calculadora cal = new Calculadora();
		int numeroResultanteReal =cal.subtrair(numero1, numero2);
		assertEquals(numeroResultanteEsperado, numeroResultanteReal);
	}
}
