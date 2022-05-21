package diretor;


import aluno.Aluno;
import disciplina.Disciplinas;
import professor.Professor;

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
            String turma = "Sistemas Para Intenert - 4 Período";

            Aluno aluno = new Aluno();

            aluno.setNome(nome);
            aluno.setMatricula(matricula);
            aluno.setMensalidade(mensalidade);
            aluno.setTurma(turma);

        }

        public boolean cadastroDisciplina () {

            Disciplinas disciplinas = new Disciplinas();

            String materia = "Testes de Software";

            boolean cadastroOk = false;

            disciplinas.setMateria(materia);

            if(materia.equals(disciplinas.getMateria())){
                cadastroOk = true;
            }

            return cadastroOk;

        }


}
