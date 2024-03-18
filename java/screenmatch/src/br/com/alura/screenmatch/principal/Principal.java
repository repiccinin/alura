package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Amor com Data Marcada",2020);
        //meuFilme.setNome("Amor com Data Marcada");
        //meuFilme.setAnoDeLancamento(2020);
        meuFilme.setDuracaoEmMinutos(104);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

//        Serie lost = new Serie();
//        lost.setNome("Lost");
//        lost.setAnoDeLancamento(2004);
//        lost.setTemporadas(6);
//        lost.setEpisodiosPorTemporada(20);
//        lost.setMinutosPorEpisodio(45);
//        lost.exibeFichaTecnica();
//        System.out.println("Minutos para maratonar " + lost.getNome() + ": "+ lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Querida Zoe",2022);
        //outroFilme.setNome("Querida Zoe");
        //outroFilme.setAnoDeLancamento(2022);
        outroFilme.setDuracaoEmMinutos(96);
        outroFilme.setIncluidoNoPlano(true);

        Serie greysAnatomy = new Serie("Grey's Anatomy",2005);
        //greysAnatomy.setNome("Grey's Anatomy");
        //greysAnatomy.setAnoDeLancamento(2005);
        greysAnatomy.setTemporadas(20);
        greysAnatomy.setEpisodiosPorTemporada(21);
        greysAnatomy.setMinutosPorEpisodio(42);
        System.out.println("Minutos para maratonar " + greysAnatomy.getNome() + ": "+ greysAnatomy.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        //calculadora.inclui(lost);
        calculadora.inclui(greysAnatomy);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(greysAnatomy);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filme2 = new Filme("One Angry Juror",2010);
        //filme2.setNome("One Angry Juror");
        //filme2.setDuracaoEmMinutos(89);
        filme2.setAnoDeLancamento(2010);
        filme2.avalia(5.9);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());

    }
}
