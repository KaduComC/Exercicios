package refeito;

import java.util.Scanner;

class princiapl {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valor;

        System.out.println("Informe o valor para conversão: ");
        valor = ler.nextDouble();

        double conversao1, conversao2, conversao3, conversao4, conversao5;
        conversao1 = conversao.litroParaCentimetroCubico(valor);
        conversao2 = conversao.metroCubicoParaLitros(valor);
        conversao3 = conversao.metroCubicoParaPesCubicos(valor);
        conversao4 = conversao.galaoAmericanoParaPolegadasCubicas(valor);
        conversao5 = conversao.galaoAmericanoParaLitros(valor);

        System.out.println("" + conversao1);
        System.out.println("\n" + conversao2);
        System.out.println("\n" + conversao3);
        System.out.println("\n" + conversao4);
        System.out.println("\n" + conversao5);

        ler.close();
    }
}
