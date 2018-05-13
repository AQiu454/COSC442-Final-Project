package net.sf.freecol.common.option;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MapGeneratorOptionsTest</code> contains tests for the class <code>{@link MapGeneratorOptions}</code>.
 *
 * @generatedBy CodePro at 5/13/18, 2:21 PM
 * @author Kolbe
 * @version $Revision: 1.0 $
 */
public class MapGeneratorOptionsTest {
	/**
	 * Run the MapGeneratorOptions() constructor test.
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testMapGeneratorOptions_1()
		throws Exception {
		MapGeneratorOptions result = new MapGeneratorOptions();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = MapGeneratorOptions.getXMLElementTagName();

		// add additional test code here
		assertEquals("mapGeneratorOptions", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
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
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
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
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MapGeneratorOptionsTest.class);
	}
}