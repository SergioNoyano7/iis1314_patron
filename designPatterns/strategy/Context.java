package iis1314.designPatterns.strategy;

/**
 * 
 * @author Sergio
 *
 */

public class Context{
	private ICompressor estrategia;
	
	/**
	 * Crea un contexto pasandole un tipo de compresor
	 * @param comp Es un tipo de compresor
	 */
	public Context(ICompressor comp){
		estrategia = comp;
	}
	
	/**
	 * Cambia la estrategia a seguir del contexto pasandole un nuevo compresor
	 * @param comp Es un tipo de compresor
	 */
	public void setCompressor(ICompressor comp){
		estrategia = comp;
	}
	
	
	/**
	 * 
	 * @param data Es un String
	 * @return string resultado de la compresion
	 */
	public String compress(String data){
		return estrategia.compress(data);
	}
	
	/**
	 * Metodo para obtener la estrategia que este usando el contexto
	 * @return estrategia
	 */
	public ICompressor getStrategy() {
		return estrategia;
	}
}
