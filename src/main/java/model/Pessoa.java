package model;

public abstract class Pessoa {

        private String nome;
        private String idade;
        private String matricula;

        public Pessoa() {
            super();
        }

        public Pessoa(String nome, String idade, String matricula) {
            this.nome = nome;
            this.idade = idade;
            this.matricula = matricula;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getIdade() {
            return idade;
        }

        public void setIdade(String idade) {
            this.idade = idade;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

}
