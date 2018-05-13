package net.sf.freecol.common.option;

import org.junit.*;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;

/**
 * The class <code>RangeOptionTest</code> contains tests for the class <code>{@link RangeOption}</code>.
 *
 * @generatedBy CodePro at 5/13/18, 2:21 PM
 * @author Kolbe
 * @version $Revision: 1.0 $
 */
public class RangeOptionTest extends FreeColTestCase {
	/**
	 * Run the RangeOption(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testRangeOption_1()
		throws Exception {
		Specification specification = new Specification();

		RangeOption result = new RangeOption(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("rangeValue", result.getXMLItemElementTagName());
		assertEquals(0, result.getValueRank());
		assertEquals("rangeOption", result.getXMLTagName());
		assertEquals(false, result.localizeLabels());
		assertEquals("[null value=0 localized=false]", result.toString());
		assertEquals(Integer.MIN_VALUE, result.getMinimumValue());
		assertEquals(Integer.MAX_VALUE, result.getMaximumValue());
		assertEquals(new Integer(0), result.getValue());
		assertEquals(false, result.isNullValueOK());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<rangeOption value=\"0\" localizedLabels=\"false\"></rangeOption>", result.serialize());
	}

	/**
	 * Run the int getValueRank() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testGetValueRank_1()
		throws Exception {
		RangeOption fixture = new RangeOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;

		int result = fixture.getValueRank();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getValueRank() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testGetValueRank_2()
		throws Exception {
		RangeOption fixture = new RangeOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;

		int result = fixture.getValueRank();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getValueRank() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testGetValueRank_3()
		throws Exception {
		RangeOption fixture = new RangeOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;

		int result = fixture.getValueRank();

		// add additional test code here
		assertEquals(0, result);
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

		String result = RangeOption.getXMLElementTagName();

		// add additional test code here
		assertEquals("rangeOption", result);
	}

	/**
	 * Run the String getXMLItemElementTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testGetXMLItemElementTagName_1()
		throws Exception {
		RangeOption fixture = new RangeOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;

		String result = fixture.getXMLItemElementTagName();

		// add additional test code here
		assertEquals("rangeValue", result);
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
		RangeOption fixture = new RangeOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("rangeOption", result);
	}

	/**
	 * Run the void setValueRank(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testSetValueRank_1()
		throws Exception {
		RangeOption fixture = new RangeOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		int rank = 1;

		fixture.setValueRank(rank);

		// add additional test code here
	}

	/**
	 * Run the void setValueRank(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testSetValueRank_2()
		throws Exception {
		RangeOption fixture = new RangeOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		int rank = -1;

		fixture.setValueRank(rank);

		// add additional test code here
	}

	/**
	 * Run the void setValueRank(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testSetValueRank_3()
		throws Exception {
		RangeOption fixture = new RangeOption(new Specification());
		fixture.localizedLabels = true;
		fixture.isDefined = true;
		int rank = 1;

		fixture.setValueRank(rank);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(RangeOptionTest.class);
	}
}