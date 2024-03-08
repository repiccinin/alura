import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String nome = "Regiane Piccinin";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;

        System.out.println("*******************************");
        System.out.println("Dados Iniciais do Cliente:");
        System.out.println("\nNome:          "+nome);
        System.out.println("Tipo de Conta: "+tipoConta);
        System.out.println("Saldo Inicial: R$ "+saldo);
        System.out.println("\n*******************************");

        Scanner scan = new Scanner(System.in);

        while (opcao != 4) {

            System.out.println("\nOperações:");
            System.out.println("\n1 - Consultar Saldo");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir Valor");
            System.out.println("4 - Sair");

            System.out.println("\nDigite a opção desejada:");
            opcao = scan.nextInt();

            if (opcao == 1) { //Imprime Saldo
                System.out.println("Saldo atual: R$ " + saldo);
            } else
                if (opcao == 2) { //Receber Valor
                    saldo = RecebeValor(saldo);
                    System.out.println("Saldo atual: R$ " + saldo);
                } else
                    if (opcao == 3) { //Transfere Valor
                        saldo = TransfereValor(saldo);
                        System.out.println("Saldo atual: R$ " + saldo);
                    } else {
                        System.out.println("Operação Inválida!");
                     }
        }
        if (opcao == 4) {
            System.out.println("Programa finalizado!");
        }
    }

    public static double RecebeValor(double saldo){
        System.out.println("Digite o valor a receber:");
        Scanner scan = new Scanner(System.in);
        double valorRecebido = scan.nextDouble();
        saldo += valorRecebido;
        return saldo;
    }
    public static double TransfereValor(double saldo){
        System.out.println("Digite o valor a transferir:");
        Scanner scan = new Scanner(System.in);
        double valorTransferencia = scan.nextDouble();
        if (valorTransferencia > saldo) {
            System.out.println("Saldo insuficiente para transação");
        } else {
            saldo -= valorTransferencia;
        }
        return saldo;
    }
}