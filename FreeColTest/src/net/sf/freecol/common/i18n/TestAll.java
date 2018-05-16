package net.sf.freecol.common.i18n;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 5/13/18 2:24 PM
 * @author Club President
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	PluralNumberRuleTest.class,
	DefaultNumberRuleTest.class,
	RuleTest.class,
	NameCacheTest.class,
	MessagesTest.class,
	NumberRulesTest.class,
	RelationTest.class,
	NumberTest.class,
	DualNumberRuleTest.class,
	SelectorTest.class,
	OtherNumberRuleTest.class,
	ZeroOneNumberRuleTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
