package app;

import model.Songs;
import view.View;

public class Main {

	// last in
	// first in
	// display all
	// search
	// delete
	// edit
	// song ascending
	// song descending
	// artist asc
	// artist desc
	// exit

	public static void main(String[] args) {
		Songs songs = new Songs();
		View view = new View();
		end: while (true) {
			switch (view.init()) {
			case "1":
				view.add(songs);
				break;
			case "2":
				view.slip(songs);
				break;
			case "3":
				view.display(songs.get());
				break;
			case "4":
				view.search(songs);
				break;
			case "5":
				view.delete(songs);
				break;
			case "6":
				view.edit(songs);
				break;
			case "7":
				view.sortByTitle(songs, 1);
				break;
			case "8":
				view.sortByTitle(songs, -1);
				break;
			case "9":
				view.sortByArtist(songs, 1);
				break;
			case "10":
				view.sortByArtist(songs, -1);
				break;
			case "0":
				break end;
			default:
				System.out.println("Invalid input.");
			}
		}

	}

}
