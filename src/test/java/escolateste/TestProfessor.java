package escolateste;


import aluno.Aluno;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import professor.Professor;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestProfessor{

    Professor professor = new Professor();
    Aluno aluno = new Aluno();

    @BeforeEach
    public void Inializando(){

        System.out.println("Inicializando tests");
    }

    @AfterEach
    public void Finalizando(){
        System.out.println("Finalizando tests");
    }

    @Test
    public void TestProfessor00(){

        double salario = 10000;
        long matricula = 10;
        String nome = "Yohana Texeira";

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

        double actual = 3.000;

        double expected = professor.VerSalario(10);

        Assert.assertNotEquals(actual, expected);

    }

//    @Test
//    public void TestProfessor02() throws Exception {
//
//        double[] actualNotas = {10.0, 7.0, 6.0, 8.0 };
//        long actualMatriculaAluno = 1;
//        String actualNomeDisciplina = "Testes de Software";
//
//        professor.AtribuirNota(actualMatriculaAluno, actualNomeDisciplina, actualNotas);
//
//        //Assert.assertArrayEquals(actualNotas, aluno.getNotas());
//
//        assertEquals(actualNotas, aluno.getNotas());
//
//    }

    @Test
    public void TestProfessor03() throws Exception {

        long actualMatricula = 10;
        String actualDisciplina = "Testes de Software";

        professor.TurmaCadastrada(actualMatricula);

        String expected = professor.getDisciplina();

        assertEquals(actualDisciplina , expected);

    }


}
