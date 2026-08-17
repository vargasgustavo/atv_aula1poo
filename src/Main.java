public class Main {
    public static void main(String[] args) {
        // Cadastrando um produto no estoque
        Produto p1 = new Produto("Parafuso", 0.50);
        System.out.println("Produto: " + p1.nome);
        System.out.println("Preço: R$ " + p1.preco);
        System.out.println("Estoque inicial: " + p1.quantidadeEmEstoque);

        System.out.println("---");

        // Funcionário de produção
        FuncProducao func = new FuncProducao("João", 2000.0, "Manhã");
        func.trabalhar();
        func.operar();

        System.out.println("---");

        // Gestor
        Gestor gestor = new Gestor("Maria", 5000.0);
        gestor.trabalhar();
        gestor.atribuirTarefas();
    }
}
