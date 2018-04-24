package homeAutomationSystem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class lightsTest {
	lights l;
	@Before
	public void setUp() throws Exception {
		 l=new lights("ON");
	}

	@Test
	public final void testLights() {
		//fail("Not yet implemented"); // TODO
		assertEquals("ON",l.getButton());
	}

	

	

}
