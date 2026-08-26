public class Tarefa {
    // atributos da nossa classe tarefas
    private String descricao;
    private Boolean concluido;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluido = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean isConcluido() {
        return concluido;
    }

    public void marcarComoConcluido(){
        this.concluido = true;
    }

    public void exibirTarefa(int indice){
        String status = this.concluido ? "[X]" : "[ ]";
        System.out.println(indice + " " + status + " " + this.descricao);
    }
}