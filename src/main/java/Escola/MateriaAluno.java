package org.example.Escola;

public class MateriaAluno {

    private int materia;

    public MateriaAluno(){
        this.materia = 0;
    }
    public void verificaQtdMateriasAluno(int qtdMateria) {
        this.materia = qtdMateria;
    }

    public int getQtdMateriasAluno(){
        return this.materia;
    }

    public boolean receberQtdMaterias(int qtdMateria) {
        if(this.materia <= qtdMateria){
            this.materia = qtdMateria;
            return true;
        }
        return false;
    }
}
