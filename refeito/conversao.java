package refeito;

class conversao {
    public static double litroParaCentimetroCubico(double unidadeLC) {
        double result = unidadeLC * 1000;
        return result;
    }

    public static double metroCubicoParaLitros(double unidadeML) {
        double result = unidadeML * 1000;
        return result;
    }

    public static double metroCubicoParaPesCubicos(double unidadeMP) {
        double result = unidadeMP * 35.32;
        return result;
    }

    public static double galaoAmericanoParaPolegadasCubicas(double unidadeGP) {
        double result = unidadeGP * 231;
        return result;
    }

    public static double galaoAmericanoParaLitros(double unidadeGL) {
        double result = unidadeGL * 3.785;
        return result;
    }
}
