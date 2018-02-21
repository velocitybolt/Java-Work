package song;
// Author: Murtaza Meerza
import java.util.ArrayList;

import stdlib.*;

public class Song {
		ArrayList<Double> freq = new ArrayList<Double>();
		ArrayList<Double> dura = new ArrayList<Double>();	
	
	public Song() {
		ArrayList<Double> freq = new ArrayList<Double>();
		ArrayList<Double> dura = new ArrayList<Double>();	
	}

	public void addFrequency(double frequency){
		freq.add(Double.valueOf(frequency));
	
	}
	public void addDuration(double duration){
		dura.add(Double.valueOf(duration));
	}
	public void play(){
		for (int i=0; i<freq.size(); i++) {
			playTone(freq.get(i), dura.get(i));
		}
	}
	private void playTone(double frequency, double duration) {
		final int sliceCount = (int) (StdAudio.SAMPLE_RATE * duration);
		final double[] slices = new double[sliceCount+1];
		for (int i = 0; i <= sliceCount; i++) {
			slices[i] = Math.sin(2 * Math.PI * i * frequency / StdAudio.SAMPLE_RATE);
		}
		StdAudio.play(slices);
		
	  
	
	}
}