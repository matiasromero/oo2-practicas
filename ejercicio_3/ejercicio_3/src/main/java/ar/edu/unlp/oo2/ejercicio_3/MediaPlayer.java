package ar.edu.unlp.oo2.ejercicio_3;

import java.util.ArrayList;
import java.util.Iterator;

public class MediaPlayer {
	private ArrayList<Media> media = new ArrayList<Media>();
	
	public void addMedia(Media m) {
		media.add(m);
	}
	
	public String reproduceAll() {
		StringBuilder result = new StringBuilder();
		for (Media m: media) {
			result.append(m.play());
		}
		return result.toString();
	}
}
