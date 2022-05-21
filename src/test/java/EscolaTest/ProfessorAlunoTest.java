package EscolaTest;

import sistemaescola.ProfessorAluno;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProfessorAlunoTest {

    @BeforeEach
    public void initEach(){
        System.out.println("Inicializando Teste...");
    }

    @Test
    // verificação básica se existe alunos suficiente para começar a aula;
    public void verificaSeProfessorEmAulaDeveriaTerAula(){
        System.out.println("Teste de Verificação de Professor!");
        ProfessorAluno professorX = new ProfessorAluno();
        professorX.setName("Professor X");
        assertTrue(professorX.verificaSeProfessorEmAula(10,8));
        System.out.println("A aula irá começar...");
    }

    @Test
    // verificação básica se o Professor está dando aula em horario invalido;
    public void verificaSeProfessorEmAulaNaoDeveriaEmHorarioInvalido(){
        System.out.println("Teste de Verificação de Aula em horario invalido!");
        assertThrows(IllegalArgumentException.class,() ->{
            ProfessorAluno professorX = new ProfessorAluno();
            professorX.setName("Professor X");
            professorX.verificaSeProfessorEmAula(10,7);
        });
        System.out.println("Não tem aula neste horario");
    }

    @Test
    // Validação se faz a chamada e distribui as atividades;
    public void verificaSeFazChamada(){
        System.out.println("Teste de Verificação se distribui a atividade!");
        ProfessorAluno professorX = new ProfessorAluno();
        professorX.setName("Professor X");
        assertEquals("faz chamada e distribui as atividades",
                professorX.fazChamada(10));
        System.out.println("A atividade irá começar...");
    }


    @AfterEach
    public void finishEach(){
        System.out.println(" Finalizando Teste...");

    }
}
