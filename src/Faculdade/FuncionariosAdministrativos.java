package Faculdade;

public class FuncionariosAdministrativos extends FuncionariosUniversidade {

    private String funcaoAdministrativa;
    private String senioridade;


    public FuncionariosAdministrativos(String nome, String cpf, String numeroRegistro, String orgaoLotacao, Salario salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
    }

    @Override
    public void aumentarSalario() {
        double novoSalario = getRemuneracao().getValor() * 0.10;
        setRemuneracao(new Remuneracao(novoSalario));

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