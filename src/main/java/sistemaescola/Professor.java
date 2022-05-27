package sistemaescola;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Professor {

    private String name;
    private String disciplinaEnsinada;

    private boolean atividadeRetornada;

    private List<Aluno> alunos;

    private boolean statusAtividadeEnviada;

    public Professor() {
    }

    public Professor(String name, String disciplinaEnsinada, boolean atividadeRetornada, boolean statusAtividadeEnviada) {
        this.name = name;
        this.disciplinaEnsinada = disciplinaEnsinada;
        this.atividadeRetornada = atividadeRetornada;
        this.statusAtividadeEnviada = statusAtividadeEnviada;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisciplinaEnsinada() {
        return disciplinaEnsinada;
    }

    public void setDisciplinaEnsinada(String disciplinaEnsinada) {
        this.disciplinaEnsinada = disciplinaEnsinada;
    }

    public boolean isAtividadeRetornada() {
        return atividadeRetornada;
    }

    public void setAtividadeRetornada(boolean atividadeRetornada) {
        this.atividadeRetornada = atividadeRetornada;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public boolean isStatusAtividadeEnviada() {
        return statusAtividadeEnviada;
    }

    public void setStatusAtividadeEnviada(boolean statusAtividadeEnviada) {
        this.statusAtividadeEnviada = statusAtividadeEnviada;
    }

    public void enviarAtividadeParaAluno(List<Aluno> alunos){
        for(Aluno aluno : alunos){
            if(aluno.getDisciplinaAssistida().equals("Matematica")){
                aluno.setAtividade("atividade 01 enviada " + Instant.now());
            }
        }
        if(alunos.size() > 0){
            statusAtividadeEnviada = true;
        }
    }

}
