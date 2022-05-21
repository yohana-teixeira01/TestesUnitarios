package org.example.Escola;

public class MediaAluno {

    private double media;

    public MediaAluno(){
        this.media = 0;
    }
    public void verificaMediaAluno(double valorMedia) {
        this.media = valorMedia;
    }

    public double getMediaAluno() {
        return this.media;
    }

    public boolean receberMedia(double valorMedia) {
        if(this.media >= valorMedia){
            this.media = valorMedia;
            return true;
        }
        return false;
    }
}
