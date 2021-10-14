package ExerRepeticaoJAVA;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, numerosEntre = 0;

        for(int i = 1; i <= 5; i++) {
            System.out.println("Numero: ");
            numero = ler.nextInt();
            if(numero >= 0 && numero <= 100) {
                numerosEntre++;
            } 
        }

        System.out.println(numerosEntre);

        ler.close();
    }
}

/**
    * Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão
    * entre 0 e 100.
*/