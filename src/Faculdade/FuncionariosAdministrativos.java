package Faculdade;

public class FuncionariosAdministrativos extends FuncionariosUniversidade{

public String funcaoAdministrativa;
public String senioridade;


    public FuncionariosAdministrativos(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
    }

    @Override
    public Salario aumentarSalario() {
        return null;
    }

    //
//    @Override
//    public Salario aumentarSalario() {
//        double novoSalario = getSalario() * 0.10;
//        setSalario(novoSalario);
//
//        return null;
//    }
    public Salario aumentarSalario(Salario aumentarsalario) {
    return aumentarSalario();

}
    public Salario reembolsoDespesas (Salario reembolsodespesa) {
        return reembolsodespesa;
    }

    public FuncionariosAdministrativos(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
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
