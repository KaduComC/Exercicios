package ExerRepeticaoJAVA;

import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, soma = 0;

        for(int i = 1; i <= 20; i++) {
            System.out.println("Idade: ");
            idade = ler.nextInt();
            soma += idade;
        }

        System.out.println(soma);

        ler.close();
    }
}

/**
    * Leia a idade de 20 pessoas e exiba a soma das idades.
*/