import java.util.Date;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, double qtde, String dataValidade) {
        super(nome, preco, qtde);
        this.dataValidade = dataValidade;
    }
}
