package homeAutomationSystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class telivisionTest {
	telivision t=new telivision("ON","starGold","next",10);
	@Test
	public final void testGetChannel() {
		//fail("Not yet implemented"); // TODO
		assertEquals("starGold",t.getChannel());
	}

	@Test
	public final void testSetChannel() {
	//	fail("Not yet implemented"); // TODO
		 t=new telivision("ON","starsport1","next",15);
		assertEquals("starsport1",t.getChannel());
	}

	@Test
	public final void testGetVolume() {
		//fail("Not yet implemented"); // TODO
		assertEquals(10,t.getVolume());
	}

}
