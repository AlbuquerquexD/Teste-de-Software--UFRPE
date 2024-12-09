from imc import CalculoIMC
import unittest

class TestCalculoIMC(unittest.TestCase):
    def setUp(self):
        self.calculo = CalculoIMC()

    def test_magreza(self):
        self.assertEqual(self.calculo.calcular_imc(1.75, 50), "MAGREZA")

    def test_normal(self):
        self.assertEqual(self.calculo.calcular_imc(1.75, 70), "NORMAL")

    def test_sobrepeso(self):
        self.assertEqual(self.calculo.calcular_imc(1.75, 80), "SOBREPESO")

    def test_obesidade(self):
        self.assertEqual(self.calculo.calcular_imc(1.75, 100), "OBESIDADE")

    def test_obesidade_grave(self):
        self.assertEqual(self.calculo.calcular_imc(1.75, 125), "OBESIDADE GRAVE")

if __name__ == "__main__":
    unittest.main()