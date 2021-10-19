package ExerOrientacaoAObjetosJAVA.Exer1;


public class departamento {
    private String nome;
    private funcionario[] funcionarios = new funcionario[100];
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public funcionario[] getFuncionarios() {
        return funcionarios;
    }
    public void addFuncionarios(funcionario[] funcionarios) {

    }
}
