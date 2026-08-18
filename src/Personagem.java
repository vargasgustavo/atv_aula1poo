public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int pontosAtaque;

    public Personagem(String nome, int vida, int pontosAtaque) {
        this.nome = nome;
        this.vida = vida;
        this.pontosAtaque = pontosAtaque;
    }

    // criar os métodos
    public void receberDano(int dano){
        this.vida -= dano;
        if (this.vida < 0){
            this.vida = 0;
        }
        System.out.println(this.nome + " sofreu " + dano);
        System.out.println("Sua vida é de " + this.vida);
    }

    // saber se nosso personagem está vivo
    public boolean estaVivo(){
        return this.vida > 0;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    // Setters
    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPontosAtaque() {
        return pontosAtaque;
    }

    public void setPontosAtaque(int pontosAtaque) {
        this.pontosAtaque = pontosAtaque;
    }

    public abstract void atacar(Personagem alvo);
}