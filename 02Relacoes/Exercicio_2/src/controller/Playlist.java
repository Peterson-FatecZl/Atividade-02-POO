package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Playlist {

	private Random random = new Random();
	private List<Musica> playlist = new ArrayList<>();
	private String donoDaPlaylist;

	public Playlist(String donoDaPlayList) {
		this.donoDaPlaylist = donoDaPlayList;

	}

	public String getDonoDaPlaylist() {
		return this.donoDaPlaylist;
	}

	public void adicionarMusica(Musica musica) {
		playlist.add(musica);
		System.out.println("Musica Adicionada Com Sucesso!");

	}

	public void tocarMusica() {
		int posicaoMusicaNaPlaylist = random.nextInt(playlist.size());
		Musica musicaTocando = playlist.get(posicaoMusicaNaPlaylist);
		System.out.printf("A Musica %s Está Tocando %n", musicaTocando.getNome());

	}

}
