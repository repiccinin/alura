package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Amor com Data Marcada",2020);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Querida Zoe",2022);
        outroFilme.avalia(6);
        var filme2 = new Filme("One Angry Juror",2010);
        filme2.avalia(10);
        Serie greysAnatomy = new Serie("Grey's Anatomy",2005);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filme2);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(greysAnatomy);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Jessica Capshaw");
        buscaPorArtista.add("Ellen Pompeo");
        buscaPorArtista.add("Camilla Luddington");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação " + buscaPorArtista);

        System.out.println("Lista de títulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
