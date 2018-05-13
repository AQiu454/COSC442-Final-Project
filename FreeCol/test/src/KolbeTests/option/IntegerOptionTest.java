package net.sf.freecol.common.option;

import java.io.CharArrayWriter;
import java.io.InputStream;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.io.PipedInputStream;
import java.io.Writer;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;

/**
 * The class <code>IntegerOptionTest</code> contains tests for the class <code>{@link IntegerOption}</code>.
 *
 * @generatedBy CodePro at 5/13/18, 2:22 PM
 * @author Kolbe
 * @version $Revision: 1.0 $
 */
public class IntegerOptionTest extends FreeColTestCase {
	/**
	 * Run the IntegerOption(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testIntegerOption_1()
		throws Exception {
		Specification specification = new Specification();

		IntegerOption result = new IntegerOption(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals(Integer.MIN_VALUE, result.getMinimumValue());
		assertEquals(Integer.MAX_VALUE, result.getMaximumValue());
		assertEquals("integerOption", result.getXMLTagName());
		assertEquals("[null value=0]", result.toString());
		assertEquals(new Integer(0), result.getValue());
		assertEquals(false, result.isNullValueOK());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<integerOption value=\"0\"></integerOption>", result.serialize());
	}

	/**
	 * Run the IntegerOption(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testIntegerOption_2()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		IntegerOption result = new IntegerOption(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals(Integer.MIN_VALUE, result.getMinimumValue());
		assertEquals(Integer.MAX_VALUE, result.getMaximumValue());
		assertEquals("integerOption", result.getXMLTagName());
		assertEquals("[ value=0]", result.toString());
		assertEquals(new Integer(0), result.getValue());
		assertEquals(false, result.isNullValueOK());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<integerOption id=\"\" value=\"0\"></integerOption>", result.serialize());
	}

	/**
	 * Run the IntegerOption clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testClone_1()
		throws Exception {
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
		fixture.isDefined = true;

		IntegerOption result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getMinimumValue());
		assertEquals(1, result.getMaximumValue());
		assertEquals("integerOption", result.getXMLTagName());
		assertEquals("[null value=0]", result.toString());
		assertEquals(new Integer(0), result.getValue());
		assertEquals(false, result.isNullValueOK());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<integerOption value=\"0\" maximumValue=\"1\" minimumValue=\"1\"></integerOption>", result.serialize());
	}

	/**
	 * Run the int getMaximumValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGetMaximumValue_1()
		throws Exception {
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
		fixture.isDefined = true;

		int result = fixture.getMaximumValue();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getMinimumValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGetMinimumValue_1()
		throws Exception {
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
		fixture.isDefined = true;

		int result = fixture.getMinimumValue();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Integer getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
		fixture.isDefined = true;

		Integer result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
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

		String result = IntegerOption.getXMLElementTagName();

		// add additional test code here
		assertEquals("integerOption", result);
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
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
		fixture.isDefined = true;

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("integerOption", result);
	}

	/**
	 * Run the int limitValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testLimitValue_1()
		throws Exception {
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
		fixture.isDefined = true;
		int value = 1;

		int result = fixture.limitValue(value);

		// add additional test code here
		assertEquals(1, result);
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
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
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
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
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
	 * Run the void setMaximumValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetMaximumValue_1()
		throws Exception {
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
		fixture.isDefined = true;
		int maximumValue = 1;

		fixture.setMaximumValue(maximumValue);

		// add additional test code here
	}

	/**
	 * Run the void setMinimumValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetMinimumValue_1()
		throws Exception {
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
		fixture.isDefined = true;
		int minimumValue = 1;

		fixture.setMinimumValue(minimumValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
		fixture.isDefined = true;
		Integer value = Integer.valueOf(1);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_2()
		throws Exception {
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
		fixture.isDefined = true;
		Integer value = Integer.valueOf(1);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_3()
		throws Exception {
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
		fixture.isDefined = false;
		Integer value = Integer.valueOf(1);

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
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
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
	public void testSetValue_5()
		throws Exception {
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
		fixture.isDefined = true;
		String valueString = "";
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
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
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
	public void testSetValue_7()
		throws Exception {
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
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
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
		fixture.isDefined = true;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[null value=0]", result);
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
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
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
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
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
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
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
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(Integer.MAX_VALUE);
		fixture.setMinimumValue(1);
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
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(1);
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
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(Integer.MAX_VALUE);
		fixture.setMinimumValue(1);
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
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(1);
		fixture.setMinimumValue(Integer.MIN_VALUE);
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
		IntegerOption fixture = new IntegerOption(new Specification());
		fixture.setMaximumValue(Integer.MAX_VALUE);
		fixture.setMinimumValue(Integer.MIN_VALUE);
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

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
		new org.junit.runner.JUnitCore().run(IntegerOptionTest.class);
	}
}