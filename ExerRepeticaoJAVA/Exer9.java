package ExerRepeticaoJAVA;

import java.util.Scanner;

public class Exer9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int indice = 4;
        String[] nome = new String[indice];
        int[] idade = new int[indice];
        int menorDeIdade = 100;
        String nomeDaMaisNova = " ";

        for(int i = 0; i < indice; i++) {
            System.out.println("Informe seu nome: ");
            nome[i] = ler.next();
            System.out.println("Informe sua idade: ");
            idade[i] = ler.nextInt();
        }
        
        for(int i = 0; i < indice; i++) {
            if(idade[i] < menorDeIdade) {
                menorDeIdade = idade[i];
                nomeDaMaisNova = nome[i];
            }
        }
        
        System.out.println(menorDeIdade + " " + nomeDaMaisNova);

        ler.close();
    }
}

/**
    *  Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.
*/