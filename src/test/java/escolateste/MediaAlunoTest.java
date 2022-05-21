package escolateste;

import org.example.Escola.MediaAluno;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MediaAlunoTest {

    MediaAluno media;
    @BeforeEach
    public void initEach(){
        this.media = new MediaAluno();
        System.out.println("Inicializando Teste de Media");
    }

    @Test
    // verificação básica de media, se o valor da media foi 7.0 o esperado é 7.0;
    public void MediaTest(){
        System.out.println("Teste de Verificação de Media!");
        media.verificaMediaAluno(7.0);
        assertEquals(7.0,media.getMediaAluno(), 0.0);
    }

    @Test
    // Se a media foi maior ou igual a 6.0 o teste passará, caso contrário, ele falhará;
    public void MediaTrueTest(){
        System.out.println("Teste de Media True:");
        media.verificaMediaAluno(6.0);
        assertTrue(media.receberMedia(6.0));
        System.out.println("Media considerada Boa!");
    }

    @Test
    // Se a media foi menor que 6.0 o teste passará, caso contrário, ele falhará;
    public void MediaFalseTest(){
        System.out.println("Teste de Media False:");
        assertFalse(media.receberMedia(6.0));
        System.out.println("Media considerada Ruim!");
    }
    @AfterEach
    public void finishEach(){
        System.out.println(" Finalizando Teste de Media...");

    }

}
