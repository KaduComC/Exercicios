package ExerFluxogramaJAVA;

public class Exer4 {
    public static void main(String[] args) {
        int valor1 = 2, valor2 = 3, auxiliar = 0;

        for (int i = 1; i <= valor2; i++) {
            auxiliar += valor1;
        }
        System.out.println(auxiliar);
    }
}

/**
    * Crie um algoritmo que recebe 2 números e multiplica o num1 pelo num2 através
    * de somas repetidas. (ex: 2 e 3 = 2 + 2 + 2)
*/