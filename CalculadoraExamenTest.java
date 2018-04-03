import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraExamenTest {

	@Test
	public void testPotencia() {
		CalculadoraExamen calculadora = new CalculadoraExamen(3, 2);
		double numero = 7;
		double resul = calculadora.potencia();
		assertEquals(num, resul);
	}

	@Test
	public void testRestaTrue() {
		CalculadoraExamen calculadora = new CalculadoraExamen(7, 3);
		assertTrue(calculadora.resta());
	}
	
	@Test
	public void testRestaFalse() {
		CalculadoraExamen calculadora = new CalculadoraExamen(3, 7);
		assertFalse(calculadora.resta());
	}

}
