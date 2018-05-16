package net.sf.freecol.server.model;

import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import net.sf.freecol.server.control.ChangeSet;
import net.sf.freecol.common.model.DiplomaticTrade;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.Unit;
import net.sf.freecol.common.model.Colony;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import net.sf.freecol.common.model.Settlement;

/**
 * The class <code>DiplomacySessionTest</code> contains tests for the class <code>{@link DiplomacySession}</code>.
 *
 * @generatedBy CodePro at 5/8/18 5:57 PM
 * @author dibasy
 * @version $Revision: 1.0 $
 */
public class DiplomacySessionTest extends FreeColTestCase{
	/**
	 * Run the DiplomacySession(Unit,Settlement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:57 PM
	 */
	@Test
	public void testDiplomacySession_1()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Settlement settlement = new Colony(new Game(new IIOMetadataNode(), ""), "");

		DiplomacySession result = new DiplomacySession(unit, settlement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the DiplomacySession(Unit,Unit) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:57 PM
	 */
	@Test
	public void testDiplomacySession_2()
		throws Exception {
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Unit otherUnit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		DiplomacySession result = new DiplomacySession(unit, otherUnit);

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
	 * @generatedBy CodePro at 5/8/18 5:57 PM
	 */
	@Test
	public void testComplete_1()
		throws Exception {
		DiplomacySession fixture = new DiplomacySession(new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setAgreement(new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		ChangeSet cs = new ChangeSet();

		fixture.complete(cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the DiplomaticTrade getAgreement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:57 PM
	 */
	@Test
	public void testGetAgreement_1()
		throws Exception {
		DiplomacySession fixture = new DiplomacySession(new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setAgreement(new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		DiplomaticTrade result = fixture.getAgreement();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Unit getOtherUnit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:57 PM
	 */
	@Test
	public void testGetOtherUnit_1()
		throws Exception {
		DiplomacySession fixture = new DiplomacySession(new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setAgreement(new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		Unit result = fixture.getOtherUnit();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Settlement getSettlement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:57 PM
	 */
	@Test
	public void testGetSettlement_1()
		throws Exception {
		DiplomacySession fixture = new DiplomacySession(new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setAgreement(new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		Settlement result = fixture.getSettlement();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Unit getUnit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:57 PM
	 */
	@Test
	public void testGetUnit_1()
		throws Exception {
		DiplomacySession fixture = new DiplomacySession(new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setAgreement(new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));

		Unit result = fixture.getUnit();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void setAgreement(DiplomaticTrade) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:57 PM
	 */
	@Test
	public void testSetAgreement_1()
		throws Exception {
		DiplomacySession fixture = new DiplomacySession(new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()), new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		fixture.setAgreement(new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		DiplomaticTrade agreement = new DiplomaticTrade(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		fixture.setAgreement(agreement);

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
	 * @generatedBy CodePro at 5/8/18 5:57 PM
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
	 * @generatedBy CodePro at 5/8/18 5:57 PM
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
	 * @generatedBy CodePro at 5/8/18 5:57 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DiplomacySessionTest.class);
	}
}