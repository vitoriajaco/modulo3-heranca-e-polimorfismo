package Faculdade;

import java.util.List;

<<<<<<< HEAD
public class Professores extends FuncionariosUniversidade{
=======
public abstract class Professores extends FuncionariosUniversidade{
>>>>>>> f75e668b703e4389f33bb16b1d8428559e347c8a

    public String nivelGraduacao;
    public String disciplinaMinistrada;
    public int quantidadeAlunos;
    public  int quantidadeTurmas;

    public List<Estagiario> estagiarios;


    public Professores(String nome, String cpf, String numeroRegistro, String orgaoLotacao, Salario salario, String nivelGraduacao, String disciplinaMinistrada, int quantidadeAlunos, int quantidadeTurmas) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantidadeAlunos = quantidadeAlunos;
        this.quantidadeTurmas = quantidadeTurmas;
    }

    public Professores(String nome, String cpf, String numeroRegistro, String orgaoLotacao, Salario salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);

    }
    public List<Estagiario> estagiariosSupervisionados;

<<<<<<< HEAD
    public List<Estagiario> getEstagiarios() {
        return estagiarios;
    }

    public void setEstagiarios(Estagiario estagiario) {
        if(estagiarios.size() == 2) {
            System.out.println("Professor já tem capacidade maxima de estagiarios");
        } else {
            this.estagiarios.add(estagiario);
            System.out.println("Pode inserir mais estagiarios");
        }

    }

    @Override
    public void aumentarSalario() {
        double acrescimo =  getRemuneracao().getValor() * 0.10;
        double salarioNovo = getRemuneracao().getValor() + acrescimo;
        setRemuneracao(new Salario(salarioNovo));
    }


    public void adicionaTurma(){
        int quantidadeTurmas = getQuantidadeTurmas() + 1;
        setQuantidadeTurmas(quantidadeTurmas);
=======
    public void adicionarEstagiario(Estagiario estagiario){
        this.estagiariosSupervisionados.add(estagiario);
    }


    public List<Estagiario> getEstagiariosSupervisionados() {
        return estagiariosSupervisionados;
    }
    public Salario aumentarSalario(Salario aumentarsalario) {
        return aumentarSalario();

    }
    public Salario reembolsoDespesas (Salario reembolsodespesa) {
        return reembolsodespesa;
>>>>>>> f75e668b703e4389f33bb16b1d8428559e347c8a
    }


    public void adicionaTurma(Turma turma){

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

    public void setQuantidadeTurmas() {
        this.quantidadeTurmas = quantidadeTurmas;
    }


<<<<<<< HEAD
=======
    @Override
    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    public static int aumentarTurma(int i){
        return aumentarTurma = numeroDeTurma;
    }
>>>>>>> f75e668b703e4389f33bb16b1d8428559e347c8a
}






