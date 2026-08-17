public class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;

    // Construtor: obriga a informar nome e preço; estoque começa em zero
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = 0;
    }
}
