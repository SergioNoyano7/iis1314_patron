package iis1314_patrones;

import static org.junit.Assert.*;
import iis1314.designPatterns.factoryMethod.*;

import org.junit.Test;

public class FactoryMethodTest {

	private static final String MP3 = "MP3",WAV = "WAV",OGG = "OGG";
	private IMediaFile media;
	private MediaFactory factoria = new MediaFactory();
	
	
	@Test
	public void testCrearMP3(){
		MP3 mp3 = new MP3();
		
		assertEquals(MP3,mp3.getSonido());
	}
	
	@Test
	public void testCrearWAV(){
		WAV wav = new WAV();
		
		assertEquals(WAV,wav.getSonido());
	}
	
	@Test
	public void testCrearOGG(){
		OGG ogg = new OGG();
		
		assertEquals(OGG,ogg.getSonido());
	}
	
	@Test
	public void testComprobarPlayMP3(){
		MP3 mp3 = new MP3();
		String salida = mp3.play();
		assertEquals("Playing MP3",salida);
			
	}
	
	@Test
	public void testComprobarPlayWAV(){
		WAV wav = new WAV();
		String salida = wav.play();
		assertEquals("Playing WAV",salida);
	}
	
	@Test
	public void testComprobarPlayOGG(){
		OGG ogg = new OGG();
		String salida = ogg.play();
		assertEquals("Playing OGG",salida);
	}
	
	@Test
	public void testCreateMediaMP3(){
		media = factoria.createMedia(MP3);
		
		assertEquals(MP3.class,media.getClass());
	}
	
	@Test
	public void testCreateMediaWAV(){
		media = factoria.createMedia(WAV);
			
		assertEquals(WAV.class,media.getClass());
	}
	
	@Test
	public void testCreateMediaOGG(){
		media = factoria.createMedia(OGG);
		
		assertEquals(OGG.class,media.getClass());
	}

}
