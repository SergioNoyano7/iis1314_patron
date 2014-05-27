package iis1314.designPatterns.factoryMethod;

public class OGG implements IMediaFile{
	private String sonido;
	
	public OGG(){
		sonido = "OGG";
	}
	
	public String play(){
		return "Playing " + sonido;
	}
}
