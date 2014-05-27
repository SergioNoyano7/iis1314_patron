package iis1314.designPatterns.factoryMethod;

public class WAV implements IMediaFile{
	private String sonido;
	
	public WAV(){
		sonido = "WAV";
	}
	
	public String play(){
		return "Playing " + sonido;
	}
}
