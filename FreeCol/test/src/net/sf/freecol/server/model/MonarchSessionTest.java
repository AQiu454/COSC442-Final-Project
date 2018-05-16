package net.sf.freecol.server.model;

import java.io.InputStream;
import java.io.PipedInputStream;
import java.util.LinkedList;
import net.sf.freecol.common.model.AbstractUnit;
import net.sf.freecol.common.model.Monarch;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.server.control.ChangeSet;
import org.junit.*;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.Goods;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>MonarchSessionTest</code> contains tests for the class <code>{@link MonarchSession}</code>.
 *
 * @generatedBy CodePro at 5/8/18 5:58 PM
 * @author dibasy
 * @version $Revision: 1.0 $
 */
public class MonarchSessionTest {
	/**
	 * Run the MonarchSession(ServerPlayer,MonarchAction,int,Goods) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testMonarchSession_1()
		throws Exception {
		ServerPlayer serverPlayer = new ServerPlayer(new Game(new IIOMetadataNode(), ""), "");
		net.sf.freecol.common.model.Monarch.MonarchAction action = net.sf.freecol.common.model.Monarch.MonarchAction.ADD_TO_REF;
		int tax = 1;
		Goods goods = new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new PipedInputStream()));

		MonarchSession result = new MonarchSession(serverPlayer, action, tax, goods);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the MonarchSession(ServerPlayer,MonarchAction,List<AbstractUnit>,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testMonarchSession_2()
		throws Exception {
		ServerPlayer serverPlayer = new ServerPlayer(new Game(new IIOMetadataNode(), ""), "");
		net.sf.freecol.common.model.Monarch.MonarchAction action = net.sf.freecol.common.model.Monarch.MonarchAction.ADD_TO_REF;
		List<AbstractUnit> mercenaries = new LinkedList();
		int price = 1;

		MonarchSession result = new MonarchSession(serverPlayer, action, mercenaries, price);

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
		MonarchSession fixture = new MonarchSession(new ServerPlayer(new Game(new IIOMetadataNode(), ""), ""), net.sf.freecol.common.model.Monarch.MonarchAction.ADD_TO_REF, 1, new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new PipedInputStream())));
		ChangeSet cs = new ChangeSet();

		fixture.complete(cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void complete(ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testComplete_2()
		throws Exception {
		MonarchSession fixture = new MonarchSession(new ServerPlayer(new Game(new IIOMetadataNode(), ""), ""), net.sf.freecol.common.model.Monarch.MonarchAction.ADD_TO_REF, 1, new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new PipedInputStream())));
		ChangeSet cs = new ChangeSet();

		fixture.complete(cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void complete(ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testComplete_3()
		throws Exception {
		MonarchSession fixture = new MonarchSession(new ServerPlayer(new Game(new IIOMetadataNode(), ""), ""), net.sf.freecol.common.model.Monarch.MonarchAction.ADD_TO_REF, 1, new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new PipedInputStream())));
		ChangeSet cs = new ChangeSet();

		fixture.complete(cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void complete(ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testComplete_4()
		throws Exception {
		MonarchSession fixture = new MonarchSession(new ServerPlayer(new Game(new IIOMetadataNode(), ""), ""), net.sf.freecol.common.model.Monarch.MonarchAction.ADD_TO_REF, 1, new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new PipedInputStream())));
		ChangeSet cs = new ChangeSet();

		fixture.complete(cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void complete(ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testComplete_5()
		throws Exception {
		MonarchSession fixture = new MonarchSession(new ServerPlayer(new Game(new IIOMetadataNode(), ""), ""), net.sf.freecol.common.model.Monarch.MonarchAction.ADD_TO_REF, 1, new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new PipedInputStream())));
		ChangeSet cs = new ChangeSet();

		fixture.complete(cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void complete(boolean,ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testComplete_6()
		throws Exception {
		MonarchSession fixture = new MonarchSession(new ServerPlayer(new Game(new IIOMetadataNode(), ""), ""), net.sf.freecol.common.model.Monarch.MonarchAction.ADD_TO_REF, 1, new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new PipedInputStream())));
		boolean result = true;
		ChangeSet cs = new ChangeSet();

		fixture.complete(result, cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void complete(boolean,ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testComplete_7()
		throws Exception {
		MonarchSession fixture = new MonarchSession(new ServerPlayer(new Game(new IIOMetadataNode(), ""), ""), net.sf.freecol.common.model.Monarch.MonarchAction.ADD_TO_REF, 1, new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new PipedInputStream())));
		boolean result = true;
		ChangeSet cs = new ChangeSet();

		fixture.complete(result, cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void complete(boolean,ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testComplete_8()
		throws Exception {
		MonarchSession fixture = new MonarchSession(new ServerPlayer(new Game(new IIOMetadataNode(), ""), ""), net.sf.freecol.common.model.Monarch.MonarchAction.ADD_TO_REF, 1, new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new PipedInputStream())));
		boolean result = true;
		ChangeSet cs = new ChangeSet();

		fixture.complete(result, cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void complete(boolean,ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testComplete_9()
		throws Exception {
		MonarchSession fixture = new MonarchSession(new ServerPlayer(new Game(new IIOMetadataNode(), ""), ""), net.sf.freecol.common.model.Monarch.MonarchAction.ADD_TO_REF, 1, new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new PipedInputStream())));
		boolean result = true;
		ChangeSet cs = new ChangeSet();

		fixture.complete(result, cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void complete(boolean,ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testComplete_10()
		throws Exception {
		MonarchSession fixture = new MonarchSession(new ServerPlayer(new Game(new IIOMetadataNode(), ""), ""), net.sf.freecol.common.model.Monarch.MonarchAction.ADD_TO_REF, 1, new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new PipedInputStream())));
		boolean result = false;
		ChangeSet cs = new ChangeSet();

		fixture.complete(result, cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void complete(boolean,ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testComplete_11()
		throws Exception {
		MonarchSession fixture = new MonarchSession(new ServerPlayer(new Game(new IIOMetadataNode(), ""), ""), net.sf.freecol.common.model.Monarch.MonarchAction.ADD_TO_REF, 1, new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new PipedInputStream())));
		boolean result = false;
		ChangeSet cs = new ChangeSet();

		fixture.complete(result, cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void complete(boolean,ChangeSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testComplete_12()
		throws Exception {
		MonarchSession fixture = new MonarchSession(new ServerPlayer(new Game(new IIOMetadataNode(), ""), ""), net.sf.freecol.common.model.Monarch.MonarchAction.ADD_TO_REF, 1, new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new PipedInputStream())));
		boolean result = true;
		ChangeSet cs = new ChangeSet();

		fixture.complete(result, cs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the net.sf.freecol.common.model.Monarch.MonarchAction getAction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testGetAction_1()
		throws Exception {
		MonarchSession fixture = new MonarchSession(new ServerPlayer(new Game(new IIOMetadataNode(), ""), ""), net.sf.freecol.common.model.Monarch.MonarchAction.ADD_TO_REF, 1, new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new PipedInputStream())));

		net.sf.freecol.common.model.Monarch.MonarchAction result = fixture.getAction();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Goods getGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testGetGoods_1()
		throws Exception {
		MonarchSession fixture = new MonarchSession(new ServerPlayer(new Game(new IIOMetadataNode(), ""), ""), net.sf.freecol.common.model.Monarch.MonarchAction.ADD_TO_REF, 1, new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new PipedInputStream())));

		Goods result = fixture.getGoods();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<AbstractUnit> getMercenaries() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testGetMercenaries_1()
		throws Exception {
		MonarchSession fixture = new MonarchSession(new ServerPlayer(new Game(new IIOMetadataNode(), ""), ""), net.sf.freecol.common.model.Monarch.MonarchAction.ADD_TO_REF, 1, new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new PipedInputStream())));

		List<AbstractUnit> result = fixture.getMercenaries();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the int getPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testGetPrice_1()
		throws Exception {
		MonarchSession fixture = new MonarchSession(new ServerPlayer(new Game(new IIOMetadataNode(), ""), ""), net.sf.freecol.common.model.Monarch.MonarchAction.ADD_TO_REF, 1, new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new PipedInputStream())));

		int result = fixture.getPrice();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
	}

	/**
	 * Run the int getTax() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 5:58 PM
	 */
	@Test
	public void testGetTax_1()
		throws Exception {
		MonarchSession fixture = new MonarchSession(new ServerPlayer(new Game(new IIOMetadataNode(), ""), ""), net.sf.freecol.common.model.Monarch.MonarchAction.ADD_TO_REF, 1, new Goods(new Game(new IIOMetadataNode(), ""), new FreeColXMLReader(new PipedInputStream())));

		int result = fixture.getTax();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertEquals(0, result);
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
		new org.junit.runner.JUnitCore().run(MonarchSessionTest.class);
	}
}