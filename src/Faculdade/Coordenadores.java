package Faculdade;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Coordenadores extends FuncionariosUniversidade {

    public List<Professores> professoresSupervisionados;


    public Coordenadores(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario, List<Professores> professoresSupervisionados) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.professoresSupervisionados = professoresSupervisionados;

    }

    @Override
    public void aumentarSalario() {
        double salarioNovo = getSalario() * 0.05;
        setSalario(salarioNovo);

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




//    private Set<Professores> nomelista = new HashSet<>();

//    public void adicionarProfessor(Professores professor){
//        this.professoresSupervisionados.add(professor);
//    }

//    public void professoresCoordenados() {
//        System.out.println("listaDeProfessoresCordenados: ");
//        for(Professores p:professoresSupervisionados){
//            System.out.println("Nome do professor supervisionado: " + p.getNome());
//
//        }
//
//    }
}
