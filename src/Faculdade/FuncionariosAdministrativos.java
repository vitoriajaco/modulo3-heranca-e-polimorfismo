package Faculdade;

public class FuncionariosAdministrativos extends FuncionariosUniversidade{

public String funcaoAdministrativa;
public String senioridade;


    public FuncionariosAdministrativos(String nome, String cpf, String numeroRegistro, String orgaoLotacao, Salario salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
    }

    @Override
<<<<<<< HEAD
    public void aumentarSalario() {
        double novoSalario = getRemuneracao().getValor() * 0.10;
        setRemuneracao(new Remuneracao(novoSalario));
=======
    public Salario aumentarSalario() {
        return null;
    }
>>>>>>> f75e668b703e4389f33bb16b1d8428559e347c8a

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

    public FuncionariosAdministrativos(String nome, String cpf, String numeroRegistro, String orgaoLotacao, Salario salario, String funcaoAdministrativa, String senioridade) {
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
