package net.sf.freecol.common.option;

import java.io.CharArrayWriter;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.model.AbstractUnit;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.model.Specification;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractUnitOptionTest</code> contains tests for the class <code>{@link AbstractUnitOption}</code>.
 *
 * @generatedBy CodePro at 5/13/18, 2:22 PM
 * @author Kolbe
 * @version $Revision: 1.0 $
 */
public class AbstractUnitOptionTest extends FreeColTestCase {
	/**
	 * Run the AbstractUnitOption(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testAbstractUnitOption_1()
		throws Exception {
		Specification specification = new Specification();

		AbstractUnitOption result = new AbstractUnitOption(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getRole());
		assertEquals("[null null]", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getNumber());
		assertEquals(true, result.isNullValueOK());
		assertEquals(null, result.getUnitType());
		assertEquals("unitOption", result.getXMLTagName());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the AbstractUnitOption(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testAbstractUnitOption_2()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		AbstractUnitOption result = new AbstractUnitOption(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getRole());
		assertEquals("[ null]", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getNumber());
		assertEquals(true, result.isNullValueOK());
		assertEquals(null, result.getUnitType());
		assertEquals("unitOption", result.getXMLTagName());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the AbstractUnitOption clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testClone_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue((AbstractUnit) null);
		fixture.isDefined = true;

		AbstractUnitOption result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getRole());
		assertEquals("[null null]", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getNumber());
		assertEquals(true, result.isNullValueOK());
		assertEquals(null, result.getUnitType());
		assertEquals("unitOption", result.getXMLTagName());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the AbstractUnitOption clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testClone_2()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;

		AbstractUnitOption result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null 1  ()]", result.toString());
		assertEquals(true, result.isNullValueOK());
		assertEquals("unitOption", result.getXMLTagName());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<unitOption><number id=\"null.number\" value=\"1\"></number><role id=\"null.role\" value=\"\"></role><unitType id=\"null.unitType\" value=\"\" generate=\"units\"></unitType></unitOption>", result.serialize());
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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
	}

	/**
	 * Run the IntegerOption getNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGetNumber_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;

		IntegerOption result = fixture.getNumber();

		// add additional test code here
		assertNotNull(result);
		assertEquals(Integer.MIN_VALUE, result.getMinimumValue());
		assertEquals(Integer.MAX_VALUE, result.getMaximumValue());
		assertEquals("[null.number value=1]", result.toString());
		assertEquals(new Integer(1), result.getValue());
		assertEquals("integerOption", result.getXMLTagName());
		assertEquals(false, result.isNullValueOK());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals("null.number", result.getId());
		assertEquals("number", result.getSuffix());
		assertEquals("null.number", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<integerOption id=\"null.number\" value=\"1\"></integerOption>", result.serialize());
	}

	/**
	 * Run the StringOption getRole() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGetRole_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;

		StringOption result = fixture.getRole();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null.role value= choices=[]]", result.toString());
		assertEquals("", result.getValue());
		assertEquals("stringOption", result.getXMLTagName());
		assertEquals(false, result.isNullValueOK());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals("null.role", result.getId());
		assertEquals("role", result.getSuffix());
		assertEquals("null.role", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<stringOption id=\"null.role\" value=\"\"></stringOption>", result.serialize());
	}

	/**
	 * Run the UnitTypeOption getUnitType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGetUnitType_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;

		UnitTypeOption result = fixture.getUnitType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.addNone());
		assertEquals("[null.unitType value= addNone=false selector=UNITS]", result.toString());
		assertEquals(true, result.isNullValueOK());
		assertEquals("unitTypeOption", result.getXMLTagName());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals("null.unitType", result.getId());
		assertEquals("unitType", result.getSuffix());
		assertEquals("null.unitType", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<unitTypeOption id=\"null.unitType\" value=\"\" generate=\"units\"></unitTypeOption>", result.serialize());
	}

	/**
	 * Run the AbstractUnit getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;

		AbstractUnit result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1  ()", result.toString());
		assertEquals(1, result.getNumber());
		assertEquals("", result.getRoleId());
		assertEquals("abstractUnit", result.getXMLTagName());
		assertEquals("", result.getDescription());
		assertEquals(null, result.getFeatureContainer());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<abstractUnit id=\"\" role=\"\" number=\"1\"></abstractUnit>", result.serialize());
		assertEquals(null, result.getSpecification());
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

		String result = AbstractUnitOption.getXMLElementTagName();

		// add additional test code here
		assertEquals("unitOption", result);
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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("unitOption", result);
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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;

		boolean result = fixture.isNullValueOK();

		// add additional test code here
		assertEquals(true, result);
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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
	public void testReadChild_5()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
	public void testReadChild_6()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
	public void testReadChild_7()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
	public void testReadChild_8()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
	public void testReadChild_9()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
	public void testReadChildren_3()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
	public void testReadChildren_4()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
	public void testReadChildren_5()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
	 * Run the void setValue(AbstractUnit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		AbstractUnit value = new AbstractUnit("", "", 1);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(AbstractUnit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_2()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		AbstractUnit value = null;

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(AbstractUnit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_3()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		AbstractUnit value = new AbstractUnit("", "", 1);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(AbstractUnit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_4()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = false;
		AbstractUnit value = new AbstractUnit("", "", 1);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(AbstractUnit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_5()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = false;
		AbstractUnit value = null;

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(AbstractUnit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_6()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue((AbstractUnit) null);
		fixture.isDefined = true;
		AbstractUnit value = null;

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(AbstractUnit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_7()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;
		AbstractUnit value = new AbstractUnit("", "", 1);

		fixture.setValue(value);

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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
		fixture.isDefined = true;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[null 1  ()]", result);
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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.setValue(new AbstractUnit("", "", 1));
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
		new org.junit.runner.JUnitCore().run(AbstractUnitOptionTest.class);
	}
}