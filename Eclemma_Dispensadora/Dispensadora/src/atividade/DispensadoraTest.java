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
	        int[] esperado = {2, 1, 1, 1, 1, 1}; // 2x100, 1x50, 1x20, 1x10, 1x5, 1x2 = 287 reais
	        int[] resultado = dispensadora2.dispensar(287);
	        assertArrayEquals(esperado, resultado);
	    }
	    
	    @Test 
	    public void TestValorRestanteInvalido () throws NaoEhPossivelDispensarValorException {
	    	int [] cedulasInicialTest3 = {10,10,10,10,10,10};
	    	Dispensadora dispensadora3 = new Dispensadora(cedulasInicialTest3);
	        assertThrows(NaoEhPossivelDispensarValorException.class, () -> {
	            dispensadora3.dispensar(288);  // Tentando dispensar 288, que não é possível com as cédulas fornecidas
	        });
	    }

}
