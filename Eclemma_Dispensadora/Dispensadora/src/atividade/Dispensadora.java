package atividade;


public class Dispensadora {
    private int[] cedulasDisponiveis; // Quantidade de cédulas disponíveis para cada valor
    public static final int[] VALORES_CEDULAS = {100, 50, 20, 10, 5, 2}; // Valores das cédulas, em ordem decrescente

    public Dispensadora(int[] cedulasInicial) {
        if (cedulasInicial.length != VALORES_CEDULAS.length) {
            throw new IllegalArgumentException("Quantidade inicial de cédulas inválida.");
        }
        this.cedulasDisponiveis = cedulasInicial;
    }

    public int[] dispensar(double valor) throws NaoEhPossivelDispensarValorException {
        int[] cedulasUsadas = new int[VALORES_CEDULAS.length];
        int valorRestante = (int) valor;

        if (valorRestante >= 100 && cedulasDisponiveis[0] > 0) {
            int quantidadeNecessaria = valorRestante / 100;
            int quantidadeUsada = Math.min(quantidadeNecessaria, cedulasDisponiveis[0]);
            cedulasUsadas[0] = quantidadeUsada;
            cedulasDisponiveis[0] -= quantidadeUsada;
            valorRestante -= quantidadeUsada * 100;
        }

        if (valorRestante >= 50 && cedulasDisponiveis[1] > 0) {
            int quantidadeNecessaria = valorRestante / 50;
            int quantidadeUsada = Math.min(quantidadeNecessaria, cedulasDisponiveis[1]);
            cedulasUsadas[1] = quantidadeUsada;
            cedulasDisponiveis[1] -= quantidadeUsada;
            valorRestante -= quantidadeUsada * 50;
        }

        if (valorRestante >= 20 && cedulasDisponiveis[2] > 0) {
            int quantidadeNecessaria = valorRestante / 20;
            int quantidadeUsada = Math.min(quantidadeNecessaria, cedulasDisponiveis[2]);
            cedulasUsadas[2] = quantidadeUsada;
            cedulasDisponiveis[2] -= quantidadeUsada;
            valorRestante -= quantidadeUsada * 20;
        }

        if (valorRestante >= 10 && cedulasDisponiveis[3] > 0) {
            int quantidadeNecessaria = valorRestante / 10;
            int quantidadeUsada = Math.min(quantidadeNecessaria, cedulasDisponiveis[3]);
            cedulasUsadas[3] = quantidadeUsada;
            cedulasDisponiveis[3] -= quantidadeUsada;
            valorRestante -= quantidadeUsada * 10;
        }

        if (valorRestante >= 5 && cedulasDisponiveis[4] > 0) {
            int quantidadeNecessaria = valorRestante / 5;
            int quantidadeUsada = Math.min(quantidadeNecessaria, cedulasDisponiveis[4]);
            cedulasUsadas[4] = quantidadeUsada;
            cedulasDisponiveis[4] -= quantidadeUsada;
            valorRestante -= quantidadeUsada * 5;
        }

        if (valorRestante >= 2 && cedulasDisponiveis[5] > 0) {
            int quantidadeNecessaria = valorRestante / 2;
            int quantidadeUsada = Math.min(quantidadeNecessaria, cedulasDisponiveis[5]);
            cedulasUsadas[5] = quantidadeUsada;
            cedulasDisponiveis[5] -= quantidadeUsada;
            valorRestante -= quantidadeUsada * 2;
        }

        if (valorRestante > 0) {
            throw new NaoEhPossivelDispensarValorException("Não é possível dispensar o valor solicitado com as cédulas disponíveis.");
        }

        return cedulasUsadas;
    }
}

@SuppressWarnings("serial")
class NaoEhPossivelDispensarValorException extends Exception {
	   public NaoEhPossivelDispensarValorException(String mensagem) {
	        super(mensagem);
	    }
	}