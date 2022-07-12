public abstract class FuncionariosUniversidade {
    public static void main(String[] args) {

    }

    public String nome;
    private String cpf;
    private String numeroDeRegistro;
    private String orgaoDeLotacao;
    private Double salario;

    public double aumentoSalario;


    public FuncionariosUniversidade(String cpf, String numeroDeRegistro, String orgaoDeLotacao, Double salario) {
        this.cpf = cpf;
        this.numeroDeRegistro = numeroDeRegistro;
        this.orgaoDeLotacao = orgaoDeLotacao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(String numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getOrgaoDeLotacao() {
        return orgaoDeLotacao;
    }

    public void setOrgaoDeLotacao(String orgaoDeLotacao) {
        this.orgaoDeLotacao = orgaoDeLotacao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double aumentoSalario() {

        return aumentoSalario += salario * 0.10;

    }

    public abstract double aumentasalario();

}




