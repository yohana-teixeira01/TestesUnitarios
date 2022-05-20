package model;

public class Aluno {

        private float mensalidade;
        private String turma;
        private long matricula = 10;

        public Aluno(){
            super();
        }

        public Aluno(float mensalidade, String turma, long matricula) {
            this.mensalidade = mensalidade;
            this.turma = turma;
            this.matricula = matricula;
        }

        public float getMensalidade() {
            return mensalidade;
        }

        public void setMensalidade(float mensalidade) {
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

        public void acessarNotas(String materia, long matriculaVal){

                Disciplinas disciplinas = new Disciplinas();

                if(matriculaVal == getMatricula()){

                        Notas notas = new Notas();

                        if(materia.equals(disciplinas.getMatematica())){

                        }
                }

        }

}
