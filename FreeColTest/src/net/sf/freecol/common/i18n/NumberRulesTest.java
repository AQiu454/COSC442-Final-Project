package net.sf.freecol.common.i18n;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>NumberRulesTest</code> contains tests for the class <code>{@link NumberRules}</code>.
 *
 * @generatedBy CodePro at 5/13/18 2:24 PM
 * @author Club President
 * @version $Revision: 1.0 $
 */
public class NumberRulesTest {
	/**
	 * Run the NumberRules(InputStream) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testNumberRules_1()
		throws Exception {
		InputStream in = new ByteArrayInputStream("".getBytes());

		NumberRules result = new NumberRules(in);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Error parsing number rules.
		//       at net.sf.freecol.common.i18n.NumberRules.load(NumberRules.java:107)
		//       at net.sf.freecol.common.i18n.NumberRules.<init>(NumberRules.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the Number getNumberForLanguage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetNumberForLanguage_1()
		throws Exception {
		String lang = "";

		Number result = NumberRules.getNumberForLanguage(lang);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Number getNumberForLanguage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetNumberForLanguage_2()
		throws Exception {
		String lang = "";

		Number result = NumberRules.getNumberForLanguage(lang);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isInitialized() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testIsInitialized_1()
		throws Exception {

		boolean result = NumberRules.isInitialized();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isInitialized() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testIsInitialized_2()
		throws Exception {

		boolean result = NumberRules.isInitialized();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void load(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoad_1()
		throws Exception {
		InputStream in = new ByteArrayInputStream("".getBytes());

		NumberRules.load(in);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Error parsing number rules.
		//       at net.sf.freecol.common.i18n.NumberRules.load(NumberRules.java:107)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
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
	 * @generatedBy CodePro at 5/13/18 2:24 PM
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
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NumberRulesTest.class);
	}
}