package ExerCondicionaisJAVA;

import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double peso = 0, altura = 0, IMC = 0;

        System.out.println("Informe sua altura: ");
        altura = ler.nextDouble();
        System.out.println("Informe seu peso: ");
        peso = ler.nextDouble();

        IMC = peso / Math.pow(altura, 2);
        System.out.println(IMC + "\n\n");
        if (IMC < 20) {
            System.out.println("Abaixo do peso");
        } else if (IMC >= 20 && IMC < 25) {
            System.out.println("Peso normal");
        } else if (IMC >= 25 && IMC < 30) {
            System.out.println("Sobre peso");
        } else if (IMC >= 30 && IMC < 40) {
            System.out.println("Obeso");
        } else if (IMC >= 40) {
            System.out.println("Obseo morbido");
        }

        ler.close();
    }
}

/**
    * Construa um algoritmo de PORTUGOL para determinar se o indivíduo esta com um
    * peso favorável. Essa situação é determinada através do IMC (Índice de Massa
    * Corpórea), que é definida como sendo a relação entre o peso (PESO) e o
    * quadrado da Altura (ALTURA) do indivíduo
*/