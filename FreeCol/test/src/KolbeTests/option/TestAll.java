package net.sf.freecol.common.option;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 5/13/18, 2:22 PM
 * @author Kolbe
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	SelectOptionTest.class,
	FileOptionTest.class,
	OptionTest.class,
	BooleanOptionTest.class,
	LanguageOptionTest.class,
	UnitTypeOptionTest.class,
	ListOptionTest.class,
	AbstractUnitOptionTest.class,
	AudioMixerOptionTest.class,
	MapGeneratorOptionsTest.class,
	OptionGroupTest.class,
	TextOptionTest.class,
	UnitListOptionTest.class,
	ModOptionTest.class,
	IntegerOptionTest.class,
	PercentageOptionTest.class,
	ModListOptionTest.class,
	StringOptionTest.class,
	AbstractOptionTest.class,
	RangeOptionTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
