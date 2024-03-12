import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa regiane = new Pessoa();
        regiane.setNome("Regiane");
        regiane.setIdade(36);

        Pessoa maria = new Pessoa();
        maria.setNome("Maria");
        maria.setIdade(67);

        Pessoa joao = new Pessoa();
        joao.setNome("João");
        joao.setIdade(83);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(regiane);
        listaDePessoas.add(maria);
        listaDePessoas.add(joao);
        System.out.println("Tamanho da lista: "+listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: "+listaDePessoas.get(0).getNome());
        System.out.println("Imprime lista: "+listaDePessoas.toString());
    }

}
