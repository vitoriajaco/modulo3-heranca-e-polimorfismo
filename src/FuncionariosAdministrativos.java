public class FuncionariosAdministrativos extends FuncionariosUniversidade{

    public String funcaoAdministrativa;
    public String senioridade;

    public FuncionariosAdministrativos(String cpf, String numeroDeRegistro, String orgaoDeLotacao, Double salario) {
        super(cpf, numeroDeRegistro, orgaoDeLotacao, salario);

    }

    @Override
    public double aumentasalario() {
        return 0;
    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }
}
