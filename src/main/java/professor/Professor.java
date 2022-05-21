package professor;

import aluno.Aluno;
import disciplina.Disciplinas;

public class Professor {

    private double Salario = 5.000;

    private long matricula = 10;

    private String nome = "Leuson";

    private String disciplina = "Testes de Software";

    private String turma = "Sistemas Para Internet - 4 Periodo";

    public Professor() {
        super();
    }

    public Professor (double salario, long matricula, String nome, String disciplina, String turma) {
        Salario = salario;
        this.matricula = matricula;
        this.nome = nome;
        this.disciplina = disciplina;
        this.turma = turma;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void AtribuirNota(long matriculaAluno, String nomeDisciplina, double[] notas) throws Exception {

        Aluno aluno = new Aluno();

        if(matriculaAluno == aluno.getMatricula()){

            if(nomeDisciplina.equals("Testes de Software")){
                aluno.setNotas(notas);
            }

        } else {
            throw new Exception("Aluno nao existe!");
        }

    }

    public double VerSalario(long matriculaPro) throws Exception {

        double salario =  0;

        if (matriculaPro == matricula) {
            salario = getSalario();

            return salario;

        } else {
            throw new Exception("Error");
        }

    }

    public String TurmaCadastrada(long matricula) throws Exception {

        Disciplinas disciplinas = new Disciplinas();

        if(matricula == getMatricula()){
            return disciplinas.getMateria();
        } else {
            throw new Exception("Matricula não encontrada!");
        }

    }


}
