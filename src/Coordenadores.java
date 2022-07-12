public class Coordenadores extends FuncionariosUniversidade {

    public int professoresSupervisionados;

    public Coordenadores(String cpf, String numeroDeRegistro, String orgaoDeLotacao, Double salario) {
        super(cpf, numeroDeRegistro, orgaoDeLotacao, salario);
    }

    public int getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(int professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    @Override
    public double aumentasalario() {
        return aumentoSalario += getSalario() * 0.05;
    }

    {

    }
}
