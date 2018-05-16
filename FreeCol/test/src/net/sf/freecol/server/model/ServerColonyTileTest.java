package net.sf.freecol.server.model;

import java.util.Random;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import net.sf.freecol.server.control.ChangeSet;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.Colony;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import net.sf.freecol.common.util.LogBuilder;
import net.sf.freecol.common.model.Tile;

/**
 * The class <code>ServerColonyTileTest</code> contains tests for the class <code>{@link ServerColonyTile}</code>.
 *
 * @generatedBy CodePro at 5/8/18 6:20 PM
 * @author dibasy
 * @version $Revision: 1.0 $
 */
public class ServerColonyTileTest {
	/**
	 * Run the ServerColonyTile(Game,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:20 PM
	 */
	@Test
	public void testServerColonyTile_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		String id = "";

		ServerColonyTile result = new ServerColonyTile(game, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ServerColonyTile(Game,Colony,Tile) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:20 PM
	 */
	@Test
	public void testServerColonyTile_2()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Colony colony = new Colony(new Game(new IIOMetadataNode(), ""), "");
		Tile workTile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		ServerColonyTile result = new ServerColonyTile(game, colony, workTile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void csNewTurn(Random,LogBuilder,ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:20 PM
	 */
	@Test
	public void testCsNewTurn_1()
		throws Exception {
		ServerColonyTile fixture = new ServerColonyTile(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();
		LogBuilder lb = new LogBuilder(1);
		ChangeSet cs = new ChangeSet();

		fixture.csNewTurn(random, lb, cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void csNewTurn(Random,LogBuilder,ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:20 PM
	 */
	@Test
	public void testCsNewTurn_2()
		throws Exception {
		ServerColonyTile fixture = new ServerColonyTile(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();
		LogBuilder lb = new LogBuilder(1);
		ChangeSet cs = new ChangeSet();

		fixture.csNewTurn(random, lb, cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void csNewTurn(Random,LogBuilder,ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:20 PM
	 */
	@Test
	public void testCsNewTurn_3()
		throws Exception {
		ServerColonyTile fixture = new ServerColonyTile(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();
		LogBuilder lb = new LogBuilder(1);
		ChangeSet cs = new ChangeSet();

		fixture.csNewTurn(random, lb, cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void csNewTurn(Random,LogBuilder,ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:20 PM
	 */
	@Test
	public void testCsNewTurn_4()
		throws Exception {
		ServerColonyTile fixture = new ServerColonyTile(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();
		LogBuilder lb = new LogBuilder(1);
		ChangeSet cs = new ChangeSet();

		fixture.csNewTurn(random, lb, cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void csNewTurn(Random,LogBuilder,ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:20 PM
	 */
	@Test
	public void testCsNewTurn_5()
		throws Exception {
		ServerColonyTile fixture = new ServerColonyTile(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();
		LogBuilder lb = new LogBuilder(1);
		ChangeSet cs = new ChangeSet();

		fixture.csNewTurn(random, lb, cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void csNewTurn(Random,LogBuilder,ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:20 PM
	 */
	@Test
	public void testCsNewTurn_6()
		throws Exception {
		ServerColonyTile fixture = new ServerColonyTile(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();
		LogBuilder lb = new LogBuilder(1);
		ChangeSet cs = new ChangeSet();

		fixture.csNewTurn(random, lb, cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the String getServerXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:20 PM
	 */
	@Test
	public void testGetServerXMLElementTagName_1()
		throws Exception {
		ServerColonyTile fixture = new ServerColonyTile(new Game(new IIOMetadataNode(), ""), "");

		String result = fixture.getServerXMLElementTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/8/18 6:20 PM
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
	 * @generatedBy CodePro at 5/8/18 6:20 PM
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
	 * @generatedBy CodePro at 5/8/18 6:20 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ServerColonyTileTest.class);
	}
}