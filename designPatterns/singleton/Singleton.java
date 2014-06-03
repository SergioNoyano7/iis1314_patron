package iis1314.designPatterns.singleton;

/**
 * 
 * @author Sergio
 *
 */

public class Singleton {
	private int element;
	private static Singleton singleton=null;

	/**
	 * Crea un patron Singleton a partir de un cierto elemento
	 * @param element tipo de Singleton
	 */
	private Singleton(int element){
		this.element = element;
	}

	/**
	 * Crea y devuelve el singleton
	 * @return singleton 
	 */
	public static Singleton getInstance(){
		if(singleton == null){
			singleton = new Singleton(0);
		}

		return singleton;
	}

	/**
	 * Devuelve el elemento incrementado en uno del singleton
	 * @return singleton.element++ 
	 */
	public int getIdentifier(){
		return singleton.element++;
	}
}