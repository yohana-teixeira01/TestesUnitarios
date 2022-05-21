package EscolaTest;

import aluno.Aluno;
import diretor.Diretor;
import disciplina.Disciplinas;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import professor.Professor;

import static org.junit.Assert.assertThrows;


public class Diretor1Teste extends TestCase {
        Professor professor;

        @BeforeEach
        public void initEach() {
            this.professor = new Professor();
            System.out.println("Inicializando Teste de Diretor");
        }

        @Test
        public void DiretorTeste1 () {
          Professor professor = new Professor();

            String nomeDoProfessor = "Ivan";

            professor.setNome(nomeDoProfessor);

            Assert.assertEquals(nomeDoProfessor, professor.getNome());
        }

        @Test
        public void DiretorTeste2 () {
            Aluno aluno = new Aluno();

            long matriculate = 002;

            aluno.setMatricula(matriculate);

            Assert.assertEquals(matriculate, aluno.getMatricula());
        }

        @Test
        public void DiretorTeste3 () {

            Diretor diretor = new Diretor();

            Disciplinas disciplinas = new Disciplinas();

            diretor.cadastroDisciplina();

            boolean actual = false;
            //boolean expected = disciplinas.getMateria();

            //assertEquals(actual, expected);

        }

}
