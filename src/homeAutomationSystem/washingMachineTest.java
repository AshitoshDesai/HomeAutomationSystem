package homeAutomationSystem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class washingMachineTest {
	airConditioner a;
	@Before
	public void setUp() throws Exception {
		 a=new airConditioner("ON",20);
	}

	@Test
	public final void testGetButton() {
		//fail("Not yet implemented"); // TODO
		assertEquals("ON",a.getButton());
	}

	@Test
	public final void testGetSpeed() {
		//fail("Not yet implemented"); // TODO
		assertEquals(20,a.getSpeed());
	}

	@Test
	public final void testSetSpeed() {
		//fail("Not yet implemented"); // TODO
		 a=new airConditioner("ON",33);
		assertEquals(33,a.getSpeed());
	}

	
}
