package song;


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
