package ExerCondicionaisJAVA;

import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int inteiro;

        System.out.println("Informe um numero inteiro entre 1 e 7: ");
        inteiro = ler.nextInt();

        switch (inteiro) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Valor ilegal");
        }
        ler.close();
    }
}

/**
    * Criar um algoritmo em PORTUGOL que leia o um número inteiro entre 1 e 7 e
    * escreva o dia da semana correspondente. Caso o usuário digite um número fora
    * desse intervalo, deverá aparecer uma mensagem informando que não existe dia
    * da semana com esse número.
*/