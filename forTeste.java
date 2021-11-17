import java.util.Scanner;

public class forTeste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor: ");
        int valorTabuada = ler.nextInt();
        for(int i = 0, j = valorTabuada; i <= 10; i++) {
            System.out.println(i + " * " + j + " = " + i * j);
        }
        ler.close();
    }
}
