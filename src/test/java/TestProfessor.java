import junit.framework.TestCase;
import model.Professor;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestProfessor extends TestCase {

        @BeforeEach
        public void Inializando(){
            System.out.println("Inicializando tests");
        }

        @Test
        public void TestProfessor(){

            Professor professor = new Professor();

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


}
