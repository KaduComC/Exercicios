import java.util.Scanner;

class NovaCOnta {
    double saldo = 2000;
    public void saca(double valor) {
        if(saldo < valor) {
            throw new IllegalArgumentException("Erro aqui");
        }
    }
}

public class testaLetra {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //System.out.println("Frase: ");
        //String frase = ler.nextLine();
        //System.out.println("\n");
        //System.out.println(frase.toUpperCase());
        new NovaCOnta().saca(3000);
        ler.close();
    }
}
