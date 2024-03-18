package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Amor com Data Marcada",2020);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Querida Zoe",2022);
        outroFilme.avalia(6);
        var filme2 = new Filme("One Angry Juror",2010);
        filme2.avalia(10);
        Serie greysAnatomy = new Serie("Grey's Anatomy",2005);

        ArrayList<Titulo> lista = new ArrayList<>();
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
    }
}
