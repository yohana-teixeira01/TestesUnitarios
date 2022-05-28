package sistemaescola;

public class Aluno {
    private String name;

    private String disciplina;

    private String atividade;

    private String disciplinaAssistida;

    private boolean enviarAtividade;

    private boolean temDuvida;

    Professor professor = new Professor();

    public Aluno (){
    }

    public Aluno(String name, String disciplina, String disciplinaAssistida, boolean enviarAtividade, Professor professor) {
        this.name = name;
        this.disciplina = disciplina;
        this.disciplinaAssistida = disciplinaAssistida;
        this.enviarAtividade = enviarAtividade;
        this.professor = professor;
    }

    public Aluno(
            String name, String disciplinaAssistida, boolean enviarAtividade,
            Professor professor) {
        this.name = name;
        this.disciplinaAssistida = disciplinaAssistida;
        this.enviarAtividade = enviarAtividade;
        this.professor = professor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAtividade() {
        return atividade;
    }

    public boolean isTemDuvida() {
        return temDuvida;
    }

    public void setTemDuvida(boolean temDuvida) {
        this.temDuvida = temDuvida;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplinaAssistida() {
        return disciplinaAssistida;
    }

    public void setDisciplinaAssistida(String disciplinaAssistida) {
        this.disciplinaAssistida = disciplinaAssistida;
    }

    public boolean isEnviarAtividade() {
        return enviarAtividade;
    }

    public void setEnviarAtividade(boolean enviarAtividade) {
        this.enviarAtividade = enviarAtividade;
    }

//    public void EnviarAtividade(String comentario) throws Exception {
//
//        Date dataHoje = new Date();
//        //SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
//
//        if(dataHoje.before(professor.dataEntrega) || dataHoje.equals(professor.dataEntrega)){
//            enviarAtividade = true;
//        } else {
//            throw new Exception("Fora do prazo!");
//        }
//
//        if(!comentario.isEmpty()){
//            professor.enviarComentario(comentario);
//        }
//    }
}
