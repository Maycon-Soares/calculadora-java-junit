package exercicio4_Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;



public class CalculadoraTest {
	Calculadora calc = new Calculadora();
	@Test
	public void testSoma() {
	    double resultado = calc.Soma(5,10);
	    assertEquals(15, resultado,0);
				
	}


	@Test
	public void testSubtracao() {
		double resultado = calc.Subtracao(10,5);
	    assertEquals(5, resultado,0);
	}

	@Test
	public void testDivisao() {
		double resultado = calc.Divisao(10,10);
	    assertEquals(1, resultado,0);
	}

	@Test
	public void testMultiplicacao() {
		double resultado = calc.Multiplicacao(5,10);
	    assertEquals(50, resultado,0);
	}

	@Test
	public void testPotenciacao() {
		double resultado = calc.Potenciacao(4,2);
	    assertEquals(16, resultado,0);
	}

}
