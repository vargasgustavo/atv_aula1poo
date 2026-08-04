//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("gustavo", "cleiton", 1500, 1234, "20-08-2026");

        contaBancaria.depositar();
        contaBancaria.sacar();
        contaBancaria.sacar();
    }
}