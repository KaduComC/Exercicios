package ExerBasicJAVA;

public class Exer1 {
    public static void main(String[] args) {
        double media1, media2, mediaGeral, somaMedia;

        media1 = (8 + 9 + 7) / 3;
        media2 = (4 + 5 + 6) / 3;

        mediaGeral = (somaMedia = (int) (media1 + media2)) / 2;

        System.out.println(media1);
        System.out.println(media2);
        System.out.println(somaMedia);
        System.out.println(mediaGeral);
    }
}

/**
    * Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média
    * dos números 4, 5 e 6. A soma das duas médias. A média das médias.
*/