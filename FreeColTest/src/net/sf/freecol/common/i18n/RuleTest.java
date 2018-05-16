package net.sf.freecol.common.i18n;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RuleTest</code> contains tests for the class <code>{@link Rule}</code>.
 *
 * @generatedBy CodePro at 5/13/18 2:23 PM
 * @author Club President
 * @version $Revision: 1.0 $
 */
public class RuleTest {
	/**
	 * Run the Rule(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:23 PM
	 */
	@Test
	public void testRule_1()
		throws Exception {
		String input = "";

		Rule result = new Rule(input);

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
		assertNotNull(result);
	}

	/**
	 * Run the void add(List<Relation>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:23 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		Rule fixture = new Rule("");
		fixture.add(new ArrayList<Relation>());
		List<Relation> condition = new ArrayList<Relation>();

		fixture.add(condition);

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
	 * Run the boolean matches(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:23 PM
	 */
	@Test
	public void testMatches_1()
		throws Exception {
		Rule fixture = new Rule("");
		fixture.add(new ArrayList<Relation>());
		double number = 1.0;

		boolean result = fixture.matches(number);

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
		assertTrue(result);
	}

	/**
	 * Run the boolean matches(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:23 PM
	 */
	@Test
	public void testMatches_2()
		throws Exception {
		Rule fixture = new Rule("");
		fixture.add(new ArrayList<Relation>());
		double number = 1.0;

		boolean result = fixture.matches(number);

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
		assertTrue(result);
	}

	/**
	 * Run the void parse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:23 PM
	 */
	@Test
	public void testParse_1()
		throws Exception {
		Rule fixture = new Rule("");
		fixture.add(new ArrayList<Relation>());
		String input = "";

		fixture.parse(input);

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
	 * Run the void parse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:23 PM
	 */
	@Test
	public void testParse_2()
		throws Exception {
		Rule fixture = new Rule("");
		fixture.add(new ArrayList<Relation>());
		String input = "";

		fixture.parse(input);

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
	 * Run the void parse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:23 PM
	 */
	@Test
	public void testParse_3()
		throws Exception {
		Rule fixture = new Rule("");
		fixture.add(new ArrayList<Relation>());
		String input = "";

		fixture.parse(input);

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
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:23 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Rule fixture = new Rule("");
		fixture.add(new ArrayList<Relation>());

		String result = fixture.toString();

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
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:23 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		Rule fixture = new Rule("");
		fixture.add(new ArrayList<Relation>());

		String result = fixture.toString();

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
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:23 PM
	 */
	@Test
	public void testToString_3()
		throws Exception {
		Rule fixture = new Rule("");
		fixture.add(new ArrayList<Relation>());

		String result = fixture.toString();

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
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(RuleTest.class);
	}
}