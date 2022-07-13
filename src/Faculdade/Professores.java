package Faculdade;

public class Professores extends FuncionariosUniversidade{

    public String nivelGraduacao;
    public String disciplinaMinistrada;
    public int quantidadeAlunos;
    public  int quantidadeTurmas;

    public Professores(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario, String nivelGraduacao, String disciplinaMinistrada, int quantidadeAlunos, int quantidadeTurmas) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantidadeAlunos = quantidadeAlunos;
        this.quantidadeTurmas = quantidadeTurmas;
    }

    public Professores(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);

    }

    @Override
    public void aumentarSalario() {
        double acrescimo =  getSalario() * 0.10;
        double salarioNovo = getSalario() + acrescimo;
        setSalario(salarioNovo);
    }

    public void adicionaTurma(){
        int quantidadeTurmas = getQuantidadeTurmas() + 1;
        setQuantidadeTurmas(quantidadeTurmas);
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public int getQuantidadeTurmas() {
        return quantidadeTurmas;
    }

    public void setQuantidadeTurmas(int quantidadeTurmas) {
        this.quantidadeTurmas = quantidadeTurmas;
    }

    public double salario(double salario){
        salario = getSalario() * 0.10;
        return salario;

    }

    public static int aumentarTurma(int i){
        return aumentarTurma = numeroDeTurma;
    }
}






