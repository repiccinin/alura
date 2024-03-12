public class Produto {
    public String nome;
    public double preco;
    public double qtde;

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qtde=" + qtde +
                '}';
    }

    public Produto(String nome, double preco, double qtde) {
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }
}
