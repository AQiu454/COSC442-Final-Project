package net.sf.freecol.common.model.pathfinding;

import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.model.HighSeas;
import org.junit.*;
import net.sf.freecol.common.model.Location;
import net.sf.freecol.common.model.Unit;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import net.sf.freecol.common.model.UnitType;

/**
 * The class <code>BaseCostDeciderTest</code> contains tests for the class <code>{@link BaseCostDecider}</code>.
 *
 * @generatedBy CodePro at 5/13/18 2:27 PM
 * @author Club President
 * @version $Revision: 1.0 $
 */
public class BaseCostDeciderTest {
	/**
	 * Run the int getCost(Unit,Location,Location,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetCost_1()
		throws Exception {
		BaseCostDecider fixture = new BaseCostDecider();
		fixture.movesLeft = 1;
		fixture.newTurns = 1;
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setType(new UnitType("", new Specification()));
		Location oldLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location newLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		int movesLeftBefore = 1;

		int result = fixture.getCost(unit, oldLocation, newLocation, movesLeftBefore);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCost(Unit,Location,Location,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetCost_2()
		throws Exception {
		BaseCostDecider fixture = new BaseCostDecider();
		fixture.movesLeft = 1;
		fixture.newTurns = 1;
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Location oldLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location newLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		int movesLeftBefore = 1;

		int result = fixture.getCost(unit, oldLocation, newLocation, movesLeftBefore);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCost(Unit,Location,Location,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetCost_3()
		throws Exception {
		BaseCostDecider fixture = new BaseCostDecider();
		fixture.movesLeft = 1;
		fixture.newTurns = 1;
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setType(new UnitType("", new Specification()));
		Location oldLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location newLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		int movesLeftBefore = 1;

		int result = fixture.getCost(unit, oldLocation, newLocation, movesLeftBefore);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCost(Unit,Location,Location,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetCost_4()
		throws Exception {
		BaseCostDecider fixture = new BaseCostDecider();
		fixture.movesLeft = 1;
		fixture.newTurns = 1;
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Location oldLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location newLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		int movesLeftBefore = 1;

		int result = fixture.getCost(unit, oldLocation, newLocation, movesLeftBefore);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCost(Unit,Location,Location,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetCost_5()
		throws Exception {
		BaseCostDecider fixture = new BaseCostDecider();
		fixture.movesLeft = 1;
		fixture.newTurns = 1;
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Location oldLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location newLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		int movesLeftBefore = 1;

		int result = fixture.getCost(unit, oldLocation, newLocation, movesLeftBefore);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCost(Unit,Location,Location,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetCost_6()
		throws Exception {
		BaseCostDecider fixture = new BaseCostDecider();
		fixture.movesLeft = 1;
		fixture.newTurns = 1;
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Location oldLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location newLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		int movesLeftBefore = 1;

		int result = fixture.getCost(unit, oldLocation, newLocation, movesLeftBefore);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCost(Unit,Location,Location,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetCost_7()
		throws Exception {
		BaseCostDecider fixture = new BaseCostDecider();
		fixture.movesLeft = 1;
		fixture.newTurns = 1;
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Location oldLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location newLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		int movesLeftBefore = 1;

		int result = fixture.getCost(unit, oldLocation, newLocation, movesLeftBefore);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCost(Unit,Location,Location,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetCost_8()
		throws Exception {
		BaseCostDecider fixture = new BaseCostDecider();
		fixture.movesLeft = 1;
		fixture.newTurns = 1;
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Location oldLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location newLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		int movesLeftBefore = 1;

		int result = fixture.getCost(unit, oldLocation, newLocation, movesLeftBefore);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCost(Unit,Location,Location,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetCost_9()
		throws Exception {
		BaseCostDecider fixture = new BaseCostDecider();
		fixture.movesLeft = 1;
		fixture.newTurns = 1;
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Location oldLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location newLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		int movesLeftBefore = 1;

		int result = fixture.getCost(unit, oldLocation, newLocation, movesLeftBefore);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCost(Unit,Location,Location,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetCost_10()
		throws Exception {
		BaseCostDecider fixture = new BaseCostDecider();
		fixture.movesLeft = 1;
		fixture.newTurns = 1;
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Location oldLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location newLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		int movesLeftBefore = 1;

		int result = fixture.getCost(unit, oldLocation, newLocation, movesLeftBefore);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCost(Unit,Location,Location,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetCost_11()
		throws Exception {
		BaseCostDecider fixture = new BaseCostDecider();
		fixture.movesLeft = 1;
		fixture.newTurns = 1;
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Location oldLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location newLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		int movesLeftBefore = 1;

		int result = fixture.getCost(unit, oldLocation, newLocation, movesLeftBefore);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCost(Unit,Location,Location,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetCost_12()
		throws Exception {
		BaseCostDecider fixture = new BaseCostDecider();
		fixture.movesLeft = 1;
		fixture.newTurns = 1;
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Location oldLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location newLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		int movesLeftBefore = 1;

		int result = fixture.getCost(unit, oldLocation, newLocation, movesLeftBefore);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCost(Unit,Location,Location,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetCost_13()
		throws Exception {
		BaseCostDecider fixture = new BaseCostDecider();
		fixture.movesLeft = 1;
		fixture.newTurns = 1;
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Location oldLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location newLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		int movesLeftBefore = 1;

		int result = fixture.getCost(unit, oldLocation, newLocation, movesLeftBefore);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCost(Unit,Location,Location,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetCost_14()
		throws Exception {
		BaseCostDecider fixture = new BaseCostDecider();
		fixture.movesLeft = 1;
		fixture.newTurns = 1;
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Location oldLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location newLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		int movesLeftBefore = 1;

		int result = fixture.getCost(unit, oldLocation, newLocation, movesLeftBefore);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCost(Unit,Location,Location,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetCost_15()
		throws Exception {
		BaseCostDecider fixture = new BaseCostDecider();
		fixture.movesLeft = 1;
		fixture.newTurns = 1;
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setType(new UnitType("", new Specification()));
		Location oldLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location newLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		int movesLeftBefore = 1;

		int result = fixture.getCost(unit, oldLocation, newLocation, movesLeftBefore);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getCost(Unit,Location,Location,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetCost_16()
		throws Exception {
		BaseCostDecider fixture = new BaseCostDecider();
		fixture.movesLeft = 1;
		fixture.newTurns = 1;
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setType(new UnitType("", new Specification()));
		Location oldLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		Location newLocation = new HighSeas(new Game(new IIOMetadataNode(), ""));
		int movesLeftBefore = 1;

		int result = fixture.getCost(unit, oldLocation, newLocation, movesLeftBefore);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getMovesLeft() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetMovesLeft_1()
		throws Exception {
		BaseCostDecider fixture = new BaseCostDecider();
		fixture.movesLeft = 1;
		fixture.newTurns = 1;

		int result = fixture.getMovesLeft();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getNewTurns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetNewTurns_1()
		throws Exception {
		BaseCostDecider fixture = new BaseCostDecider();
		fixture.movesLeft = 1;
		fixture.newTurns = 1;

		int result = fixture.getNewTurns();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
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
	 * @generatedBy CodePro at 5/13/18 2:27 PM
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
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BaseCostDeciderTest.class);
	}
}