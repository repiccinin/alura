public class Main {
    public static void main(String[] args) {
        //converte temperatura de celsius para fahrenheit.
        double temperaturaCelsius = 33;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaCelsius,
                temperaturaFahrenheit);

        System.out.println(mensagem);

        int temperaturaFahrenheitInteira = (int) temperaturaFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaFahrenheitInteira);

        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota1 = 5.5;
        double nota2 = 7.5;
        double media = (nota1 + nota2) / 2;
        System.out.println("Média: "+media);

        //Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e
        // imprima o resultado.
        double preco = 8.5;
        int valorConvertido;
        valorConvertido = (int) preco;
        System.out.println("Valor convertido: "+valorConvertido);

        //Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas
        //variáveis e concatene-as em uma mensagem.
        char mensagem1 = 'O';
        String mensagem2 = "meu primeiro programa Java";
        System.out.println(mensagem1 + " " + mensagem2);

        //Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor
        // total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        double precoProduto = 199.99;
        int quantidade = 2;
        double total = precoProduto * quantidade;
        System.out.println("Total: " + total);

        //Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que
        // o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o
        // resultado formatado.
        double valorEmDolares = 1399.99;
        String mensagem3 = String.format("US$%f corresponde a R$%f", valorEmDolares, valorEmDolares * 4.94);
        System.out.println(mensagem3);

        //Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o
        // preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um
        // valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais,
        // aplique-o ao preço original e imprima o novo preço com desconto.
        double precoOriginal = 12500.99;
        double percentualDesconto = 5;
        System.out.println(precoOriginal - (precoOriginal * (percentualDesconto/100)));
    }
}