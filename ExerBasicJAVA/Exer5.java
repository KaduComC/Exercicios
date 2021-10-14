package ExerBasicJAVA;

import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor = 0, sucessor, antecessor;

        System.out.println("Informe um valor: ");
        valor = ler.nextInt();
        sucessor = valor + 1;
        antecessor = valor - 1;
        System.out.println(sucessor);
        System.out.println(antecessor);

        ler.close();
    }
}

/**
    * Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
    * antecessor e seu sucessor.
*/