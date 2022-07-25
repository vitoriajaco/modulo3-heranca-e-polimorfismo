package Faculdade;

import java.util.List;

public class Coordenadores extends FuncionariosUniversidade {

    public List<Professores> professoresSupervisionados;

    // mudança no código


    public Coordenadores(String nome, String cpf, String numeroRegistro, String orgaoLotacao, Salario salario, List<Professores> professoresSupervisionados) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.professoresSupervisionados = professoresSupervisionados;

    }

    @Override
    public void aumentarSalario() {
        double salarioNovo = getRemuneracao().getValor()  * 0.05;

        setRemuneracao(new Salario(salarioNovo));

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


}
