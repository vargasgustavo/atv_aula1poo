public class ContaBancaria {
    // características
    String nome;
    String sobrenome;
    float saldoAtual = 1500;
    int conta;
    String data;

    // método construtor
    public ContaBancaria(String nome, String sobrenome, float saldoAtual, int conta, String data){
        //this.atributo = parâmetro
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.saldoAtual = saldoAtual;
        this.conta = conta;
        this.data = data;
    }

    // acões
    public void depositar(){
        float valorDepositado = 10000;
        saldoAtual += valorDepositado;

        System.out.println("Depósito de R$" + valorDepositado + " realizado com sucesso!");
        System.out.println("Seu saldo atual é de R$" + saldoAtual);
    }

    public void sacar(){
        float valorSaque = 2000;
        saldoAtual -= valorSaque;

        System.out.println("Foram sacados R$" + valorSaque + " da conta!");
        System.out.println("Seu saldo atual é de R$ " + saldoAtual);
    }
}