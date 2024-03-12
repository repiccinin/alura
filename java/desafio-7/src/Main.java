import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        * Crie uma classe Produto com atributos como nome, preco, e quantidade.
        * Em seguida, crie uma lista de objetos Produto utilizando a classe
        * ArrayList. Adicione alguns produtos, imprima o tamanho da lista e
        * recupere um produto pelo índice.
        * */

        Produto p1 = new Produto("Copo Stanley",75.99, 30);
        //p1.nome = "Copo Stanley";
       // p1.preco = 75.99;
        //p1.qtde = 30;

        Produto p2 = new Produto("iPhone 14",5999.99,5);
//        p2.nome = "iPhone 14";
//        p2.preco = 5999.99;
//        p2.qtde = 5;

        Produto p3 = new Produto("notebook Predator",6999.99,3);
//        p3.nome = "notebook Predator";
//        p3.preco = 6999.99;
//        p3.qtde = 3;

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);
        listaDeProdutos.add(p3);
        System.out.println("Tamanho da lista: "+listaDeProdutos.size());
        System.out.println("Recupere o índice 1: "+listaDeProdutos.get(1).getNome());

        /*
        * Implemente o método toString() na classe Produto para retornar uma
        * representação em texto do objeto. Em seguida, imprima a lista de
        * produtos utilizando o método System.out.println().
        * */
        System.out.println("Imprima a lista: "+listaDeProdutos.toString());

        /*
        * Modifique a classe Produto para incluir um construtor que aceite
        * parâmetros para inicializar os atributos. Em seguida, crie
        * objetos Produto utilizando esse novo construtor.
        * */

        /*
        * Crie uma classe ProdutoPerecivel que herde de Produto. Adicione
        * um atributo dataValidade e um construtor que utilize o construtor
        * da classe mãe (super) para inicializar os atributos herdados.
        * Crie um objeto ProdutoPerecivel e imprima seus valores.
        * */
        ProdutoPerecivel iogurte = new ProdutoPerecivel("Iogurte",6.99,100,"17/03/2024");
        listaDeProdutos.add(iogurte);
        System.out.println(listaDeProdutos.toString());
    }
}
