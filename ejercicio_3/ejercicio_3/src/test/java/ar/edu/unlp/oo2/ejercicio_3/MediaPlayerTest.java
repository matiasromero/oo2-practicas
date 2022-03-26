/**
 * 
 */
package ar.edu.unlp.oo2.ejercicio_3;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MediaPlayerTest {
	
	MediaPlayer player;
	VideoStreamAdapter videoStreamAdapter;
	
	@BeforeEach
	void setUp() throws Exception {
		player = new MediaPlayer();
		videoStreamAdapter = new VideoStreamAdapter();
	}
	
    @Test
    public void shouldReproduceAll() {
    	Audio a1 = new Audio();
    	Audio a2 = new Audio();
    	VideoFile v1 = new VideoFile();
    	VideoFile v2 = new VideoFile();
    	VideoFile v3 = new VideoFile();
    	VideoStreamAdapter va1 = new VideoStreamAdapter();
    	VideoStreamAdapter va2 = new VideoStreamAdapter();
    	
    	player.addMedia(a1);
    	player.addMedia(a2);
    	player.addMedia(v1);
    	player.addMedia(v2);
    	player.addMedia(v3);
    	player.addMedia(va1);
    	player.addMedia(va2);
    	
    	String result = player.reproduceAll();
    	
        assertTrue(result.contains("Playing Audio!"));
        assertTrue(result.contains("Playing a video! :)"));
        assertTrue(result.contains("I'm a Video Stream B)"));
        assertEquals(result, "Playing Audio!Playing Audio!Playing a video! :)Playing a video! :)Playing a video! :)I'm a Video Stream B)I'm a Video Stream B)");
    }
}
