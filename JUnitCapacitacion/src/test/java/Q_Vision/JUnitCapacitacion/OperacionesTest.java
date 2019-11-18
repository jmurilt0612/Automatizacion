package Q_Vision.JUnitCapacitacion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class OperacionesTest {

	@Before
	
	public void cargaInicial () {
		//Antes de ejecutar nuestro test	
	}
	
	@Test
	public void test() {
		Operaciones opera = new Operaciones();
		int resulSuma = opera.sumar(2, 4);
		Assert.assertEquals(6, resulSuma);
		
	}
	
	@Test
	public void test1() {
		Operaciones opera = new Operaciones();		
		int resultResta= opera.restar(8, 6);
		Assert.assertEquals(2, resultResta);
	}
	
	@After
	public void terminarProceso () {
		//Terminar procesos		
	}

}