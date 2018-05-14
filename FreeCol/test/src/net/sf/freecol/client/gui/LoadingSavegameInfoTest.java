package net.sf.freecol.client.gui;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LoadingSavegameInfoTest</code> contains tests for the class <code>{@link LoadingSavegameInfo}</code>.
 *
 * @generatedBy CodePro at 5/8/18 6:48 PM
 * @author dibasy
 * @version $Revision: 1.0 $
 */
public class LoadingSavegameInfoTest {
	/**
	 * Run the LoadingSavegameInfo(boolean,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:48 PM
	 */
	@Test
	public void testLoadingSavegameInfo_1()
		throws Exception {
		boolean singlePlayer = true;
		int port = 1;
		String serverName = "";

		LoadingSavegameInfo result = new LoadingSavegameInfo(singlePlayer, port, serverName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getPort());
		assertEquals("", result.getServerName());
		assertEquals(true, result.isSinglePlayer());
	}

	/**
	 * Run the int getPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:48 PM
	 */
	@Test
	public void testGetPort_1()
		throws Exception {
		LoadingSavegameInfo fixture = new LoadingSavegameInfo(true, 1, "");

		int result = fixture.getPort();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getServerName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:48 PM
	 */
	@Test
	public void testGetServerName_1()
		throws Exception {
		LoadingSavegameInfo fixture = new LoadingSavegameInfo(true, 1, "");

		String result = fixture.getServerName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean isSinglePlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:48 PM
	 */
	@Test
	public void testIsSinglePlayer_1()
		throws Exception {
		LoadingSavegameInfo fixture = new LoadingSavegameInfo(true, 1, "");

		boolean result = fixture.isSinglePlayer();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isSinglePlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:48 PM
	 */
	@Test
	public void testIsSinglePlayer_2()
		throws Exception {
		LoadingSavegameInfo fixture = new LoadingSavegameInfo(false, 1, "");

		boolean result = fixture.isSinglePlayer();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/8/18 6:48 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/8/18 6:48 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/8/18 6:48 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LoadingSavegameInfoTest.class);
	}
}