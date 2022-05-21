package org.example.Escola;

public class NotaAluno {

    private double nota;

    public NotaAluno(){
        this.nota = 0;
    }
    public void verificaNotaAluno(double valorNota) {
        this.nota = valorNota;

    }


    public double getNotaAluno() {
        return this.nota;
    }

    public boolean receberNota(double valorNota) {
        if(this.nota >= valorNota){
            this.nota = valorNota;
            return true;
        }
        return false;
    }
}
