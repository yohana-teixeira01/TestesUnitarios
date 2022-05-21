package EscolaTest;

import model.Aluno;
import model.Disciplinas;
import model.Professor;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class Diretor1Teste {
    Professor professor;

    @BeforeEach
    public void initEach() {
        this.professor = new Professor();
        System.out.println("Inicializando Teste de Nota");


    }

  @Test
   public void DiretorTeste1 () {
      Professor professor = new Professor();

        String nomeDoProfessor = "Ivan";
        Assert.assertEquals(nomeDoProfessor, professor.getNome());
    }

    @Test
    public void DiretorTeste2 () {
        Aluno aluno = new Aluno();

        long matriculate = 002;
        Assert.assertEquals(matriculate, aluno.getMatricula());
    }

    @Test
    public void DiretorTeste3 () {

        assertThrows(IllegalArgumentException.class, () -> {
            String matter = "Programmable";
            Disciplinas disciplinas = new Disciplinas();

        });
    }
}
