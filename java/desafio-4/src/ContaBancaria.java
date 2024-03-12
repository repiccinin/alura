public class ContaBancaria {
    protected double saldo = 0;
    private String titular;
    private int numero;

    protected void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado.");
        consultarSaldo();
    }
    protected void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado.");
            consultarSaldo();
        } else {
            System.out.println("Não há saldo para esta operação");
        }
    }

    protected void consultarSaldo(){
        System.out.println("Seu saldo atual é R$ "+saldo);
    }
    /*
    * Crie uma classe ContaBancaria com métodos para realizar operações bancárias como
    * depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente
    * que herda da classe ContaBancaria. Adicione um método específico para a subclasse,
    * como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
    * */
}
