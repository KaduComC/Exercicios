package ExerBasicJAVA;

import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double valorUnitarioPeça1 = 70.00, valorUnitarioPeça2 = 50.00, valorTotal;
        int porcentagemIPI = 5,
            quantidade1,
            quantidade2;

        int codigoPEca1 = 789456123, codigoPEca2 = 963852741;

        System.out.println("Valor do IPI: " + porcentagemIPI);
        System.out.println("Valor da peça 1: " + valorUnitarioPeça1);
        System.out.println("Valor da peça 2: " + valorUnitarioPeça2);
        System.out.println("Código da peça 1: " + codigoPEca1);
        System.out.println("Código da peça 2: " + codigoPEca2);

        System.out.println("Informe a quantida de peças 1: ");
        quantidade1 = ler.nextInt();

        System.out.println("Informe a quantida de peças 2: ");
        quantidade2 = ler.nextInt();

        valorTotal = (valorUnitarioPeça1 * quantidade1 + valorUnitarioPeça2 * quantidade2) * (porcentagemIPI / 100 + 1);
        System.out.println(valorTotal);

        ler.close();
    }
}

/**
    * Escrever um algoritmo que lê: - a porcentagem do IPI a ser acrescido no valor
    * das peças - o código da peça 1, valor unitário da peça 1, quantidade de peças
    * 1 - o código da peça 2, valor unitário da peça 2, quantidade de peças 2 O
    * algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
    * Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
*/