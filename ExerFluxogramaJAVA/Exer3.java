package ExerFluxogramaJAVA;

import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor = 7;
        int auxiliar = valor;

        while (valor > 1) {
            auxiliar = auxiliar * (valor - 1);
            valor--;
        }
        System.out.println(auxiliar);
        ler.close();
    }
}

/**
    * Escrever um algoritmo que lê um valor inteiro, calcula o fatorial desse
    * número e mostra o resultado.
*/