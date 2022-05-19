import controller.ProfessorDAO;
import junit.framework.TestCase;
import model.Professor;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static junit.framework.Assert.assertSame;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class TestProfessor {

        Professor professor = new Professor();

        ProfessorDAO professorDAO;

        @BeforeEach
        public void Inializando(){
            System.out.println("Inicializando tests");
        }

        @Test
        public void TestProfessor00(){

            double salario = 10000;
            long matricula = 10;
            String nome = "Yohana";

            professor.setSalario(salario);
            professor.setMatricula(matricula);
            professor.setNome(nome);

            double actual = salario;
            long actual1 = matricula;
            String actual2 = nome;

            double expected = professor.getSalario();
            long expected1 = professor.getMatricula();
            String expected2 = professor.getNome();

            assertEquals(actual, expected);
            assertEquals(actual1, expected1);
            assertEquals(actual2, expected2);

        }

        @Test
        public void TestProfessor01() throws Exception {

            long matricula = 1;

            professorDAO.VerSalario(matricula);

        }


}
