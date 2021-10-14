package ExerBasicJAVA;

import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salarioMinimo = 788.00, salarioDoUsuario, quantidade;

        System.out.println("Informe seu salario: ");
        salarioDoUsuario = ler.nextDouble();

        quantidade = salarioDoUsuario / salarioMinimo;
        System.out.println(quantidade);

        ler.close();
    }
}

/**
    * Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de
    * um usuário, calcule a quantidade de salários mínimos esse usuário ganha e
    * imprima o resultado. (1SM=R$788,00)
*/