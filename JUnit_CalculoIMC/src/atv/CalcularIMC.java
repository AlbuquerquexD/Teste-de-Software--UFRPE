package atv;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcularIMC {
    public String IMC(float altura, float peso) {
        if (altura <= 0 || peso <= 0) {
            throw new IllegalArgumentException("Altura e peso devem ser maiores que zero.");
        }

        // Cálculo do IMC
        float imc = peso / (altura * altura);

        // Retorna a classificação baseada no IMC
        if (imc < 18.5) {
            return "MAGREZA";
        } else if (imc <= 24.9) {
            return "NORMAL";
        } else if (imc <= 29.9) {
            return "SOBREPESO";
        } else if (imc <= 39.9) {
            return "OBESIDADE";
        } else {
            return "OBESIDADE GRAVE";
        }
    }
}
