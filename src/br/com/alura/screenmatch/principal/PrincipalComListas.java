package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar 2", 2023);
        outroFilme.avalia(10);
        var filmeDoGilvan = new Filme("Ultimado", 2003);
        filmeDoGilvan.avalia(6);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(9);
        Filme f1 = filmeDoGilvan;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoGilvan);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
    }
}
