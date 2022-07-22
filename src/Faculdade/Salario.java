package Faculdade;


public class Salario extends Remuneracao {

    public Salario(double valor) {
        super(valor);

    }

public class Salario {

    private double salario;

    public void salario(Professores professores) {
        salario = professores.getSalario() * 0.10;

    }

    public void aumentarSalario(Salario salario) {
        double novoSalario = salario.getSalario() * 0.10;
        setSalario(novoSalario);
    }

    public double bolsa(double bolsa){
        return bolsa;
    }

    public double reembolsoDespesas(double despesa){
        return despesa;
    }

    private void setSalario(double novoSalario) {
    }

    private double getSalario() {


        return 0;
    }

}
