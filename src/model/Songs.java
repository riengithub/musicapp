package model;

import java.util.ArrayList;

public class Songs {
	private ArrayList<Song> songs;

	public Songs() {
		songs = new ArrayList<Song>();
	}

	public void add(Song song) {
		songs.add(song);
	}

	public void slip(Song song) {
		songs.add(0, song);
	}

	public ArrayList<Song> get() {
		return songs;
	}

	public Song get(int index) {
		Song song = songs.get(index);
		return song;
	}

	public ArrayList<Song> search(String title) {
		ArrayList<Song> results = new ArrayList<Song>();
		for (Song song : songs) {
			if (song.getTitle().contains(title)) {
				results.add(song);
			}
		}
		return results;
	}

	public void delete(int index) {
		songs.remove(index);
	}

	public void edit(int index, Song song) {
		songs.set(index, song);

	}

	public void sortByTitle(int order) {
		if (order == 1)
			songs.sort((a, b) -> a.getTitle().compareTo(b.getTitle()));
		else
			songs.sort((a, b) -> b.getTitle().compareTo(a.getTitle()));
	}

	public void sortByArtist(int order) {
		if (order == 1)
			songs.sort((a, b) -> a.getArtist().compareTo(b.getArtist()));
		else
			songs.sort((a, b) -> b.getArtist().compareTo(a.getArtist()));
	}
}
