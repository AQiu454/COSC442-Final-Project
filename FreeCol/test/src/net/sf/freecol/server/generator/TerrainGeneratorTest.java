package net.sf.freecol.server.generator;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.model.Map;
import org.junit.*;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.util.LogBuilder;
import net.sf.freecol.common.model.Tile;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import net.sf.freecol.common.model.LandMap;
import net.sf.freecol.server.model.ServerRegion;

/**
 * The class <code>TerrainGeneratorTest</code> contains tests for the class <code>{@link TerrainGenerator}</code>.
 *
 * @generatedBy CodePro at 5/13/18 11:25 PM
 * @author dibasy
 * @version $Revision: 1.0 $
 */
public class TerrainGeneratorTest extends FreeColTestCase{
	/**
	 * Run the TerrainGenerator(Game,Game,Random) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testTerrainGenerator_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Game importGame = new Game(new IIOMetadataNode(), "");
		Random random = new Random();

		TerrainGenerator result = new TerrainGenerator(game, importGame, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the void encodeStyle(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testEncodeStyle_1()
		throws Exception {
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		TerrainGenerator.encodeStyle(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void encodeStyle(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testEncodeStyle_2()
		throws Exception {
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		TerrainGenerator.encodeStyle(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void encodeStyle(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testEncodeStyle_3()
		throws Exception {
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		TerrainGenerator.encodeStyle(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void encodeStyle(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testEncodeStyle_4()
		throws Exception {
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		TerrainGenerator.encodeStyle(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void encodeStyle(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testEncodeStyle_5()
		throws Exception {
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		TerrainGenerator.encodeStyle(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void encodeStyle(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testEncodeStyle_6()
		throws Exception {
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		TerrainGenerator.encodeStyle(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void encodeStyle(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testEncodeStyle_7()
		throws Exception {
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		TerrainGenerator.encodeStyle(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void encodeStyle(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testEncodeStyle_8()
		throws Exception {
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		TerrainGenerator.encodeStyle(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void encodeStyle(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testEncodeStyle_9()
		throws Exception {
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		TerrainGenerator.encodeStyle(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void encodeStyle(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testEncodeStyle_10()
		throws Exception {
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		TerrainGenerator.encodeStyle(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void encodeStyle(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testEncodeStyle_11()
		throws Exception {
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		TerrainGenerator.encodeStyle(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void encodeStyle(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testEncodeStyle_12()
		throws Exception {
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		TerrainGenerator.encodeStyle(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void encodeStyle(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testEncodeStyle_13()
		throws Exception {
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		TerrainGenerator.encodeStyle(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void encodeStyle(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testEncodeStyle_14()
		throws Exception {
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		TerrainGenerator.encodeStyle(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void encodeStyle(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testEncodeStyle_15()
		throws Exception {
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		TerrainGenerator.encodeStyle(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void encodeStyle(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testEncodeStyle_16()
		throws Exception {
		Tile tile = new Tile(new Game(new IIOMetadataNode(), ""), "");

		TerrainGenerator.encodeStyle(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the List<ServerRegion> makeLakes(Map,List<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testMakeLakes_1()
		throws Exception {
		Map map = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		List<Tile> lakes = new LinkedList();

		List<ServerRegion> result = TerrainGenerator.makeLakes(map, lakes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<ServerRegion> makeLakes(Map,List<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testMakeLakes_2()
		throws Exception {
		Map map = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		List<Tile> lakes = new LinkedList();

		List<ServerRegion> result = TerrainGenerator.makeLakes(map, lakes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<ServerRegion> makeLakes(Map,List<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testMakeLakes_3()
		throws Exception {
		Map map = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		List<Tile> lakes = new LinkedList();

		List<ServerRegion> result = TerrainGenerator.makeLakes(map, lakes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<ServerRegion> makeLakes(Map,List<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testMakeLakes_4()
		throws Exception {
		Map map = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		List<Tile> lakes = new LinkedList();

		List<ServerRegion> result = TerrainGenerator.makeLakes(map, lakes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<ServerRegion> makeLakes(Map,List<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testMakeLakes_5()
		throws Exception {
		Map map = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		List<Tile> lakes = new LinkedList();

		List<ServerRegion> result = TerrainGenerator.makeLakes(map, lakes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<ServerRegion> makeLakes(Map,List<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testMakeLakes_6()
		throws Exception {
		Map map = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		List<Tile> lakes = new LinkedList();

		List<ServerRegion> result = TerrainGenerator.makeLakes(map, lakes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the List<ServerRegion> makeLakes(Map,List<Tile>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	@Test
	public void testMakeLakes_7()
		throws Exception {
		Map map = new Map(new Game(new IIOMetadataNode(), ""), 1, 1);
		List<Tile> lakes = new LinkedList();

		List<ServerRegion> result = TerrainGenerator.makeLakes(map, lakes);

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
	 * @generatedBy CodePro at 5/13/18 11:25 PM
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
	 * @generatedBy CodePro at 5/13/18 11:25 PM
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
	 * @generatedBy CodePro at 5/13/18 11:25 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TerrainGeneratorTest.class);
	}
}