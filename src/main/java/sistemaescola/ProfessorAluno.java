package sistemaescola;

public class ProfessorAluno {

    private String name;
    private String turma;
    private boolean emAula;

    public ProfessorAluno() {
    }

    public ProfessorAluno(String name, String turma, boolean emAula) {
        this.name = name;
        this.turma = turma;
        this.emAula = emAula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public boolean isEmAula() {
        return emAula;
    }

    public void setEmAula(boolean emAula) {
        this.emAula = emAula;
    }

    public boolean verificaSeProfessorEmAula(int qtdAlunos, int horario){
        if(horario < 8 || horario > 12){
            throw new IllegalArgumentException("Não tem aulas neste horario");
        }
        return qtdAlunos != 0;
    }

    public String fazChamada(int alunos){
        if (alunos >= 10 && turma != ""){
            return "faz chamada e distribui as atividades";
        }
        return "Não faz chamada e não distribui ainda as atividades" +
                "pois não há alunos suficientes";
    }
}
