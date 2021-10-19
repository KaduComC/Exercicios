package ExerOrientacaoAObjetosJAVA.Exer3;


public class conta {
    public static void main(String[] args) {
        contaCorrente contaC = new contaCorrente();
        System.out.println(contaC.toString());

        contaC.depositaValor(1000);
        
        System.out.println(contaC.toString());

        if(contaC.sacaValor(100)) {
            System.out.println(contaC.toString());
        }else {
            System.out.println("Não ha esse valor");
        }
        
    }
}
