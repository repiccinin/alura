public class Main {
    public static void main(String[] args) {
        ConversorMoeda dinheiro = new ConversorMoeda();
        System.out.println(dinheiro.converterDolarParaReal(1000));

        CalculadoraSalaRetangular retangulo = new CalculadoraSalaRetangular();
        System.out.println(retangulo.calcularArea(10,5));
        System.out.println(retangulo.calcularPerimetro(10,5));

        ConversorTemperaturaPadrao temperatura = new ConversorTemperaturaPadrao();
        System.out.println("Temperatura em °C: "+temperatura.fahrenheitParaCelsius(75));
        System.out.println("Temperatura em °F: "+temperatura.celsiusParaFahrenheit(32));

        Livro aEmpregada = new Livro();
        System.out.println("eBook A Empregada - Preço " + aEmpregada.calcularPrecoFinal(15.99));
        ProdutoFisico aEmpregada2 = new ProdutoFisico();
        System.out.println("Livro A Empregada - Preço " + aEmpregada2.calcularPrecoFinal(35.99));

        Produto p = new Produto();
        p.preco = 15;
        p.qtde = 5;
        System.out.println(p.preco + "x" + p.qtde + " = "+p.calcularPreçoTotal(p));

        Servico s = new Servico();
        s.qtde = 15;
        s.preco = 15;
        System.out.println(s.preco + "x" + s.qtde + " = "+s.calcularPreçoTotal(s));
    }

}
