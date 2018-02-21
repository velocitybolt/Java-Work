package song;

/*
 * Written by John Rogers
 * This program tests the implementation of the Song
 * class written for an assignment in week 5 of CSC 300.
 */

import stdlib.StdIn;

public class PlaySong {

	public static void main(String[] args) {
		Song song = new Song();
		StdIn.fromFile("data/march.txt");
		while (!StdIn.isEmpty()) {
			double duration = StdIn.readDouble();
			double frequency = StdIn.readDouble();
			song.addDuration(duration);
			song.addFrequency(frequency);
		}
		song.play();
	}

}
