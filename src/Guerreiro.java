import java.util.Random;

public class Guerreiro extends Personagem implements Magia{
    private final int VIDA_MAXIMA;

    public Guerreiro(String nome, int vida, int pontosAtaque) {
        super(nome, vida, pontosAtaque);
        this.VIDA_MAXIMA = vida;
    }

    @Override
    public void curar() {
        System.out.println("O guerreiro não sabe usar magias!");
    }

    @Override
    public void fireball(Personagem alvo) {
        System.out.println("O guerreiro não sabe usar magias!");
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println("O guerreiro atacou!");
        int danoCausado = this.pontosAtaque;
        // implementar ataque crítico que é random > 100
        // if (Random chance > 102){
        //     Random random = new Random();
        //     int chance = random.nextInt(102);
        // }

        alvo.receberDano(danoCausado);
    }
}
