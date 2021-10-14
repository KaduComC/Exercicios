package ExerRepeticaoJAVA;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero =0, tabuada = 0;

        System.out.println("Informe um valor: ");
        numero = ler.nextInt();

        for(int i = 1; i<= 10; i++) {
            tabuada = i * numero;
            System.out.println(i + " * " + numero + " = " + tabuada);
        }

        ler.close();
    }
}

/**
    * Crie um algoritmo leia um número do usuário e exiba a sua tabuada de
    * multiplicação
*/