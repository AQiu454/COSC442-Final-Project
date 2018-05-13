package net.sf.freecol.common.option;

import java.io.CharArrayWriter;
import java.io.InputStream;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.io.PipedInputStream;
import java.io.Writer;
import net.sf.freecol.common.model.UnitType;
import java.util.List;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;

/**
 * The class <code>UnitTypeOptionTest</code> contains tests for the class <code>{@link UnitTypeOption}</code>.
 *
 * @generatedBy CodePro at 5/13/18, 2:22 PM
 * @author Kolbe
 * @version $Revision: 1.0 $
 */
public class UnitTypeOptionTest extends FreeColTestCase {
	/**
	 * Run the UnitTypeOption(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testUnitTypeOption_1()
		throws Exception {
		Specification specification = new Specification();

		UnitTypeOption result = new UnitTypeOption(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.addNone());
		assertEquals("[null value=null addNone=false selector=UNITS]", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(true, result.isNullValueOK());
		assertEquals("unitTypeOption", result.getXMLTagName());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<unitTypeOption generate=\"units\"></unitTypeOption>", result.serialize());
	}

	/**
	 * Run the UnitTypeOption(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testUnitTypeOption_2()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		UnitTypeOption result = new UnitTypeOption(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.addNone());
		assertEquals("[ value=null addNone=false selector=UNITS]", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(true, result.isNullValueOK());
		assertEquals("unitTypeOption", result.getXMLTagName());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<unitTypeOption id=\"\" generate=\"units\"></unitTypeOption>", result.serialize());
	}

	/**
	 * Run the boolean addNone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testAddNone_1()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		boolean result = fixture.addNone();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addNone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testAddNone_2()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		boolean result = fixture.addNone();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the UnitTypeOption clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testClone_1()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		UnitTypeOption result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.addNone());
		assertEquals("[null value= addNone=false selector=UNITS]", result.toString());
		assertEquals(true, result.isNullValueOK());
		assertEquals("unitTypeOption", result.getXMLTagName());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<unitTypeOption value=\"\" generate=\"units\"></unitTypeOption>", result.serialize());
	}

	/**
	 * Run the void generateChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGenerateChoices_1()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
	}

	/**
	 * Run the void generateChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGenerateChoices_2()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
	}

	/**
	 * Run the void generateChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGenerateChoices_3()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
	}

	/**
	 * Run the void generateChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGenerateChoices_4()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
	}

	/**
	 * Run the void generateChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGenerateChoices_5()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
	}

	/**
	 * Run the void generateChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGenerateChoices_6()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
	}

	/**
	 * Run the void generateChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGenerateChoices_7()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
	}

	/**
	 * Run the void generateChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGenerateChoices_8()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
	}

	/**
	 * Run the void generateChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGenerateChoices_9()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
	}

	/**
	 * Run the void generateChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGenerateChoices_10()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
	}

	/**
	 * Run the void generateChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGenerateChoices_11()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
	}

	/**
	 * Run the void generateChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGenerateChoices_12()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
	}

	/**
	 * Run the void generateChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGenerateChoices_13()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
	}

	/**
	 * Run the void generateChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGenerateChoices_14()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
	}

	/**
	 * Run the void generateChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGenerateChoices_15()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
	}

	/**
	 * Run the void generateChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGenerateChoices_16()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
	}

	/**
	 * Run the List<UnitType> getChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGetChoices_1()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		List<UnitType> result = fixture.getChoices();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the UnitTypeOption.TypeSelector getGenerateChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGetGenerateChoices_1()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		UnitTypeOption.TypeSelector result = fixture.getGenerateChoices();

		// add additional test code here
		assertNotNull(result);
		assertEquals("UNITS", result.name());
		assertEquals("UNITS", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the UnitType getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		UnitType result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getExpertProduction());
		assertEquals(Integer.MAX_VALUE, result.getMaximumAttrition());
		assertEquals(0, result.getMaximumExperience());
		assertEquals(0, result.getRecruitProbability());
		assertEquals(0, result.getScoreValue());
		assertEquals(".workingAs", result.getWorkingAsKey());
		assertEquals(1.0, result.getDefence(), 1.0);
		assertEquals(false, result.isDefensive());
		assertEquals(0.0, result.getOffence(), 1.0);
		assertEquals(0, result.getHitPoints());
		assertEquals(null, result.getSkillTaught());
		assertEquals(false, result.isPerson());
		assertEquals(1, result.getSpaceTaken());
		assertEquals(1, result.getLineOfSight());
		assertEquals("model.role.default", result.getDisplayRoleId());
		assertEquals(false, result.canMoveToHighSeas());
		assertEquals(false, result.isRecruitable());
		assertEquals(false, result.canBuildColony());
		assertEquals(false, result.canCarryUnits());
		assertEquals(false, result.canCarryGoods());
		assertEquals(1, result.getBaseDefence());
		assertEquals(0, result.getBaseOffence());
		assertEquals("", result.toString());
		assertEquals(1000, result.getPriority());
		assertEquals(0, result.getSpace());
		assertEquals(false, result.isOffensive());
		assertEquals("unit-type", result.getXMLTagName());
		assertEquals(false, result.hasSkill());
		assertEquals(false, result.isNaval());
		assertEquals(3, result.getMovement());
		assertEquals(false, result.isDefaultUnitType());
		assertEquals(false, result.hasPrice());
		assertEquals(Integer.MIN_VALUE, result.getSkill());
		assertEquals(Integer.MIN_VALUE, result.getPrice());
		assertEquals(1, result.getRequiredPopulation());
		assertEquals(false, result.needsGoodsToBuild());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<unit-type id=\"\" offence=\"0\" defence=\"1\" default-unit=\"false\" movement=\"3\" line-of-sight=\"1\" score-value=\"0\" space=\"0\" space-taken=\"1\" hit-points=\"0\" maximum-experience=\"0\" recruit-probability=\"0\" priority=\"1000\"></unit-type>", result.serialize());
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

		String result = UnitTypeOption.getXMLElementTagName();

		// add additional test code here
		assertEquals("unitTypeOption", result);
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
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("unitTypeOption", result);
	}

	/**
	 * Run the boolean isNullValueOK() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testIsNullValueOK_1()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		boolean result = fixture.isNullValueOK();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
	}

	/**
	 * Run the void setValue(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		UnitType value = new UnitType("", new Specification());

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_2()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		UnitType value = new UnitType("", new Specification());

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(UnitType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_3()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = false;
		UnitType value = new UnitType("", new Specification());

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_4()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		String valueString = null;
		String defaultValueString = null;

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_5()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		String valueString = null;
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_6()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		String valueString = "";
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[null value= addNone=false selector=UNITS]", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue((UnitType) null);
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_5()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_6()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue((UnitType) null);
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_7()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_8()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue((UnitType) null);
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_9()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_10()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue((UnitType) null);
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_11()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_12()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue((UnitType) null);
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testWriteChildren_7()
		throws Exception {
		UnitTypeOption fixture = new UnitTypeOption(new Specification());
		fixture.setValue(new UnitType("", new Specification()));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(UnitTypeOptionTest.class);
	}
}