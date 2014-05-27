package iis1314.designPatterns.factoryMethod;

public class MediaFactory implements IFactory{

	public IMediaFile createMedia(String tipo) {
		IMediaFile var = null;
		if("mp3".equalsIgnoreCase(tipo)){
			var = new MP3();
		}
		if("wav".equalsIgnoreCase(tipo)){
			var = new WAV();
		}
		if("ogg".equalsIgnoreCase(tipo)){
			var = new OGG();
		}
		return var;
	}

}
