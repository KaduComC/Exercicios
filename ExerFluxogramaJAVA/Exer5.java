package ExerFluxogramaJAVA;

import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numeroToal, numeroBranco = 5000, numeroNulo = 2000, numeroValido = 38000;
        double porcentagemBranco = 0, porcentagemNulo = 0, porcentagemValido = 0;

        numeroToal = numeroBranco + numeroNulo + numeroValido;
        porcentagemBranco = 100 * numeroBranco / numeroToal;
        porcentagemNulo = 100 * numeroNulo / numeroToal;
        porcentagemValido = 100 * numeroValido / numeroToal;

        System.out.println(numeroToal);
        System.out.println(porcentagemBranco);
        System.out.println(porcentagemNulo);
        System.out.println(porcentagemValido);

        ler.close();
    }
}

/**
    * Escreva um algoritmo para ler o número total de eleitores de um município, o
    * número de votos brancos, nulos e válidos. Calcular e escrever o percentual
    * que cada um representa em relação ao total de eleitores.
*/