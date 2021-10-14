package ExerRepeticaoJAVA;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, numerosPares = 0;

        for(int i = 1; i <= 20; i++) {
            System.out.println("Numero: ");
            numero = ler.nextInt();
            if(numero % 2 == 0) {
                numerosPares++;
            } 
        }

        System.out.println(numerosPares);

        ler.close();
    }
}

/**
    * Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
    * pares 
*/