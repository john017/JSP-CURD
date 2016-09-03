package aaa;

import static org.junit.Assert.*;

import java.sql.ResultSet;

import org.junit.Test;

public class executeTest {
	private execute exe=new execute();
	@Test
	public void testAdds() {
		fail("");
	}

	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		assertEquals(true, exe.update("asdf", 7));
	}

	@Test
	public void testSearch() {
		fail("Not yet implemented");
	}

}
