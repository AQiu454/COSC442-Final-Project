package net.sf.freecol.server.model;

import java.util.List;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.common.model.Unit;
import java.util.Random;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.server.control.ChangeSet;
import net.sf.freecol.common.model.UnitType;
import org.junit.*;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.Role;
import net.sf.freecol.common.util.RandomChoice;
import net.sf.freecol.common.util.LogBuilder;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import net.sf.freecol.common.model.Player;

/**
 * The class <code>ServerEuropeTest</code> contains tests for the class <code>{@link ServerEurope}</code>.
 *
 * @generatedBy CodePro at 5/8/18 6:21 PM
 * @author dibasy
 * @version $Revision: 1.0 $
 */
public class ServerEuropeTest {
	/**
	 * Run the ServerEurope(Game,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testServerEurope_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		String id = "";

		ServerEurope result = new ServerEurope(game, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the ServerEurope(Game,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testServerEurope_2()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Player owner = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		ServerEurope result = new ServerEurope(game, owner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the boolean csEquipForRole(Unit,Role,int,Random,ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testCsEquipForRole_1()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Role role = new Role("", new Specification());
		int roleCount = 1;
		Random random = new Random();
		ChangeSet cs = new ChangeSet();

		boolean result = fixture.csEquipForRole(unit, role, roleCount, random, cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean csEquipForRole(Unit,Role,int,Random,ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testCsEquipForRole_2()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Role role = new Role("", new Specification());
		int roleCount = 1;
		Random random = new Random();
		ChangeSet cs = new ChangeSet();

		boolean result = fixture.csEquipForRole(unit, role, roleCount, random, cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the void csNewTurn(Random,LogBuilder,ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testCsNewTurn_1()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testCsNewTurn_2()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testCsNewTurn_3()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
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
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testCsNewTurn_4()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
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
	 * Run the boolean equipForRole(Unit,Role,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testEquipForRole_1()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Role role = new Role("", new Specification());
		int roleCount = 1;

		boolean result = fixture.equipForRole(unit, role, roleCount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equipForRole(Unit,Role,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testEquipForRole_2()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		Role role = new Role("", new Specification());
		int roleCount = 1;

		boolean result = fixture.equipForRole(unit, role, roleCount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equipForRole(Unit,Role,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testEquipForRole_3()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		Role role = new Role("", new Specification());
		int roleCount = 1;

		boolean result = fixture.equipForRole(unit, role, roleCount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equipForRole(Unit,Role,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testEquipForRole_4()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		Role role = new Role("", new Specification());
		int roleCount = 1;

		boolean result = fixture.equipForRole(unit, role, roleCount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equipForRole(Unit,Role,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testEquipForRole_5()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		Role role = new Role("", new Specification());
		int roleCount = 1;

		boolean result = fixture.equipForRole(unit, role, roleCount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equipForRole(Unit,Role,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testEquipForRole_6()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		Role role = new Role("", new Specification());
		int roleCount = 1;

		boolean result = fixture.equipForRole(unit, role, roleCount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equipForRole(Unit,Role,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testEquipForRole_7()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		Role role = new Role("", new Specification());
		int roleCount = 1;

		boolean result = fixture.equipForRole(unit, role, roleCount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean equipForRole(Unit,Role,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testEquipForRole_8()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Unit unit = new Unit(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());
		unit.setOwner(new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode()));
		Role role = new Role("", new Specification());
		int roleCount = 1;

		boolean result = fixture.equipForRole(unit, role, roleCount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the UnitType extractRecruitable(int,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testExtractRecruitable_1()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		int slot = 1;
		Random random = new Random();

		UnitType result = fixture.extractRecruitable(slot, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the UnitType extractRecruitable(int,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testExtractRecruitable_2()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		int slot = 1;
		Random random = new Random();

		UnitType result = fixture.extractRecruitable(slot, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void generateFountainRecruits(int,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testGenerateFountainRecruits_1()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		int n = 1;
		Random random = new Random();

		fixture.generateFountainRecruits(n, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void generateFountainRecruits(int,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testGenerateFountainRecruits_2()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		int n = 0;
		Random random = new Random();

		fixture.generateFountainRecruits(n, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the List<RandomChoice<UnitType>> generateRecruitablesList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testGenerateRecruitablesList_1()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");

		List<RandomChoice<UnitType>> result = fixture.generateRecruitablesList();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<RandomChoice<UnitType>> generateRecruitablesList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testGenerateRecruitablesList_2()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");

		List<RandomChoice<UnitType>> result = fixture.generateRecruitablesList();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<RandomChoice<UnitType>> generateRecruitablesList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testGenerateRecruitablesList_3()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");

		List<RandomChoice<UnitType>> result = fixture.generateRecruitablesList();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<RandomChoice<UnitType>> generateRecruitablesList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testGenerateRecruitablesList_4()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");

		List<RandomChoice<UnitType>> result = fixture.generateRecruitablesList();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the String getServerXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testGetServerXMLElementTagName_1()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");

		String result = fixture.getServerXMLElementTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void increasePrice(UnitType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testIncreasePrice_1()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		UnitType unitType = new UnitType("", new Specification());
		int price = 1;

		fixture.increasePrice(unitType, price);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void increasePrice(UnitType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testIncreasePrice_2()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		UnitType unitType = new UnitType("", new Specification());
		int price = 1;

		fixture.increasePrice(unitType, price);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void increasePrice(UnitType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testIncreasePrice_3()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		UnitType unitType = new UnitType("", new Specification());
		int price = 1;

		fixture.increasePrice(unitType, price);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void increasePrice(UnitType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testIncreasePrice_4()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		UnitType unitType = new UnitType("", new Specification());
		int price = 1;

		fixture.increasePrice(unitType, price);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void increasePrice(UnitType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testIncreasePrice_5()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		UnitType unitType = new UnitType("", new Specification());
		int price = 1;

		fixture.increasePrice(unitType, price);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void increasePrice(UnitType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testIncreasePrice_6()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		UnitType unitType = new UnitType("", new Specification());
		int price = 1;

		fixture.increasePrice(unitType, price);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void increasePrice(UnitType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testIncreasePrice_7()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		UnitType unitType = new UnitType("", new Specification());
		int price = 1;

		fixture.increasePrice(unitType, price);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void increasePrice(UnitType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testIncreasePrice_8()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		UnitType unitType = new UnitType("", new Specification());
		int price = 1;

		fixture.increasePrice(unitType, price);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void increaseRecruitmentDifficulty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testIncreaseRecruitmentDifficulty_1()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");

		fixture.increaseRecruitmentDifficulty();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void initializeMigration(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testInitializeMigration_1()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();

		fixture.initializeMigration(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void initializeMigration(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testInitializeMigration_2()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();

		fixture.initializeMigration(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void initializeMigration(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testInitializeMigration_3()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();

		fixture.initializeMigration(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void initializeMigration(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testInitializeMigration_4()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();

		fixture.initializeMigration(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void initializeMigration(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testInitializeMigration_5()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();

		fixture.initializeMigration(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void initializeMigration(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testInitializeMigration_6()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();

		fixture.initializeMigration(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void initializeMigration(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testInitializeMigration_7()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();

		fixture.initializeMigration(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void initializeMigration(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testInitializeMigration_8()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();

		fixture.initializeMigration(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void initializeMigration(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testInitializeMigration_9()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();

		fixture.initializeMigration(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void initializeMigration(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testInitializeMigration_10()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();

		fixture.initializeMigration(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void initializeMigration(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testInitializeMigration_11()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();

		fixture.initializeMigration(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void initializeMigration(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testInitializeMigration_12()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();

		fixture.initializeMigration(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void initializeMigration(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testInitializeMigration_13()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();

		fixture.initializeMigration(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void initializeMigration(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testInitializeMigration_14()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();

		fixture.initializeMigration(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void initializeMigration(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testInitializeMigration_15()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();

		fixture.initializeMigration(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the boolean replaceRecruits(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testReplaceRecruits_1()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();

		boolean result = fixture.replaceRecruits(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean replaceRecruits(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testReplaceRecruits_2()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();

		boolean result = fixture.replaceRecruits(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Run the boolean replaceRecruits(Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	@Test
	public void testReplaceRecruits_3()
		throws Exception {
		ServerEurope fixture = new ServerEurope(new Game(new IIOMetadataNode(), ""), "");
		Random random = new Random();

		boolean result = fixture.replaceRecruits(random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/8/18 6:21 PM
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
	 * @generatedBy CodePro at 5/8/18 6:21 PM
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
	 * @generatedBy CodePro at 5/8/18 6:21 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ServerEuropeTest.class);
	}
}