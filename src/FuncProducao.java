public class FuncProducao extends Funcionario {
    String turno;

    public FuncProducao(String nome, double salario, String turno) {
        super(nome, salario);
        this.turno = turno;
    }

    public void operar() {
        System.out.println(nome + " está operando no turno " + turno + ".");
    }
}
