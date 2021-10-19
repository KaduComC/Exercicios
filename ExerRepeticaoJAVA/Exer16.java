package ExerRepeticaoJAVA;

import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao, numero = 0;

        System.out.println("Informe uma opção: \n1 para ordem crescente \n2 para ordem decrescente");
        opcao = ler.nextInt();

        System.out.println("Informe um numero: ");
        numero = ler.nextInt();

        if (opcao == 1) {
            for (int i = 0; i <= numero; i++) {
                System.out.println(i);
            }
        }
        if (opcao == 2) {
            for (int i = numero; i >= 0; i--) {
                System.out.println(i);
            }
        }
        ler.close();
    }
}

/**
    * Implemente um algoritmo que leia um número e uma opção de listagem. Com base
    * nessa opção, escreva a sequência dos números em ordem crescente (de zero até
    * o número) ou decrescente (do número até zero).  1 – CRESCENTE  2 -
    * DECRESCENTE
*/