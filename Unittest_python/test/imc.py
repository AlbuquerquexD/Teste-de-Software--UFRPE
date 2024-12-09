class CalculoIMC:
    """
    Classe para calcular o IMC e retornar a classificação correspondente.
    """

    def calcular_imc(self, altura: float, peso: float) -> str:
        """
        Calcula o IMC com base na altura e peso e retorna a classificação correspondente.

        :param altura: Altura em metros.
        :param peso: Peso em quilogramas.
        :return: Uma string representando a classificação do IMC.
        """
        if altura <= 0 or peso <= 0:
            raise ValueError("Altura e peso devem ser maiores que zero.")

        # Cálculo do IMC
        imc = peso / (altura ** 2)

        # Retorna a classificação baseada no IMC
        if imc < 18.5:
            return "MAGREZA"
        elif imc < 25:
            return "NORMAL"
        elif imc < 30:
            return "SOBREPESO"
        elif imc < 40:
            return "OBESIDADE"
        else:
            return "OBESIDADE GRAVE"


# Testes da classe
if __name__ == "__main__":
    calculo = CalculoIMC()

    # Exemplos de teste
    print(calculo.calcular_imc(1.75, 50))  # Magreza