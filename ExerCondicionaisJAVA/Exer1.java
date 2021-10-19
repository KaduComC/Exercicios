package ExerCondicionaisJAVA;

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor = 0;

        System.out.println("Informe um valor: ");
        valor = ler.nextInt();

        if(valor % 10 == 0) {
            System.out.println("Valor é divisivel por 10");
        }else if(valor % 5 == 0) {
            System.out.println("Valor é divisivel por 5");
        }else if(valor % 2 == 0) {
            System.out.println("Valor é divisivel por 2");
        }else {
            System.out.println("Valor não é divisivel por 10, 5 e 2");
        }

        ler.close();
    }
}

/**
    * Escreva um algoritmo em PORTUGOL que leia um número e informe se ele é
    * divisível por 10, por 5 ou por 2 ou se não é divisível por nenhum deles.
*/