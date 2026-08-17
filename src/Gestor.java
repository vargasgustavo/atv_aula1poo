public class Gestor extends Funcionario {

    public Gestor(String nome, double salario) {
        super(nome, salario);
    }

    public void atribuirTarefas() {
        System.out.println(nome + " está atribuindo tarefas.");
    }
}
