package atv;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCalcularIMC {
	
	CalcularIMC calculo = new CalcularIMC();
	
	@Test
	void Test0() {
		String cal0 = calculo.IMC(1.65f, 40f);
		assertEquals(cal0, "MAGREZA");
	}	

	@Test
	void test1() {
		String cal1 = calculo.IMC(1.65f, 60f);
		
		assertEquals(cal1, "NORMAL");	
	}
	
	@Test
	void Test2() {
		String cal2 = calculo.IMC(1.65f, 80f);
		assertEquals(cal2, "SOBREPESO");
	}
	
	@Test
	void Test3() {
		String cal3 = calculo.IMC(1.65f, 200f);
		assertEquals(cal3, "OBESIDADE GRAVE");
	}
}
