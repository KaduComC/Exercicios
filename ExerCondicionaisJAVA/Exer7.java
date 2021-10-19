package ExerCondicionaisJAVA;

import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;

        System.out.println("Informe um valor: ");
        numero = ler.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else if (numero % 2 == 1) {
            System.out.println("Impar");
        }

        ler.close();
    }
}

/**
    * Construa um algoritmo em PORTUGOL que determine (imprima) se um dado número N
    * inteiro (recebido através do teclado) é PAR ou ÍMPAR.
*/