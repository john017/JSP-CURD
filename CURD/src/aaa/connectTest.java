package aaa;
import static org.junit.Assert.*;

import org.junit.Test;

public class connectTest {
private static connect con=new connect();
	@Test
	public void testConnection() {
		assertEquals(true,con.connection());
	}

	@Test
	public void testClose() {
		fail("Not yet implemented");
	}

	@Test
	public void testExeSQL() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetString() {
		fail("Not yet implemented");
	}

}
