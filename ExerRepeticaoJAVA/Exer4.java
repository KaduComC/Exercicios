package ExerRepeticaoJAVA;

import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int valor;

        System.out.println("Nome: ");
        nome = ler.next();
        System.out.println("informe um valor: ");
        valor = ler.nextInt();

        for(int i = 1; i <= valor; i++) {
            System.out.println("N "+i+"º: "+nome);
        }

        ler.close();
    }
}

/**
    * Leia o nome um número do usuário um número N e escreva o nome dele na tela N
    * vezes.
*/