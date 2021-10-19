package ExerOrientacaoAObjetosJAVA.Exer1;

public class empresa {
    private String nome;
    private String CNPJ;
    private departamento[] departamentos = new departamento[10];
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }
    public departamento[] getDepartamentos() {
        return departamentos;
    }
    public void addDepartamentos(departamento[] departamentos) {
        
    }

    
}
