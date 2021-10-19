package ExerFluxogramaJAVA;

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor;

        System.out.println("Informe valor diferente de 0: ");
        valor = ler.nextInt();

        if (valor > 0) {
            System.out.println("O valor é positivo");
        } else if (valor < 0) {
            System.out.println("O valor é negativo");
        }

        ler.close();
    }
}

/**
    * Crie um algoritmo que leia um número diferente de zero e diga se este número
    * é positivo ou negativo.
*/