public class ProdutoFisico implements Calculavel{
    @Override
    public double calcularPrecoFinal(double preco) {
        return preco * 0.9;
    }
}
/*Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro
e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.*/