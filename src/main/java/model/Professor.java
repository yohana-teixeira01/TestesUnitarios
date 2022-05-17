package model;

import controller.ProfessorDAO;
import javafx.scene.paint.Material;

public class Professor implements ProfessorDAO {

        private float Salario;

        public Professor(){
            super();
        }

        public String AtribuirNota(float atribuirNota,float atribuirNota1, float atribuirNota2, float atribuirNota3, String disciplinaRef){

            Disciplinas disciplinas = new Disciplinas();
            Notas notas = new Notas();

            String materia = null;

            if(disciplinaRef.equals(disciplinas.getMatematica())){
                notas.setNota(atribuirNota);
                notas.setNota1(atribuirNota1);
                notas.setNota2(atribuirNota2);
                notas.setNota3(atribuirNota3);

                materia = disciplinas.getMatematica();
            }
            else if(disciplinaRef.equals(disciplinas.getPortugues())) {
                notas.setNota(atribuirNota);
                notas.setNota1(atribuirNota1);
                notas.setNota2(atribuirNota2);
                notas.setNota3(atribuirNota3);

                materia = disciplinas.getPortugues();
            }
            else if(disciplinaRef.equals(disciplinas.getGeografia())) {
                notas.setNota(atribuirNota);
                notas.setNota1(atribuirNota1);
                notas.setNota2(atribuirNota2);
                notas.setNota3(atribuirNota3);

                materia = disciplinas.getGeografia();
            }
            else if(disciplinaRef.equals(disciplinas.getCiencias())) {
                notas.setNota(atribuirNota);
                notas.setNota1(atribuirNota1);
                notas.setNota2(atribuirNota2);
                notas.setNota3(atribuirNota3);

                materia = disciplinas.getCiencias();
            }
            else if(disciplinaRef.equals(disciplinas.getIngles())) {
                notas.setNota(atribuirNota);
                notas.setNota1(atribuirNota1);
                notas.setNota2(atribuirNota2);
                notas.setNota3(atribuirNota3);

                materia = disciplinas.getIngles();
            }
            else if(disciplinaRef.equals(disciplinas.getBiologia())) {
                notas.setNota(atribuirNota);
                notas.setNota1(atribuirNota1);
                notas.setNota2(atribuirNota2);
                notas.setNota3(atribuirNota3);

                materia = disciplinas.getBiologia();
            }

            return materia;

        }


}
