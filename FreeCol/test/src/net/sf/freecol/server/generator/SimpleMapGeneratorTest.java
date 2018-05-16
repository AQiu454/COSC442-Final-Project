package net.sf.freecol.server.generator;

import java.util.Random;
import java.util.Vector;

import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import net.sf.freecol.common.model.Map;
import net.sf.freecol.common.model.Nation;
import net.sf.freecol.common.model.NationOptions;
import net.sf.freecol.common.model.Player;
import net.sf.freecol.common.model.Tile;
import net.sf.freecol.common.option.FileOption;
import net.sf.freecol.common.option.MapGeneratorOptions;
import net.sf.freecol.common.model.Game;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import net.sf.freecol.common.util.LogBuilder;
import net.sf.freecol.server.model.ServerGame;
import net.sf.freecol.server.model.ServerPlayer;

/**
 * The class <code>SimpleMapGeneratorTest</code> contains tests for the class <code>{@link SimpleMapGenerator}</code>.
 *
 * @generatedBy CodePro at 5/13/18 10:08 PM
 * @author dibasy
 * @version $Revision: 1.0 $
 */
public class SimpleMapGeneratorTest extends FreeColTestCase{
	/**
	 * Run the SimpleMapGenerator(Game,Random) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 10:08 PM
	 */
	@Test
	public void testSimpleMapGenerator_1()
		throws Exception {
		Game game = new Game(new IIOMetadataNode(), "");
		Random random = new Random();

		SimpleMapGenerator result = new SimpleMapGenerator(game, random);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	 public void testMapGenerator() {
	        ((FileOption) spec().getOption(MapGeneratorOptions.IMPORT_FILE)).setValue(null);

	        Game g = new ServerGame(spec());

	        g.setNationOptions(new NationOptions(spec()));
	        // A new game does not have a map yet
	        assertEquals(null, g.getMap());

	        MapGenerator gen = new SimpleMapGenerator(g, new Random(1));

	        // Apply the difficulty level
	        //spec().applyDifficultyLevel("model.difficulty.medium");

	        Vector<Player> players = new Vector<Player>();

	        for (Nation n : spec().getNations()) {
	            if (n.isUnknownEnemy()) continue;
	            Player p = new ServerPlayer(g, false, n, null, null);
	            p.setAI(!n.getType().isEuropean() || n.getType().isREF());
	            g.addPlayer(p);
	            players.add(p);
	        }

	        gen.createMap(new LogBuilder(-1));

	        // Check that the map is created at all
	        assertNotNull(g.getMap());

	        // Map of correct size?
	        Map m = g.getMap();
	        assertEquals(m.getWidth(),
	                     g.getMapGeneratorOptions().getInteger(MapGeneratorOptions.MAP_WIDTH));
	        assertEquals(m.getHeight(),
	                     g.getMapGeneratorOptions().getInteger(MapGeneratorOptions.MAP_HEIGHT));

	        // Sufficient land?
	        int land = 0;
	        int total = 0;
	        for (Tile t : m.getAllTiles()) {
	            if (t.isLand()) land++;
	            total++;
	        }
	        // Land Mass requirement fulfilled?
	        assertTrue(100 * land / total >= g.getMapGeneratorOptions()
	                   .getInteger(MapGeneratorOptions.LAND_MASS));

	        // Does the wholeMapIterator visit all fields?
	        assertEquals(total,
	                     g.getMapGeneratorOptions().getInteger(MapGeneratorOptions.MAP_WIDTH)
	                     * g.getMapGeneratorOptions().getInteger(MapGeneratorOptions.MAP_HEIGHT));
	    }
	
	/**
	 * Run the Map createEmptyMap(int,int,LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 10:08 PM
	 */
	@Test
	public void testCreateEmptyMap_1()
		throws Exception {
		SimpleMapGenerator fixture = new SimpleMapGenerator(new Game(new IIOMetadataNode(), ""), new Random());
		int width = 1;
		int height = 1;
		LogBuilder lb = new LogBuilder(1);

		Map result = fixture.createEmptyMap(width, height, lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Map createMap(LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 10:08 PM
	 */
	@Test
	public void testCreateMap_1()
		throws Exception {
		SimpleMapGenerator fixture = new SimpleMapGenerator(new Game(new IIOMetadataNode(), ""), new Random());
		LogBuilder lb = new LogBuilder(1);

		Map result = fixture.createMap(lb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Map createMap(LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 10:08 PM
	 */
	@Test
	public void testCreateMap_2()
		throws Exception {
		SimpleMapGenerator fixture = new SimpleMapGenerator(new Game(new IIOMetadataNode(), ""), new Random());
		LogBuilder lb = new LogBuilder(1);

		Map result = fixture.createMap(lb);

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
	 * @generatedBy CodePro at 5/13/18 10:08 PM
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
	 * @generatedBy CodePro at 5/13/18 10:08 PM
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
	 * @generatedBy CodePro at 5/13/18 10:08 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SimpleMapGeneratorTest.class);
	}
}