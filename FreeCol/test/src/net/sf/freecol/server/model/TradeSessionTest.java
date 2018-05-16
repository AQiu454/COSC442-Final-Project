package net.sf.freecol.server.model;

import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import net.sf.freecol.server.control.ChangeSet;
import net.sf.freecol.common.model.Unit;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.Colony;
import net.sf.freecol.common.model.Settlement;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import net.sf.freecol.common.model.Player;

/**
 * The class <code>TradeSessionTest</code> contains tests for the class <code>{@link TradeSession}</code>.
 *
 * @generatedBy CodePro at 5/8/18 6:23 PM
 * @author dibasy
 * @version $Revision: 1.0 $
 */
public class TradeSessionTest {
	/**
	 * Run the TradeSession(Unit,Settlement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:23 PM
	 */
	@Test
	public void testTradeSession_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		Settlement settlement = new Colony(new Game(new IIOMetadataNode(), ""), "");

		TradeSession result = new TradeSession(unit, settlement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the TradeSession(Unit,Settlement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:23 PM
	 */
	@Test
	public void testTradeSession_2()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		Settlement settlement = new Colony(new Game(new IIOMetadataNode(), ""), "");

		TradeSession result = new TradeSession(unit, settlement);

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
	 * @generatedBy CodePro at 5/8/18 6:23 PM
	 */
	@Test
	public void testComplete_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		TradeSession fixture = new TradeSession(unit, new Colony(new Game(new IIOMetadataNode(), ""), ""));
		ChangeSet cs = new ChangeSet();

		fixture.complete(cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the boolean getActionTaken() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:23 PM
	 */
	@Test
	public void testGetActionTaken_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		TradeSession fixture = new TradeSession(unit, new Colony(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.getActionTaken();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean getActionTaken() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:23 PM
	 */
	@Test
	public void testGetActionTaken_2()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		TradeSession fixture = new TradeSession(unit, new Colony(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.getActionTaken();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean getBuy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:23 PM
	 */
	@Test
	public void testGetBuy_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		TradeSession fixture = new TradeSession(unit, new Colony(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.getBuy();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean getBuy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:23 PM
	 */
	@Test
	public void testGetBuy_2()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		TradeSession fixture = new TradeSession(unit, new Colony(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.getBuy();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean getGift() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:23 PM
	 */
	@Test
	public void testGetGift_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		TradeSession fixture = new TradeSession(unit, new Colony(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.getGift();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean getGift() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:23 PM
	 */
	@Test
	public void testGetGift_2()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		TradeSession fixture = new TradeSession(unit, new Colony(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.getGift();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the int getMovesLeft() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:23 PM
	 */
	@Test
	public void testGetMovesLeft_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		TradeSession fixture = new TradeSession(unit, new Colony(new Game(new IIOMetadataNode(), ""), ""));

		int result = fixture.getMovesLeft();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean getSell() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:23 PM
	 */
	@Test
	public void testGetSell_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		TradeSession fixture = new TradeSession(unit, new Colony(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.getSell();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean getSell() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:23 PM
	 */
	@Test
	public void testGetSell_2()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		TradeSession fixture = new TradeSession(unit, new Colony(new Game(new IIOMetadataNode(), ""), ""));

		boolean result = fixture.getSell();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the void setBuy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:23 PM
	 */
	@Test
	public void testSetBuy_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		TradeSession fixture = new TradeSession(unit, new Colony(new Game(new IIOMetadataNode(), ""), ""));

		fixture.setBuy();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setGift() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:23 PM
	 */
	@Test
	public void testSetGift_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		TradeSession fixture = new TradeSession(unit, new Colony(new Game(new IIOMetadataNode(), ""), ""));

		fixture.setGift();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setSell() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:23 PM
	 */
	@Test
	public void testSetSell_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		TradeSession fixture = new TradeSession(unit, new Colony(new Game(new IIOMetadataNode(), ""), ""));

		fixture.setSell();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/8/18 6:23 PM
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
	 * @generatedBy CodePro at 5/8/18 6:23 PM
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
	 * @generatedBy CodePro at 5/8/18 6:23 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TradeSessionTest.class);
	}
}