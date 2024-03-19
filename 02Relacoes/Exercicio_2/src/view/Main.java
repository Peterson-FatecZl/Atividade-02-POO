package view;

import controller.Musica;
import controller.Playlist;

public class Main {

	public static void main(String[] args) {
		Playlist playlist = new Playlist("Hip-Hop 2024");

		String nomeMusica01 = "Musica 1";
		String autorMusica01 = "Autor 1";
		String gravadoraMusica01 = "Gravadora 1";

		Musica musica01 = new Musica(nomeMusica01, autorMusica01, gravadoraMusica01);

		String nomeMusica02 = "Musica 2";
		String autorMusica02 = "Autor 2";
		String gravadoraMusica02 = "Gravadora 2";

		Musica musica02 = new Musica(nomeMusica02, autorMusica02, gravadoraMusica02);

		String nomeMusica03 = "Musica 3";
		String autorMusica03 = "Autor 3";
		String gravadoraMusica03 = "Gravadora 3";

		Musica musica03 = new Musica(nomeMusica03, autorMusica03, gravadoraMusica03);

		playlist.adicionarMusica(musica01);
		playlist.adicionarMusica(musica02);
		playlist.adicionarMusica(musica03);

		playlist.tocarMusica();
		
		System.out.println(playlist.getDonoDaPlaylist());
	}

}
