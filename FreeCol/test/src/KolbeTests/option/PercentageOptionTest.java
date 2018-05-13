package net.sf.freecol.common.option;

import org.junit.*;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;

/**
 * The class <code>PercentageOptionTest</code> contains tests for the class <code>{@link PercentageOption}</code>.
 *
 * @generatedBy CodePro at 5/13/18, 2:21 PM
 * @author Kolbe
 * @version $Revision: 1.0 $
 */
public class PercentageOptionTest extends FreeColTestCase {
	/**
	 * Run the PercentageOption(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testPercentageOption_1()
		throws Exception {
		Specification specification = new Specification();

		PercentageOption result = new PercentageOption(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("percentageOption", result.getXMLTagName());
		assertEquals("[null 0%]", result.toString());
		assertEquals(0, result.getMinimumValue());
		assertEquals(100, result.getMaximumValue());
		assertEquals(new Integer(0), result.getValue());
		assertEquals(false, result.isNullValueOK());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<percentageOption value=\"0\" maximumValue=\"100\" minimumValue=\"0\"></percentageOption>", result.serialize());
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

		String result = PercentageOption.getXMLElementTagName();

		// add additional test code here
		assertEquals("percentageOption", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		PercentageOption fixture = new PercentageOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
		fixture.isDefined = true;

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("percentageOption", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		PercentageOption fixture = new PercentageOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
		fixture.isDefined = true;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[null 0%]", result);
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
		new org.junit.runner.JUnitCore().run(PercentageOptionTest.class);
	}
}