package ExerCondicionaisJAVA;

import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int saldoMedio = 0;

        System.out.println("Informe o saldo medio: ");
        saldoMedio = ler.nextInt();
        
        if (saldoMedio >= 0 && saldoMedio <= 500) {
            System.out.println("Nenhum crédito");
        } else if (saldoMedio >= 501 && saldoMedio <= 1000) {
            System.out.println("30% do valor do saldo médio");
        } else if (saldoMedio >= 1001 && saldoMedio <= 3000) {
            System.out.println("40% do valor do saldo médio");
        } else if (saldoMedio >= 3001) {
            System.out.println("50% do valor do saldo médio");
        }

        ler.close();
    }
}

/**
    * A CEF concederá um crédito especial com juros de 2% aos seus clientes de acordo com
    * o saldo médio no último ano. Fazer um algoritmo em PORTUGOL que leia o saldo
    * médio de um cliente e calcule o valor do crédito de acordo com a tabela a seguir.
    * Imprimir uma mensagem informando o saldo médio e o valor de crédito.
*/