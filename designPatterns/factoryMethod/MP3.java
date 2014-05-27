package iis1314.designPatterns.factoryMethod;

public class MP3 implements IMediaFile{
	String sonido;
	
	public MP3(){
		sonido = "MP3";
	}
	
	public String play(){
		return "Playing " + sonido;
	}
}
