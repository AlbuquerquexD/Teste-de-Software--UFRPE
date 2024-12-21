package atividade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DispensadoraTest {

	    @Test
	    public void testConstrutorValido() {
	        int[] cedulasInicial1 = {10, 10, 10, 10, 10, 10};
	        Dispensadora dispensadora1 = new Dispensadora(cedulasInicial1);
	        assertNotNull(dispensadora1);
	    }
	    
	    @Test
	    public void testDispensarValorValido() throws NaoEhPossivelDispensarValorException {
	        int[] cedulasInicialTest2 = {10, 10, 10, 10, 10, 10};
	        Dispensadora dispensadora2 = new Dispensadora(cedulasInicialTest2);
	        int[] esperado = {1, 1, 1, 1, 1, 1}; // 1x100, 1x50, 1x20, 1x10, 1x5, 1x2 = 287 reais
	        int[] resultado = dispensadora2.dispensar(187);
	        assertArrayEquals(esperado, resultado);
	    }
	    
	    @Test 
	    public void TestValorRestanteInvalido () throws NaoEhPossivelDispensarValorException {
	    	int [] cedulasInicialTest3 = {10,10,10,10,10,10};
	    	Dispensadora dispensadora3 = new Dispensadora(cedulasInicialTest3);
	        assertThrows(NaoEhPossivelDispensarValorException.class, () -> {
	            dispensadora3.dispensar(188);  // Tentando dispensar 188, que não é possível com as cédulas fornecidas
	        });
	    }
	    
	    @Test
	    public void TestValorCedulasInvalida () throws IllegalArgumentException {
	    	int [] cedulasInicialTest4 = {10,10,10,10,10};
	    	assertThrows(IllegalArgumentException.class, () -> {
	    		 Dispensadora dispensadora4 = new Dispensadora(cedulasInicialTest4); //Colocando quantidade de cedulas menor que o valor esperado de entrada
	    		 dispensadora4.dispensar(188);	
	    	});
	    	
	    }
	    
    	@Test
    	public void TestCedulasZeradas () throws NaoEhPossivelDispensarValorException {
    		int [] cedulasIniciaisTest5 = {0,0,0,0,0,0};
    		Dispensadora dispensadora5 = new Dispensadora(cedulasIniciaisTest5);
    		assertThrows(NaoEhPossivelDispensarValorException.class, () -> {
    			dispensadora5.dispensar(187); // Cedulas zeradas, porém valores válidos. Para testar todas possibilidades dos comando de decisão.
    			
    		});
    	}
	    
    	@Test
    	public void TestValorBaixoCedulasValidas () throws NaoEhPossivelDispensarValorException {
    		int [] cedulasIniciaisTest6 = {10,10,10,10,10,10};
    		Dispensadora dispensadora6 = new Dispensadora(cedulasIniciaisTest6);
    		assertThrows(NaoEhPossivelDispensarValorException.class, () -> {
    			dispensadora6.dispensar(1);
    		})
    		
;    	}
}
