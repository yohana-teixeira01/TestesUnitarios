package view;

import controller.ProfessorDAO;
import model.Professor;

import java.util.Scanner;

public class ProfessorView {

        Professor professor = new Professor();

        Scanner scanner = new Scanner(System.in);

        public void View() throws Exception {

                ProfessorDAO professorDAO = new Professor();

                System.out.println("Bem vindo, professor " + professor.getNome());
                System.out.println("\t");

                System.out.println("Digite sua matricula");
                long matricula = scanner.nextLong();


                System.out.println("Digite opção Desejada");

                System.out.println("1 - Para ver Salário");
                System.out.println("2 - Para adicionar nota dos Alunos");

                int op = scanner.nextInt();

                switch (op){
                        case 1:
                                System.out.println("Salario: ");
                                System.out.println(professorDAO.VerSalario(matricula));
                                break;
                        case 2:

                                System.out.println("Informe disciplina: ");
                                String disciplinaRef = scanner.nextLine();

                                System.out.println("Matricula do Aluno que Deseja inserir as Notas: ");
                                long matriculaAluno = scanner.nextLong();

                                System.out.println("Insira as notas: ");
                                float nota = scanner.nextFloat();
                                System.out.println("");
                                float nota1 = scanner.nextFloat();
                                System.out.println("");
                                float nota2 = scanner.nextFloat();
                                System.out.println("");
                                float nota3 = scanner.nextFloat();

                                professorDAO.AtribuirNota(matriculaAluno, disciplinaRef, nota, nota1, nota2, nota3);

                                break;

                }

        }

}
