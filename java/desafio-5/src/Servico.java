public class Servico implements Vendavel{
    double preco = 0;
    double qtde = 0;
    @Override
    public double calcularPreçoTotal(Vendavel v) {
        if (qtde > 10) {
            return (qtde * preco) * 0.8;
        } else {
            return (qtde * preco) * 0.9;
        }
    }
}
/*Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e
aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de
cálculo de preço.*/