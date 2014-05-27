package iis1314.designPatterns.singleton;

public class Singleton {
	private int element;
	private static Singleton singleton=null;

	private Singleton(int element){
		this.element = element;
	}

	public static Singleton getInstance(){
		if(singleton == null){
			singleton = new Singleton(0);
		}

		return singleton;
	}

	public int getIdentifier(){
		return singleton.element++;
	}
}