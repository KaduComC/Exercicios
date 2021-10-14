package ExerRepeticaoJAVA;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, numeroMenorQueOito = 0;

        for(int i = 1; i <= 20; i++) {
            System.out.println("Numero: ");
            numero = ler.nextInt();
            if(numero < 8) {
                numeroMenorQueOito++;
            } 
        }

        System.out.println(numeroMenorQueOito);

        ler.close();
    }
}

/**
    * Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
    * maiores do que 8.
*/