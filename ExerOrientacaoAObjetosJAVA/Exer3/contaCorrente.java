package ExerOrientacaoAObjetosJAVA.Exer3;

public class contaCorrente {
    private double saldo = 500;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0.00) {
            this.saldo = 0;
        }else {
            this.saldo = saldo;
        }
    }

    public void depositaValor(double deposita) {
        this.setSaldo(this.getSaldo() + deposita);
    }

    public boolean sacaValor(double saca) {
        double taxaValor = saca * 0.005;
        if(this.getSaldo() >= (saca = taxaValor)) {
            this.setSaldo(this.getSaldo() - saca - taxaValor);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Saldo: " + this.saldo;
    }
}
