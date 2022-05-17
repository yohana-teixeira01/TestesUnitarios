package model;

import controller.ProfessorDAO;

public class Professor implements ProfessorDAO {

        private float Salario = 1000;

        private long matricula = 1L;

        private String nome = "Leuson";

        public Professor(){
            super();
        }

        public float getSalario() {
            return Salario;
        }

        public void setSalario(float salario) {
            Salario = salario;
        }

        public long getMatricula() {
            return matricula;
        }

        public void setMatricula(long matricula) {
            this.matricula = matricula;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String AtribuirNota(float atribuirNota, float atribuirNota1, float atribuirNota2, float atribuirNota3, String disciplinaRef){

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

                @Override
                public float VerSalario(long matriculaPro) {

                    if(matriculaPro == matricula) {
                        return getSalario();
                    } else {
                        return 0;
                    }

                }


}
