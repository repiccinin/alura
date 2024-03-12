public class Main {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Onix");
        meuCarro.definirPrecos(90000, 105000, 110000);
        meuCarro.exibirInfo();

        Cachorro peach = new Cachorro();
        peach.abanarRabo();
        peach.emitirSom();

        Gato cookie = new Gato();
        cookie.arranharMoveis();
        cookie.emitirSom();

        ContaCorrente regiane = new ContaCorrente();
        regiane.depositar(5000);
        regiane.sacar(1500);
        regiane.cobrarTarifaMensal();

        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);

    }
}
