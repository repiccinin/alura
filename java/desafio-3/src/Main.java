public class Main {
    public static void main(String[] args) {
        idadePessoa pessoa = new idadePessoa();
        pessoa.setNome("Sakura");
        pessoa.setIdade(12);
        System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos");
        pessoa.verificarIdade();

        Produto produto1 = new Produto();
        produto1.setNome("Mouse Apple");
        produto1.setPreco(100.00);
        produto1.aplicarDesconto(5);
        System.out.println(produto1.getNome() + " custa R$ " + produto1.getPreco());

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Charlie");
        aluno1.setNota(8);
        aluno1.setNota(6);
        System.out.println("O aluno " + aluno1.getNome() + " teve a média " + aluno1.calcularMedia(2));

        Livro livro1 = new Livro();
        livro1.setTitulo("Loucos por Livros");
        livro1.setAutor("Emily Henry");
        livro1.ExibirDetalhes();
        
    }
}
