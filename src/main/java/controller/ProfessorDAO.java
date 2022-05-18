package controller;

public interface ProfessorDAO {

        public void AtribuirNota(long matriculaAluno, String disciplinaRef, float atribuirNota, float atribuirNota1, float atribuirNota2, float atribuirNota3) throws Exception;

        public double VerSalario(long matricula) throws Exception;

}
