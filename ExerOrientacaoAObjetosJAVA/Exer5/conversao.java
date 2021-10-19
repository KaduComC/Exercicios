package ExerOrientacaoAObjetosJAVA.Exer5;

public class conversao {
    public static void main(String[] args) {
        System.out.println("" + litroParaCentimetroCubico(20));
        System.out.println("\n" + metroCubicoParaLitros(20));
        System.out.println("\n" + metroCubicoParaPesCubicos(20));
        System.out.println("\n" + galaoAmericanoParaPolegadasCubicas(20));
        System.out.println("\n" + galaoAmericanoParaLitros(20));

    }

    private static double litroParaCentimetroCubico(double unidadeLC) {
        double result = unidadeLC * 1000;
        return result;
    }

    private static double metroCubicoParaLitros(double unidadeML) {
        double result = unidadeML * 1000;
        return result;
    }

    private static double metroCubicoParaPesCubicos(double unidadeMP) {
        double result = unidadeMP * 35.32;
        return result;
    }

    private static double galaoAmericanoParaPolegadasCubicas(double unidadeGP) {
        double result = unidadeGP * 231;
        return result;
    }

    private static double galaoAmericanoParaLitros(double unidadeGL) {
        double result = unidadeGL * 3.785;
        return result;
    }

}
