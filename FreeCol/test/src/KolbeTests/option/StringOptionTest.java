package net.sf.freecol.common.option;

import java.io.CharArrayWriter;
import java.io.InputStream;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.io.PipedInputStream;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;

/**
 * The class <code>StringOptionTest</code> contains tests for the class <code>{@link StringOption}</code>.
 *
 * @generatedBy CodePro at 5/13/18, 2:21 PM
 * @author Kolbe
 * @version $Revision: 1.0 $
 */
public class StringOptionTest extends FreeColTestCase {
	/**
	 * Run the StringOption(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testStringOption_1()
		throws Exception {
		Specification specification = new Specification();

		StringOption result = new StringOption(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("stringOption", result.getXMLTagName());
		assertEquals("[null value=null choices=[]]", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(false, result.isNullValueOK());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
	}

	/**
	 * Run the StringOption(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testStringOption_2()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		StringOption result = new StringOption(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("stringOption", result.getXMLTagName());
		assertEquals("[ value=null choices=[]]", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(false, result.isNullValueOK());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
	}

	/**
	 * Run the StringOption clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testClone_1()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
		fixture.isDefined = true;

		StringOption result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals("stringOption", result.getXMLTagName());
		assertEquals("[null value= choices=[]]", result.toString());
		assertEquals("", result.getValue());
		assertEquals(false, result.isNullValueOK());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<stringOption value=\"\"></stringOption>", result.serialize());
	}

	/**
	 * Run the List<String> getChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testGetChoices_1()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
		fixture.isDefined = true;

		List<String> result = fixture.getChoices();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
		fixture.isDefined = true;

		String result = fixture.getValue();

		// add additional test code here
		assertEquals("", result);
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

		String result = StringOption.getXMLElementTagName();

		// add additional test code here
		assertEquals("stringOption", result);
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
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
		fixture.isDefined = true;

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("stringOption", result);
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
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
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
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
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
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
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
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
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
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
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
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
	 * Run the void setChoices(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testSetChoices_1()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
		fixture.isDefined = true;
		List<String> newChoices = new LinkedList();

		fixture.setChoices(newChoices);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
		fixture.isDefined = true;
		String value = "";

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testSetValue_2()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
		fixture.isDefined = false;
		String value = "";

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testSetValue_3()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
		fixture.isDefined = true;
		String value = "";

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testSetValue_4()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
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
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testSetValue_5()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
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
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
		fixture.isDefined = true;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[null value= choices=[]]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
		fixture.isDefined = true;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[null value= choices=[]]", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
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
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
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
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
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
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
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
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
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
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
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
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
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
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
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
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		StringOption fixture = new StringOption(new Specification());
		fixture.setValue("");
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
		new org.junit.runner.JUnitCore().run(StringOptionTest.class);
	}
}