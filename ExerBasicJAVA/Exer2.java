package ExerBasicJAVA;

import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double saldo = 0, reajuste;
        System.out.println("Saldo: ");
        saldo = ler.nextDouble();

        reajuste = (saldo + (0.01 * saldo));
        System.out.println(reajuste);

        ler.close();
    }
}

/**
    * Informar um saldo e imprimir o saldo com reajuste de 1%.
*/