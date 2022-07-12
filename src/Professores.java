public class Professores extends FuncionariosUniversidade {

    public String nivelGraduacao;
    public String disciplinaMinistrada;
    public int quantidadeAlunos;
    public  int quantidadeTurmas;

    public Professores(String cpf, String numeroDeRegistro, String orgaoDeLotacao, Double salario) {
        super(cpf, numeroDeRegistro, orgaoDeLotacao, salario);

    }

    public Professores(String cpf, String numeroDeRegistro, String orgaoDeLotacao, Double salario, String nivelGraduacao, String disciplinaMinistrada, int quantidadeAlunos, int quantidadeTurmas) {
        super(cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantidadeAlunos = quantidadeAlunos;
        this.quantidadeTurmas = quantidadeTurmas;
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public int getQuantidadeTurmas() {
        return quantidadeTurmas;
    }

    public void setQuantidadeTurmas(int quantidadeTurmas) {
        this.quantidadeTurmas = quantidadeTurmas;
    }
}
