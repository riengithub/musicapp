package view;

import java.util.ArrayList;

import model.Song;
import model.Songs;
import util.Util;

public class View {

	String[] main = { "1. Add a song at the end", "2. Add a song at the beginning", "3. Display all songs",
			"4. Search by title", "5. Remove a song", "6. Edit a song", "7. Sort songs in an ascending order by title",
			"8. Sort songs in a descending order by title", "9. Sort artists in an ascending order by artist",
			"10. Sort artists in a descending order by artist", "0. Terminate" };

	public String init() {
		String response = Util.prompt(main);
		return response;
	}

	public void add(Songs songs) {
		String title = Util.prompt("Enter the title of the song.");
		String artist = Util.prompt("Enter the name of the artist.");
		songs.add(new Song(title, artist));
	}

	public void slip(Songs songs) {
		String title = Util.prompt("Enter the title of the song.");
		String artist = Util.prompt("Enter the name of the artist.");
		songs.slip(new Song(title, artist));
	}

	public void display(ArrayList<Song> songs) {
		songs.forEach(song -> System.out
				.println("\t" + (songs.indexOf(song) + 1) + ". " + song.getTitle() + " by " + song.getArtist()));
	}

	public void search(Songs songs) {
		String title = Util.prompt("Enter the title to search.");
		display(songs.search(title));
	}

	public void delete(Songs songs) {
		int index = Integer.parseInt(Util.prompt("Enter the number of the song to delete.")) - 1;
		songs.delete(index);
	}

	public void edit(Songs songs) {
		int index = Integer.parseInt(Util.prompt("Enter the number of the song to edit.")) - 1;
		Song song = songs.get(index);
		String title = Util.prompt("Enter a new title. Return nothing to skip.");
		String artist = Util.prompt("Enter a new artist. Return nothing to skip.");
		if (title != "") {
			song.setTitle(title);
		}

		if (artist != "") {
			song.setArtist(artist);
		}

		songs.edit(index, song);

	}

	public void sortByTitle(Songs songs, int order) {
		songs.sortByTitle(order);
	}
	
	public void sortByArtist(Songs songs, int order) {
		songs.sortByArtist(order);
	}

}
