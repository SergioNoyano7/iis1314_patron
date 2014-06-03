package iis1314.designPatterns.factoryMethod;

/**
 * 
 * @author Sergio
 *
 */

public class MediaFactory implements IFactory{
	

	/**
	 * Metodo para crear un IMediaFile de un cierto tipo
	 * @param tipo String con el tipo de archivo
	 */
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
