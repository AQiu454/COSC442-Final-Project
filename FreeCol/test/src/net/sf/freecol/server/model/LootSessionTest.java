package net.sf.freecol.server.model;

import java.util.LinkedList;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.model.Game;
import org.junit.*;
import net.sf.freecol.server.control.ChangeSet;
import net.sf.freecol.common.model.Unit;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import net.sf.freecol.common.model.Goods;

/**
 * The class <code>LootSessionTest</code> contains tests for the class <code>{@link LootSession}</code>.
 *
 * @generatedBy CodePro at 5/8/18 5:58 PM
 * @author dibasy
 * @version $Revision: 1.0 $
 */
public class LootSessionTest extends FreeColTestCase{
	/**
	 * Run the LootSession(Unit,Unit,List<Goods>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testLootSession_1()
		throws Exception {
		Unit winner = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Unit loser = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		List<Goods> capture = new LinkedList();

		LootSession result = new LootSession(winner, loser, capture);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void complete(ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testComplete_1()
		throws Exception {
		LootSession fixture = new LootSession(new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new LinkedList());
		ChangeSet cs = new ChangeSet();

		fixture.complete(cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the List<Goods> getCapture() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testGetCapture_1()
		throws Exception {
		LootSession fixture = new LootSession(new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new LinkedList());

		List<Goods> result = fixture.getCapture();

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
	 * @generatedBy CodePro at 5/8/18 5:58 PM
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
	 * @generatedBy CodePro at 5/8/18 5:58 PM
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
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LootSessionTest.class);
	}
}