public class Coordenadores extends FuncionariosUniversidade{

    public int professoresSupervisionados;

    public Coordenadores(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);

    }
    public Coordenadores(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario, int professoresSupervisionados) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public int getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(int professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    private double salario(){
        return getSalario() * 0.05;

    }
}

