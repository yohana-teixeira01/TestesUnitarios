package diretor;

import model.Aluno;
import model.Disciplinas;
import model.Professor;

public class Diretor {

    private long matricula = 000;
    private String nome = "Jorge";

    public void cadastrarProfessor() {
        String nome = "Ivan";
        long matricula = 001;
        double salario = 3.000;
        String disciplina = "Teste De Software";

        Professor professor = new Professor();

        professor.setNome(nome);
        professor.setMatricula(matricula);
        professor.setSalario(salario);
        professor.setDisciplina(disciplina);
    }

    public void cadastrarAluno() {

        String nome = "Yohana";
        long matricula = 002;
        double mensalidade = 1.900;
        String disciplina = "Teste De Software";

        Aluno aluno = new Aluno();

        aluno.setNome(nome);
        aluno.setMatricula(matricula);
        aluno.setMensalidade(mensalidade);
        aluno.setDisciplina(disciplina);

    }

    public void cadastroDisciplina() {

        String materia = "Testes De Software";

        Disciplinas disciplinas = new Disciplinas();

        disciplinas.setMateria(materia);

        if (materia != "Testes De Software"){
            throw new IllegalArgumentException("Disciplina não Cadastrada");
        }

    }
}
