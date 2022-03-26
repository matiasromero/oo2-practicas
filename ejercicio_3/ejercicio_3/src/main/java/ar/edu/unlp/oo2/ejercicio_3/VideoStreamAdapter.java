package ar.edu.unlp.oo2.ejercicio_3;

public class VideoStreamAdapter extends Media {
	
	private VideoStream adaptee = new VideoStream();

	public String play() {
		return adaptee.reproduce();
	};
}
