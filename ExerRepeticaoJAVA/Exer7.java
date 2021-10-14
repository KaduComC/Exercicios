package ExerRepeticaoJAVA;

import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, soma = 0, media = 0;

        for(int i = 1; i <= 20; i++) {
            System.out.println("Idade: ");
            idade = ler.nextInt();
            soma += idade;
            media  = soma / 20;
        }

        System.out.println(media);

        ler.close();
    }
}

/**
    * Leia a idade de 20 pessoas e exiba a média das idades.
*/