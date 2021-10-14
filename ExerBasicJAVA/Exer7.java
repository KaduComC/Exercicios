package ExerBasicJAVA;

import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idadeAno = 0, idadeMes = 0, idadeDia = 0, idadeEmDias;

        System.out.println("Informe sua idade em anos: ");
        idadeAno = ler.nextInt();

        System.out.println("Informe sua idade em meses: ");
        idadeMes = ler.nextInt();

        System.out.println("Informe sua idade em dias: ");
        idadeDia = ler.nextInt();

        idadeAno = idadeAno * 365;
        idadeMes = idadeMes * 30;

        idadeEmDias = idadeAno + idadeMes + idadeDia;
        System.out.println(idadeEmDias);

        ler.close();
    }
}

/**
    * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
    * dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o
    * mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/