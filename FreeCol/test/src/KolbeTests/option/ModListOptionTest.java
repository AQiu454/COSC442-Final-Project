package net.sf.freecol.common.option;

import org.junit.*;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;

/**
 * The class <code>ModListOptionTest</code> contains tests for the class <code>{@link ModListOption}</code>.
 *
 * @generatedBy CodePro at 5/13/18, 2:22 PM
 * @author Kolbe
 * @version $Revision: 1.0 $
 */
public class ModListOptionTest extends FreeColTestCase {
	/**
	 * Run the ModListOption(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testModListOption_1()
		throws Exception {
		Specification specification = new Specification();

		ModListOption result = new ModListOption(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("modListOption", result.getXMLTagName());
		assertEquals(null, result.getTemplate());
		assertEquals(Integer.MAX_VALUE, result.getMaximumValue());
		assertEquals(false, result.allowsDuplicates());
		assertEquals("[null [ ]]", result.toString());
		assertEquals(true, result.isNullValueOK());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<modListOption maximumNumber=\"2147483647\"></modListOption>", result.serialize());
	}

	/**
	 * Run the ModListOption(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testModListOption_2()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		ModListOption result = new ModListOption(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("modListOption", result.getXMLTagName());
		assertEquals(null, result.getTemplate());
		assertEquals(Integer.MAX_VALUE, result.getMaximumValue());
		assertEquals(false, result.allowsDuplicates());
		assertEquals("[ [ ]]", result.toString());
		assertEquals(true, result.isNullValueOK());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<modListOption id=\"\" maximumNumber=\"2147483647\"></modListOption>", result.serialize());
	}

	/**
	 * Run the ModListOption clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testClone_1()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;

		ModListOption result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals("modListOption", result.getXMLTagName());
		assertEquals(null, result.getTemplate());
		assertEquals(Integer.MAX_VALUE, result.getMaximumValue());
		assertEquals(false, result.allowsDuplicates());
		assertEquals("[null [ ]]", result.toString());
		assertEquals(true, result.isNullValueOK());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<modListOption maximumNumber=\"2147483647\"></modListOption>", result.serialize());
	}

	/**
	 * Run the String getXMLElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGetXMLElementTagName_1()
		throws Exception {

		String result = ModListOption.getXMLElementTagName();

		// add additional test code here
		assertEquals("modListOption", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		ModListOption fixture = new ModListOption(new Specification());
		fixture.isDefined = true;
		fixture.allowDuplicates = true;

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("modListOption", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
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
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
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
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ModListOptionTest.class);
	}
}