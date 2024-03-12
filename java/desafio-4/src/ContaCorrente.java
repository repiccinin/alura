public class ContaCorrente extends ContaBancaria{
    private double tarifa = 13.99;
    public void cobrarTarifaMensal(){
        super.saldo -= tarifa;
        System.out.println("Tarifa mensal de " + tarifa + " cobrada.");
        consultarSaldo();
    }
}
