package escolateste;

import sistemaescola.Aluno;
import sistemaescola.Professor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProfessorTest {

    @BeforeEach
    public void initEach(){
        System.out.println("Inicializando Teste...");
    }

    @Test
    // verificação básica se a atividade foi enviada;
    public void enviarAtividadeParaAlunoDeveriaSerEnviada(){
        System.out.println("Teste de Verificação de atividade!");
        Professor professorX = new Professor();
        List<Aluno> alunosList = Arrays.asList();
        professorX.setName("Professor X");
        Aluno[] alunos = {
                new Aluno("Dede", "Matematica",
                        false, professorX), new Aluno(
                                "Valmir", "Matematica",
                false, professorX)};
        int qtdDeAlunosComAtividadeRecebida = professorX.enviarAtividadeParaAluno(Arrays.asList(alunos));
        assertEquals(2 , qtdDeAlunosComAtividadeRecebida);
        System.out.println("Atividades enviadas com sucesso...");
    }

    @Test
    // verificação básica se a atividade foi enviada;
    public void enviarAtividadeParaAlunosQueNaoEstaoNadisciplina(){
        System.out.println("Teste de Verificação de atividade!");
        Professor professorX = new Professor();
        List<Aluno> alunosList = Arrays.asList();
        professorX.setName("Professor X");
        Aluno[] alunos = {
                new Aluno("Dede", "Historia",
                        false, professorX), new Aluno(
                "Valmir", "Geografia",
                false, professorX)};
        int qtdDeAlunosComAtividadeRecebida = professorX.enviarAtividadeParaAluno(Arrays.asList(alunos));
        assertEquals(0 , qtdDeAlunosComAtividadeRecebida);
        System.out.println("Validação concluida, onde alunos checados não são da disciplina...");
    }

    @Test
    // verificação básica se a atividade foi enviada;
    public void enviarAtividadeParaAlunoDeveriaTerStatusAtividadeEnviada(){
        System.out.println("Teste de Verificação de status!");
        Professor professorX = new Professor();
        List<Aluno> alunosList = Arrays.asList();
        professorX.setName("Professor X");
        Aluno[] alunos = {
                new Aluno("Dede", "Matematica",
                        false, professorX), new Aluno(
                "Valmir", "Matematica",
                false, professorX)};
        professorX.enviarAtividadeParaAluno(Arrays.asList(alunos));
        assertEquals(true , professorX.isStatusAtividadeEnviada());
        System.out.println("status de atividade enviada com sucesso...");
    }

    @Test
    // verificação básica de sorteio;
    public void sorteioDeAlunoDeveriaChamarAluno(){
        System.out.println("Teste de Verificação de Sorteio de Aluno!");
        Professor professorX = new Professor();
        List<Aluno> alunosList = Arrays.asList();
        professorX.setName("Professor X");
        Aluno[] alunos = {
                new Aluno("Dede", "Matematica",
                        false, professorX), new Aluno(
                "Valmir", "Matematica",
                false, professorX)};
        String name = professorX.sorteioDeAlunoParaResponderQuestao(
                Arrays.asList(alunos));
        assertNotNull(name);
        assertFalse(name.equals(""));
        System.out.println("status de sorteio...");
    }

    @AfterEach
    public void finishEach(){
        System.out.println(" Finalizando Teste...");

    }
}
