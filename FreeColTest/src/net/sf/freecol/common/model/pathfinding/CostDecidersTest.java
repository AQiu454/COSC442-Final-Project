package net.sf.freecol.common.model.pathfinding;

import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import net.sf.freecol.common.model.Unit;
import net.sf.freecol.common.model.Game;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>CostDecidersTest</code> contains tests for the class <code>{@link CostDeciders}</code>.
 *
 * @generatedBy CodePro at 5/13/18 2:27 PM
 * @author Club President
 * @version $Revision: 1.0 $
 */
public class CostDecidersTest {
	/**
	 * Run the CostDeciders() constructor test.
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testCostDeciders_1()
		throws Exception {
		CostDeciders result = new CostDeciders();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the CostDecider avoidIllegal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testAvoidIllegal_1()
		throws Exception {

		CostDecider result = CostDeciders.avoidIllegal();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getNewTurns());
		assertEquals(0, result.getMovesLeft());
	}

	/**
	 * Run the CostDecider avoidNavalDanger() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testAvoidNavalDanger_1()
		throws Exception {

		CostDecider result = CostDeciders.avoidNavalDanger();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getNewTurns());
		assertEquals(0, result.getMovesLeft());
	}

	/**
	 * Run the CostDecider avoidSettlements() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testAvoidSettlements_1()
		throws Exception {

		CostDecider result = CostDeciders.avoidSettlements();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getNewTurns());
		assertEquals(0, result.getMovesLeft());
	}

	/**
	 * Run the CostDecider avoidSettlementsAndBlockingUnits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testAvoidSettlementsAndBlockingUnits_1()
		throws Exception {

		CostDecider result = CostDeciders.avoidSettlementsAndBlockingUnits();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getNewTurns());
		assertEquals(0, result.getMovesLeft());
	}

	/**
	 * Run the CostDecider defaultCostDeciderFor(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testDefaultCostDeciderFor_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		CostDecider result = CostDeciders.defaultCostDeciderFor(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the CostDecider defaultCostDeciderFor(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testDefaultCostDeciderFor_2()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		CostDecider result = CostDeciders.defaultCostDeciderFor(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the CostDecider defaultCostDeciderFor(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testDefaultCostDeciderFor_3()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		CostDecider result = CostDeciders.defaultCostDeciderFor(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the CostDecider defaultCostDeciderFor(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testDefaultCostDeciderFor_4()
		throws Exception {
		Unit unit = null;

		CostDecider result = CostDeciders.defaultCostDeciderFor(unit);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getNewTurns());
		assertEquals(0, result.getMovesLeft());
	}

	/**
	 * Run the CostDecider getComposedCostDecider(CostDecider[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetComposedCostDecider_1()
		throws Exception {
		CostDecider cd1 = null;
		CostDecider cd2 = null;

		CostDecider result = CostDeciders.getComposedCostDecider(cd1, cd2);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getNewTurns());
		assertEquals(0, result.getMovesLeft());
	}

	/**
	 * Run the CostDecider getComposedCostDecider(CostDecider[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetComposedCostDecider_2()
		throws Exception {

		CostDecider result = CostDeciders.getComposedCostDecider();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CostDecider numberOfLegalTiles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testNumberOfLegalTiles_1()
		throws Exception {

		CostDecider result = CostDeciders.numberOfLegalTiles();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getNewTurns());
		assertEquals(0, result.getMovesLeft());
	}

	/**
	 * Run the CostDecider numberOfTiles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testNumberOfTiles_1()
		throws Exception {

		CostDecider result = CostDeciders.numberOfTiles();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getNewTurns());
		assertEquals(0, result.getMovesLeft());
	}

	/**
	 * Run the CostDecider serverAvoidIllegal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testServerAvoidIllegal_1()
		throws Exception {

		CostDecider result = CostDeciders.serverAvoidIllegal();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getNewTurns());
		assertEquals(0, result.getMovesLeft());
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
		new org.junit.runner.JUnitCore().run(CostDecidersTest.class);
	}
}