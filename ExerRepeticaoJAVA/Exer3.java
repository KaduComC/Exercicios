package ExerRepeticaoJAVA;

import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;

        System.out.println("Nome: ");
        nome = ler.next();

        for(int i = 1; i <= 9; i++) {
            System.out.println("N "+i+"º: "+nome);
        }

        ler.close();
    }
}

/**
    * Leia o nome do usuário e escreva o nome dele na tela 10 vezes. 
*/