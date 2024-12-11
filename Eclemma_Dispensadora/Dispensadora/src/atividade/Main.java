package atividade;

public class Main {

	public static void main(String[] args) {
		
        // Exemplo de uso
        int[] cedulasInicial = {10, 10, 10, 10, 10, 10}; // Inicializando com 10 cédulas de cada valor
        Dispensadora dispensadora = new Dispensadora(cedulasInicial);

        try {
            int[] resultado = dispensadora.dispensar(100); // Exemplo que não pode ser atendido
            System.out.println("Cédulas usadas: ");
            for (int i = 0; i < resultado.length; i++) {
                System.out.println(dispensadora.VALORES_CEDULAS[i] + " reais: " + resultado[i] + " cédulas");
            }
        } catch (NaoEhPossivelDispensarValorException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}


