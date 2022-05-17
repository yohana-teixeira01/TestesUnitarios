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
                this.matematica = matematica;
                this.portugues = portugues;
                this.geografia = geografia;
                this.ciencias = ciencias;
                this.ingles = ingles;
                this.biologia = biologia;
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

}
