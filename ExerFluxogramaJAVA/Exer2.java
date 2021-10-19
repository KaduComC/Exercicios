package ExerFluxogramaJAVA;

import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double nota1, nota2, nota3;
        double mediaPonderada, mediaAritmetica;
        int opcao;

        System.out.println("Escolha:\n1 para média aritmética\n2 para média ponderada");
        opcao = ler.nextInt();

        System.out.println("Informe a primeira nota: ");
        nota1 = ler.nextDouble();
        System.out.println("Informe a segunda nota: ");
        nota2 = ler.nextDouble();
        System.out.println("Informe a terceira nota: ");
        nota3 = ler.nextDouble();

        switch (opcao) {
            case 1:
            mediaAritmetica = (nota1 + nota2 + nota3) / 3;
            System.out.println("Sua média é: " + mediaAritmetica);
            break;

            case 2:
            mediaPonderada = ((nota1 * 3) + (nota2 * 3) + (nota3 * 4)) / 3;
            System.out.println("Sua média é: " + mediaPonderada);
            break;

            default:
            System.out.println("Opção invalida");
            break;
        }
        ler.close();
    }
}

/**
    * Um usuário deseja um algoritmo onde possa escolher que tipo de média deseja
    * calcular a partir de 3 notas. Faça um algoritmo que leia as notas, a opção
    * escolhida pelo usuário e calcule a média. 1 -aritmética 2 -ponderada (pesos:
    * 3,3,4)
*/