package testaVeiculo;

class veiculo {
    public void liga() {
    }

    public void velocidade() {
    }
}

class helicoptero extends veiculo {
    @Override
    public void liga() {
        System.out.println("Ligando helicoptero");
    }

    @Override
    public void velocidade() {
        int ini = 20, fim = 30;
        int velocidadeF = ini + fim;
        System.out.println(velocidadeF);
    }
}

class carro extends veiculo {
    @Override
    public void liga() {
        System.out.println("Ligando carro");
    }
}

public class testaReescrita {
    public static void main(String[] args) {
        veiculo h1 = new helicoptero();
        h1.liga();
        h1.velocidade();

        veiculo c1 = new carro();
        c1.liga();
    }
}
