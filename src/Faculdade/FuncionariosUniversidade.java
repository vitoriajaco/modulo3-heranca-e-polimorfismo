package Faculdade;

public abstract class FuncionariosUniversidade {

    public String nome;
    private String cpf;
    private String numeroRegistro;
    private  String orgaoLotacao;
    private double salario;


    public static int aumentarTurma;

    public String aumentarProfessor;

    public static int numeroDeTurma;

    public FuncionariosUniversidade(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroRegistro = numeroRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String setAumentarProfessor(){
        System.out.println("Insira o nome do professor: ");
        return aumentarProfessor;
    }
}







