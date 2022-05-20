package model;

import java.util.List;

public class Disciplinas {

        private String matematica;
        private String portugues;
        private String geografia;
        private String ciencias;
        private String ingles;
        private String biologia;

        List<Notas> notas;

        public Disciplinas() {
                super();
        }

        public Disciplinas(String matematica, String portugues, String geografia, String ciencias, String ingles, String biologia, List<Notas> notas) {
                this.matematica = matematica;
                this.portugues = portugues;
                this.geografia = geografia;
                this.ciencias = ciencias;
                this.ingles = ingles;
                this.biologia = biologia;
                this.notas = notas;
        }

        public String getMatematica() {
                return matematica;
        }

        public void setMatematica(String matematica) {
                this.matematica = matematica;
        }

        public String getPortugues() {
                return portugues;
        }

        public void setPortugues(String portugues) {
                this.portugues = portugues;
        }

        public String getGeografia() {
                return geografia;
        }

        public void setGeografia(String geografia) {
                this.geografia = geografia;
        }

        public String getCiencias() {
                return ciencias;
        }

        public void setCiencias(String ciencias) {
                this.ciencias = ciencias;
        }

        public String getIngles() {
                return ingles;
        }

        public void setIngles(String ingles) {
                this.ingles = ingles;
        }

        public String getBiologia() {
                return biologia;
        }

        public void setBiologia(String biologia) {
                this.biologia = biologia;
        }

        public List<Notas> getNotas() {
                return notas;
        }

        public void setNotas(List<Notas> notas) {
                this.notas = notas;
        }

}
