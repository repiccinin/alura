public class Produto implements Vendavel{
    double preco = 0;
    double qtde = 0;
    @Override
    public double calcularPreçoTotal(Vendavel v) {
        if (qtde >= 5){
            return (qtde * preco) * 0.9;
        } else{
            return (qtde * preco);
        }
    }
}
/*Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e
aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de
cálculo de preço.*/