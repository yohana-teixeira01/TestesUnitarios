//package org.example.EscolaTest;
//
//import org.example.Escola.NotaAluno;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class NotaAlunoTest {
//
//    @BeforeEach
//    public void initEach(){
//        System.out.println("Inicializando Teste de Nota");
//    }
//
//    @Test
//    // verificação básica de Nota, se o valor da nota foi 7.0 o esperado é 7.0;
//    public void NotaTest(){
//        System.out.println("Teste de Verificação de Nota!");
//        NotaAluno nota = new NotaAluno();
//        nota.verificaNotaAluno(7.0);
//        assertEquals(7.0,nota.getNotaAluno(), 0.0);
//    }
//
//    @Test
//    // Se a nota foi maior ou igual a 6.0 o teste passará, caso contrário, ele falhará;
//    public void NotaTrueTest(){
//        System.out.println("Teste de Nota True:");
//        NotaAluno nota = new NotaAluno();
//        nota.verificaNotaAluno(6.0);
//        assertTrue(nota.receberNota(6.0));
//        System.out.println("Nota considerada Boa!");
//    }
//
//    @Test
//    // Se a nota foi menor que 6.0 o teste passará, caso contrário, ele falhará;
//    public void NotaFalseTest(){
//        System.out.println("Teste de Nota False:");
//        NotaAluno nota = new NotaAluno();
//        nota.verificaNotaAluno(5.9);
//        assertFalse(nota.receberNota(6.0));
//        System.out.println("Nota considerada Ruim!");
//    }
//    @AfterEach
//    public void finishEach(){
//        System.out.println(" Finalizando Teste de Nota...");
//
//    }
//
//}
