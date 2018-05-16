package net.sf.freecol.common.i18n;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultNumberRuleTest</code> contains tests for the class <code>{@link DefaultNumberRule}</code>.
 *
 * @generatedBy CodePro at 5/13/18 2:23 PM
 * @author Club President
 * @version $Revision: 1.0 $
 */
public class DefaultNumberRuleTest {
	/**
	 * Run the DefaultNumberRule() constructor test.
	 *
	 * @generatedBy CodePro at 5/13/18 2:23 PM
	 */
	@Test
	public void testDefaultNumberRule_1()
		throws Exception {
		DefaultNumberRule result = new DefaultNumberRule();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void addRule(Category,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:23 PM
	 */
	@Test
	public void testAddRule_1()
		throws Exception {
		DefaultNumberRule fixture = new DefaultNumberRule();
		Number.Category number = Number.Category.few;
		String input = "";

		fixture.addRule(number, input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.remove(Unknown Source)
		//       at net.sf.freecol.common.i18n.Relation.parse(Relation.java:111)
		//       at net.sf.freecol.common.i18n.Relation.<init>(Relation.java:35)
		//       at net.sf.freecol.common.i18n.Rule.parseCondition(Rule.java:99)
		//       at net.sf.freecol.common.i18n.Rule.parse(Rule.java:85)
		//       at net.sf.freecol.common.i18n.Rule.<init>(Rule.java:41)
		//       at net.sf.freecol.common.i18n.DefaultNumberRule.addRule(DefaultNumberRule.java:53)
	}

	/**
	 * Run the void addRule(Category,Rule) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:23 PM
	 */
	@Test
	public void testAddRule_2()
		throws Exception {
		DefaultNumberRule fixture = new DefaultNumberRule();
		Number.Category number = Number.Category.few;
		Rule rule = new Rule("");

		fixture.addRule(number, rule);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.remove(Unknown Source)
		//       at net.sf.freecol.common.i18n.Relation.parse(Relation.java:111)
		//       at net.sf.freecol.common.i18n.Relation.<init>(Relation.java:35)
		//       at net.sf.freecol.common.i18n.Rule.parseCondition(Rule.java:99)
		//       at net.sf.freecol.common.i18n.Rule.parse(Rule.java:85)
		//       at net.sf.freecol.common.i18n.Rule.<init>(Rule.java:41)
	}

	/**
	 * Run the int countRules() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:23 PM
	 */
	@Test
	public void testCountRules_1()
		throws Exception {
		DefaultNumberRule fixture = new DefaultNumberRule();

		int result = fixture.countRules();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Number.Category getCategory(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:23 PM
	 */
	@Test
	public void testGetCategory_1()
		throws Exception {
		DefaultNumberRule fixture = new DefaultNumberRule();
		double input = 1.0;

		Number.Category result = fixture.getCategory(input);

		// add additional test code here
		assertNotNull(result);
		assertEquals("other", result.name());
		assertEquals("other", result.toString());
		assertEquals(5, result.ordinal());
	}

	/**
	 * Run the Rule getRule(Category) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:23 PM
	 */
	@Test
	public void testGetRule_1()
		throws Exception {
		DefaultNumberRule fixture = new DefaultNumberRule();
		Number.Category category = Number.Category.few;

		Rule result = fixture.getRule(category);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/13/18 2:23 PM
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
	 * @generatedBy CodePro at 5/13/18 2:23 PM
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
	 * @generatedBy CodePro at 5/13/18 2:23 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DefaultNumberRuleTest.class);
	}
}