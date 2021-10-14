package ExerRepeticaoJAVA;

import java.util.Scanner;

public class Exer8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, maiorDeIdade = 0;

        for(int i = 1; i <= 20; i++) {
            System.out.println("Idade: ");
            idade = ler.nextInt();
            if(idade > 18) {
                maiorDeIdade++;
            } 
        }

        System.out.println(maiorDeIdade);

        ler.close();
    }
}

/**
    * Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade. 
*/