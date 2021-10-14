package ExerRepeticaoJAVA;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, numerosEntreCem = 0, numerosEntreDuzentos = 0, numerosAcimaDuzentos = 0;

        for(int i = 1; i <= 6; i++) {
            System.out.println("Numero: ");
            numero = ler.nextInt();
            if(numero >= 0 && numero <= 100) {
                numerosEntreCem++;
            } if(numero >= 101 && numero <= 200) {
                numerosEntreDuzentos++;
            } if(numero > 200) {
                numerosAcimaDuzentos++;
            }
        }

        System.out.println(numerosEntreCem + " entre 0 e 100");
        System.out.println(numerosEntreDuzentos + " entre 101 e 200");
        System.out.println(numerosAcimaDuzentos + " acima de 200");

        ler.close();
    }
}

/**
    * Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão
    * entre 0 e 100, quantos estão entre 101 e 200 e quantos são maiores de 200.
*/