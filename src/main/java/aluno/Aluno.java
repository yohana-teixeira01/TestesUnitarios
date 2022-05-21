package aluno;

import disciplina.Disciplinas;

import java.util.Arrays;

public class Aluno {

            private double mensalidade;
            private String turma = "Sistemas Para Internet - 4 Periodo";
            private long matricula = 1;
            private String nome = "Yohana Texeira";

            private boolean status = false;

            private double[] notas;

            public Aluno(){
                super();
            }

            public Aluno(double mensalidade, String turma, long matricula, String nome, double[] notas) {
                this.mensalidade = mensalidade;
                this.turma = turma;
                this.matricula = matricula;
                this.nome = nome;
                this.notas = notas;
            }

            public double getMensalidade() {
                return mensalidade;
            }

            public void setMensalidade(double mensalidade) {
                this.mensalidade = mensalidade;
            }

            public String getTurma() {
                return turma;
            }

            public void setTurma(String turma) {
                this.turma = turma;
            }

            public long getMatricula() {
                return matricula;
            }

            public void setMatricula(long matricula) {
                this.matricula = matricula;
            }

            public String getName() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public double[] getNotas() {
                return notas;
            }

            public void setNotas(double[] notas) {
                this.notas = notas;
            }

            public boolean isStatus() {
                return status;
            }

            public void setStatus(boolean status) {
                this.status = status;
            }

            public double[] VerificarNotas(long matricula) throws Exception {

                Disciplinas disciplinas = new Disciplinas();

                if(matricula == getMatricula()) {
                    if(disciplinas.equals("Testes de Software")){
                         return getNotas();
                    } else {
                        throw new Exception("Materia não encontrada!");
                    }
                } else {
                    throw new Exception("Matricula nao encontrada!");
                }
            }

            public boolean StatusDaMatricula(long matriculaAluno) throws Exception {
                boolean validar = false;

                if(matriculaAluno == getMatricula()){
                    return validar = true;
                } else {
                    throw new Exception("Matricula nao localizada");
                }

            }

            public double receberMedia(long matriculaAluno) throws Exception{

                double sum = Arrays.stream(notas).sum();
                
                if(matriculaAluno == getMatricula()){
                    return  sum/4;
                } else {
                    throw new Exception("Matricula nao encontrada");
                }

            }

}
