package iis1314_patrones;

import static org.junit.Assert.*;
import iis1314.designPatterns.strategy.*;

import org.junit.Test;

public class StrategyTest {
	private static final String data = "string to compress";
	private ICompressor file;
	private Context contexto;


	@Test
	public void testComprobarZip(){
		file = new Zip();
		String salida = file.compress(data);
		assertEquals("ZIP data:-" + data + "-",salida);
	}
	
	@Test
	public void testComprobarRar(){
		file = new Rar();
		String salida = file.compress(data);
		assertEquals("RAR data:-" + data + "-",salida);
	}
	
	@Test
	public void testComprobar7Zip(){
		file = new SevenZip();
		String salida = file.compress(data);
		assertEquals("7ZIP data:-" + data + "-",salida);
	}
	
	@Test
	public void testComprobarCreacionContexto(){
		file = new Rar();
		contexto = new Context(file);
		
		assertEquals(Rar.class,contexto.getStrategy().getClass());
	}
	
	@Test
	public void testPoderCambiarCompresor(){
		contexto = new Context(new Zip());
		file = new SevenZip();
		contexto.setCompressor(file);
		
		assertEquals(SevenZip.class,contexto.getStrategy().getClass());
	}
}
