package view;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Sistema Escolar Para Alunos e Professores \n");
        System.out.println("Digite 1 se for Aluno");
        System.out.println("Digite 2 se for Professor");

        Scanner scanner = new Scanner(System.in);

        int op = scanner.nextInt();

        switch (op){
            case 1:
                break;
            case 2:
                ProfessorView professorView = new ProfessorView();
                professorView.View();
                break;
        }
    }

}
