package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//import junit.framework.Assert;

class CalculadoraTestes {

//Soma
	@SuppressWarnigs("deprecation")
	@Test
	void SomaDeDoisNumPositivos() {
		OperacoesMatematicas calc = new OperacoesMatematicas();
		double resultado = calc.somar(1, 6);
		assertEquals(7, resultado);
	}
	@SuppressWarnigs("deprecation")
	@Test
	void SomaDeDoisNumUmPosiUmNeg() {
		OperacoesMatematicas calc = new OperacoesMatematicas();
		double resultado = calc.somar(1, -1);
		assertEquals(0, resultado);
	}
	@SuppressWarnigs("deprecation")
	@Test
	void SomaDeDoisNumUmPosiZero() {
		OperacoesMatematicas calc = new OperacoesMatematicas();
		double resultado = calc.somar(1, 0);
		assertEquals(1, resultado);
	}
	@SuppressWarnigs("deprecation")
	@Test
	void SomaDeDoisNumUmPosiUmDec() {
		OperacoesMatematicas calc = new OperacoesMatematicas();
		double resultado = calc.somar(1, 1.4);
		assertEquals(2.4, resultado);
	}
	@SuppressWarnigs("deprecation")
	@Test
	void SomaDeDoisZero() {
		OperacoesMatematicas calc = new OperacoesMatematicas();
		double resultado = calc.somar(0, 0);
		assertEquals(0, resultado);
	}
	@SuppressWarnigs("deprecation")
	@Test
	void SomaDeDoisNumNeg() {
		OperacoesMatematicas calc = new OperacoesMatematicas();
		double resultado = calc.somar(-3, -1);
		assertEquals(-4, resultado);
	}
	
//Subtração
	@SuppressWarnigs("deprecation")
	@Test
	void SubDeDoisNumPositivos() {
		OperacoesMatematicas calc = new OperacoesMatematicas();
		double resultado = calc.subtrair(1, 7);
		assertEquals(-6, resultado);
	}
	@SuppressWarnigs("deprecation")
	@Test
	void SubDeDoisNumPosiUmNeg() {
		OperacoesMatematicas calc = new OperacoesMatematicas();
		double resultado = calc.subtrair(-1, 1);
		assertEquals(-2, resultado);
	}
	@SuppressWarnigs("deprecation")
	@Test
	void SubDeDoisDec() {
		OperacoesMatematicas calc = new OperacoesMatematicas();
		double resultado = calc.subtrair( 1.4, 1.4);
		assertEquals(0, resultado);
	}
	@SuppressWarnigs("deprecation")
	@Test
	void SubDeDoisZero() {
		OperacoesMatematicas calc = new OperacoesMatematicas();
		double resultado = calc.subtrair(0, 0);
		assertEquals(0, resultado);
	}
	
//Multiplicação
	@SuppressWarnigs("deprecation")
	@Test
	void MultDeDoisNumPositivos() {
		OperacoesMatematicas calc = new OperacoesMatematicas();
		double resultado = calc.multiplicar(2, 7);
		assertEquals(14, resultado);
	}
	@SuppressWarnigs("deprecation")
	@Test
	void MultDeDoisNumPosiUmNeg() {
		OperacoesMatematicas calc = new OperacoesMatematicas();
		double resultado = calc.multiplicar(3, -2);
		assertEquals(-6, resultado);
	}
	@SuppressWarnigs("deprecation")
	@Test
	void MultDeDoisNumPosiZero() {
		OperacoesMatematicas calc = new OperacoesMatematicas();
		double resultado = calc.multiplicar(3, 0);
		assertEquals(0, resultado);
	}
	@SuppressWarnigs("deprecation")
	@Test
	void MultDeDoisNumPosiUmDec() {
		OperacoesMatematicas calc = new OperacoesMatematicas();
		double resultado = calc.multiplicar(3, 0.5);
		assertEquals(1.5, resultado);
	}

//Divisão
	@SuppressWarnigs("deprecation")
	@Test
	void DivtDeDoisNumPositivos() {
		OperacoesMatematicas calc = new OperacoesMatematicas();
		double resultado = calc.dividir(8, 2);
		assertEquals(4, resultado);
	}
	@SuppressWarnigs("deprecation")
	@Test
	void MulttDeDoisNumPositivos() {
		OperacoesMatematicas calc = new OperacoesMatematicas();
		double resultado = calc.dividir(8, 2);
		assertEquals(4, resultado);
	}
	@SuppressWarnigs("deprecation")
	@Test
	void MulttDeDoisNumPosiPorZero() {
		OperacoesMatematicas calc = new OperacoesMatematicas();
		double resultado = calc.dividir(8, 0);
		assertEquals(0, resultado);
	}
	@SuppressWarnigs("deprecation")
	@Test
	void MulttDeNumPosiPorNumDec() {
		OperacoesMatematicas calc = new OperacoesMatematicas();
		double resultado = calc.dividir(1.5, 8);
		assertEquals(0.1875, resultado);
	}
	@SuppressWarnigs("deprecation")
	@Test
	void MulttDeDoisNumPosi() {
		OperacoesMatematicas calc = new OperacoesMatematicas();
		double resultado = calc.dividir(0, 8);
		assertEquals(0, resultado);
	}
	
	
}
