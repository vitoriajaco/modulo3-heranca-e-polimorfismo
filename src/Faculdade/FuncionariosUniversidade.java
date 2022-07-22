package Faculdade;

public abstract class FuncionariosUniversidade {

    public String nome;
    private String cpf;
    private String numeroRegistro;
    private  String orgaoLotacao;

    private Remuneracao remuneracao;

    public FuncionariosUniversidade(String nome, String cpf, String numeroRegistro, String orgaoLotacao, Remuneracao remuneracao) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroRegistro = numeroRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.remuneracao = remuneracao;
    }



    private void solicitarReembolso (double valor){
        System.out.println("Reembolso Solicitado");

    }


    public abstract void aumentarSalario();

    public abstract Salario aumentarSalario();


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

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public Remuneracao getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(Remuneracao remuneracao) {
        this.remuneracao = remuneracao;
    }


}







