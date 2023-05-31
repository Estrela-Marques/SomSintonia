package br.com.estrela.somsintonia.principal;

import br.com.estrela.somsintonia.modelos.MinhasPreferidas;
import br.com.estrela.somsintonia.modelos.Musica;
import br.com.estrela.somsintonia.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Trevo");
        minhaMusica.setCantor("Anavitoria");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Fora de Norma");
        meuPodcast.setApresentador("Lula e Mari");

        for (int i = 0; i < 1000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 500; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
