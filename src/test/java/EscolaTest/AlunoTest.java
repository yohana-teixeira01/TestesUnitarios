package EscolaTest;

import aluno.Aluno;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoTest {

    Aluno aluno;

    @BeforeEach
    public void initEach() {
        this.aluno = new Aluno();
        System.out.println("Inicializando Tests do Aluno");
    }

    @Test
    public void AlunoreceberMedia() throws Exception {
        long matriculaAtual = 2021;
        double mediaEsperada;
        double mediaAtual = 5.0;
        aluno.receberMedia(aluno.getMatricula());
        Assert.assertEquals(aluno.getMatricula(),);


    }

}
