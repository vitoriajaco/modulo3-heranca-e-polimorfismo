package Faculdade;

import java.util.List;

public class Coordenadores extends FuncionariosUniversidade {

    public List<Professores> professoresSupervisionados;


    public Coordenadores(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario, List<Professores> professoresSupervisionados) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.professoresSupervisionados = professoresSupervisionados;

    }

    public Salario aumentarSalario(Salario aumentarSalario) {
        return aumentarSalario;

    }
    public Salario reembolsoDespesas (Salario reembolsodespesa) {
        return reembolsodespesa;
    }


    public void adicionarProfessor(Professores professor){
        this.professoresSupervisionados.add(professor);
   }


    public List<Professores> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(List<Professores> professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    @Override
    public Salario aumentarSalario() {
        return null;
    }
}
