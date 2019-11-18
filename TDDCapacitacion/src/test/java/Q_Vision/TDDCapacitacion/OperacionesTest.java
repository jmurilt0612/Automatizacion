package Q_Vision.TDDCapacitacion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class OperacionesTest {
	
	@Before

	@Test
	public void test() {
		
		Operaciones operar = new Operaciones();
		int resultado = operar.sumar(2, 7);
		Assert.assertEquals(9, resultado);
	}
	
	@Test
	public void testDiv() {
		
		Operaciones operar = new Operaciones();
		int resultado= operar.dividir(9, 3);
		Assert.assertEquals(3, resultado);
	}
	

}