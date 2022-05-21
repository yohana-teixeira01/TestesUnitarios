package escolateste;


import org.example.Escola.MateriaAluno;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MateriaAlunoTest {

    MateriaAluno materias;

    @BeforeEach
    public void initEach(){
        this.materias = new MateriaAluno();
        System.out.println("Inicializando Teste de Materia");
    }

    @Test
    // verificação básica de media, se o valor da media foi 7.0 o esperado é 7.0;
    public void MateriaTest(){
        System.out.println("Teste de Verificação de Materia!");

        materias.verificaQtdMateriasAluno(7);
        assertEquals(7,materias.getQtdMateriasAluno(), 0);
    }

    @Test
    // Se a quantidade de materias for maior que 6 o teste falhará, caso contrário, ele passará;
    public void MateriaTrueTest(){
        System.out.println("Teste de Matéria True:");
        materias.verificaQtdMateriasAluno(6);
        assertTrue(materias.receberQtdMaterias(6));
        System.out.println("Quantidade de máterias permitida!");
    }

    @Test
    // Se a quantidade de materias for menor ou igual a 6 o teste passará, caso contrário, ele falhará;
    public void MateriaFalseTest(){
        System.out.println("Teste de Matéria False:");
        materias.verificaQtdMateriasAluno(7);
        assertFalse(materias.receberQtdMaterias(6));
        System.out.println("Quantidade de máterias abaixo do permitido, ou seja, pode colocar mais máterias!");
    }
    @AfterEach
    public void finishEach(){
        System.out.println(" Finalizando Teste de Materia...");
    }
}
