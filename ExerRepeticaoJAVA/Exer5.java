package ExerRepeticaoJAVA;

import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor, soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Valor: ");
            valor = ler.nextInt();
            soma += valor;
        }

        System.out.println(soma);

        ler.close();
    }
}

/**
    * Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
    * números.
*/