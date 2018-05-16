package net.sf.freecol.common.model.pathfinding;

import java.util.ArrayList;
import net.sf.freecol.common.model.Location;
import net.sf.freecol.common.model.Unit;
import java.util.Collection;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.model.HighSeas;
import net.sf.freecol.common.model.Tile;
import org.junit.*;
import net.sf.freecol.common.model.Game;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import net.sf.freecol.common.model.Player;

/**
 * The class <code>GoalDecidersTest</code> contains tests for the class <code>{@link GoalDeciders}</code>.
 *
 * @generatedBy CodePro at 5/13/18 2:27 PM
 * @author Club President
 * @version $Revision: 1.0 $
 */
public class GoalDecidersTest {
	/**
	 * Run the GoalDecider getAdjacentLocationGoalDecider(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetAdjacentLocationGoalDecider_1()
		throws Exception {
		Location target = new HighSeas(new Game(new IIOMetadataNode(), ""));

		GoalDecider result = GoalDeciders.getAdjacentLocationGoalDecider(target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the GoalDecider getAdjacentLocationGoalDecider(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetAdjacentLocationGoalDecider_2()
		throws Exception {
		Location target = new HighSeas(new Game(new IIOMetadataNode(), ""));

		GoalDecider result = GoalDeciders.getAdjacentLocationGoalDecider(target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the GoalDecider getComposedGoalDecider(boolean,GoalDecider[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetComposedGoalDecider_1()
		throws Exception {
		boolean all = true;
		GoalDecider gd1 = null;
		GoalDecider gd2 = null;

		GoalDecider result = GoalDeciders.getComposedGoalDecider(all, gd1, gd2);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getGoal());
	}

	/**
	 * Run the GoalDecider getComposedGoalDecider(boolean,GoalDecider[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetComposedGoalDecider_2()
		throws Exception {
		boolean all = true;

		GoalDecider result = GoalDeciders.getComposedGoalDecider(all);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the GoalDecider getCornerGoalDecider() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetCornerGoalDecider_1()
		throws Exception {

		GoalDecider result = GoalDeciders.getCornerGoalDecider();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.hasSubGoals());
		assertEquals(null, result.getGoal());
	}

	/**
	 * Run the GoalDecider getDisembarkGoalDecider(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetDisembarkGoalDecider_1()
		throws Exception {
		Tile target = new Tile(new Game(new IIOMetadataNode(), ""), "");

		GoalDecider result = GoalDeciders.getDisembarkGoalDecider(target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the GoalDecider getEnemySettlementGoalDecider(Collection<Player>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetEnemySettlementGoalDecider_1()
		throws Exception {
		Collection<Player> enemies = new ArrayList<Player>();

		GoalDecider result = GoalDeciders.getEnemySettlementGoalDecider(enemies);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasSubGoals());
		assertEquals(null, result.getGoal());
	}

	/**
	 * Run the GoalDecider getHighSeasGoalDecider() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetHighSeasGoalDecider_1()
		throws Exception {

		GoalDecider result = GoalDeciders.getHighSeasGoalDecider();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasSubGoals());
		assertEquals(null, result.getGoal());
	}

	/**
	 * Run the GoalDecider getLocationGoalDecider(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetLocationGoalDecider_1()
		throws Exception {
		Location target = new HighSeas(new Game(new IIOMetadataNode(), ""));

		GoalDecider result = GoalDeciders.getLocationGoalDecider(target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the GoalDecider getOurClosestSettlementGoalDecider() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetOurClosestSettlementGoalDecider_1()
		throws Exception {

		GoalDecider result = GoalDeciders.getOurClosestSettlementGoalDecider();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.hasSubGoals());
		assertEquals(null, result.getGoal());
	}

	/**
	 * Run the GoalDecider getReduceHighSeasCountGoalDecider(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetReduceHighSeasCountGoalDecider_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		GoalDecider result = GoalDeciders.getReduceHighSeasCountGoalDecider(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the GoalDecider getSimpleHighSeasGoalDecider() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetSimpleHighSeasGoalDecider_1()
		throws Exception {

		GoalDecider result = GoalDeciders.getSimpleHighSeasGoalDecider();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasSubGoals());
		assertEquals(null, result.getGoal());
	}

	/**
	 * Run the GoalDecider getStealthyGoalDecider(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:27 PM
	 */
	@Test
	public void testGetStealthyGoalDecider_1()
		throws Exception {
		Player enemy = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		GoalDecider result = GoalDeciders.getStealthyGoalDecider(enemy);

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
		new org.junit.runner.JUnitCore().run(GoalDecidersTest.class);
	}
}