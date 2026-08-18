//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.printf("VAMOS INICIAR A BATALHA");
        Guerreiro guerreiro = new Guerreiro("Pineti", 100, 25);
        Mago mago = new Mago("Juan", 80, 30);

        int turno = 1;

        while (guerreiro.estaVivo() && mago.estaVivo()) {
            System.out.println("Turno " + turno);
            guerreiro.atacar(mago);
            Thread.sleep(1500);

            if (mago.getVida() > 30){
                mago.fireball(guerreiro);
            } else {
                mago.curar();
                System.out.println("o mago usou curou!");
            }
        }
        turno++;
    }
}