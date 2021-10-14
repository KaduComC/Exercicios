package ExerRepeticaoJAVA;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valorUsuario = 0, soma = 0;

        while(valorUsuario >= 0) {
            System.out.println("Valor: ");
            valorUsuario = ler.nextInt();

            if(valorUsuario >= 0){
                soma += valorUsuario;
                //System.out.println(soma);
            } else {
                System.out.println("Execução encerrada\n\n");
            }

        }
        System.out.println("Soma: " + soma);
        ler.close();
    }
}

/**
    * Escreva um algoritmo que leia uma sequência de números do usuário e realize a
    * soma desses números. Encerre a execução quando um número negativo for digitado.
*/