package model;

import controller.ProfessorDAO;

public class Professor implements ProfessorDAO {

        private double Salario = 5000;

        private long matricula = 1;

        private String nome = "Leuson";

    public Professor(){
            super();
        }

        public double getSalario() {
            return Salario;
        }

        public void setSalario(double salario) {
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

        public void AtribuirNota(long matriculaAluno, String disciplinaRef, float atribuirNota, float atribuirNota1, float atribuirNota2, float atribuirNota3) throws Exception {

                    Disciplinas disciplinas = new Disciplinas();

                    Aluno aluno = new Aluno();

                    if(matriculaAluno == aluno.getMatricula()){

                            if(disciplinaRef.equals(disciplinas.getMatematica())){

                                Notas notaMatematica = new Notas();

                                notaMatematica.setNota(atribuirNota);
                                notaMatematica.setNota1(atribuirNota1);
                                notaMatematica.setNota2(atribuirNota2);
                                notaMatematica.setNota3(atribuirNota3);

                            }
                            else if(disciplinaRef.equals(disciplinas.getPortugues())) {

                                Notas notaPortugues = new Notas();

                                notaPortugues.setNota(atribuirNota);
                                notaPortugues.setNota1(atribuirNota1);
                                notaPortugues.setNota2(atribuirNota2);
                                notaPortugues.setNota3(atribuirNota3);

                            }
                            else if(disciplinaRef.equals(disciplinas.getGeografia())) {

                                Notas notaGeografia = new Notas();

                                notaGeografia.setNota(atribuirNota);
                                notaGeografia.setNota1(atribuirNota1);
                                notaGeografia.setNota2(atribuirNota2);
                                notaGeografia.setNota3(atribuirNota3);

                            }
                            else if(disciplinaRef.equals(disciplinas.getCiencias())) {

                                Notas notasCiencias = new Notas();

                                notasCiencias.setNota(atribuirNota);
                                notasCiencias.setNota1(atribuirNota1);
                                notasCiencias.setNota2(atribuirNota2);
                                notasCiencias.setNota3(atribuirNota3);

                            }
                            else if(disciplinaRef.equals(disciplinas.getIngles())) {

                                Notas notasIngles = new Notas();

                                notasIngles.setNota(atribuirNota);
                                notasIngles.setNota1(atribuirNota1);
                                notasIngles.setNota2(atribuirNota2);
                                notasIngles.setNota3(atribuirNota3);

                            }
                            else if(disciplinaRef.equals(disciplinas.getBiologia())) {

                                Notas notasBiologia = new Notas();

                                notasBiologia.setNota(atribuirNota);
                                notasBiologia.setNota1(atribuirNota1);
                                notasBiologia.setNota2(atribuirNota2);
                                notasBiologia.setNota3(atribuirNota3);

                            }

                    } else {
                        throw new Exception("Aluno nao existe");
                    }

                }

                @Override
                public double VerSalario(long matriculaPro) throws Exception {

                    double salario =  0;

                    if(matriculaPro == matricula) {
                        salario = getSalario();
                        return salario;
                    } else {
                        throw new Exception("Error");
                    }

                }


}
