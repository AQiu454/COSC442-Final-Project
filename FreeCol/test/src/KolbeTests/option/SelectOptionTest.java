package net.sf.freecol.common.option;

import java.io.CharArrayWriter;
import java.io.InputStream;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.io.PipedInputStream;
import java.io.Writer;
import java.util.Map;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;

/**
 * The class <code>SelectOptionTest</code> contains tests for the class <code>{@link SelectOption}</code>.
 *
 * @generatedBy CodePro at 5/13/18, 2:21 PM
 * @author Kolbe
 * @version $Revision: 1.0 $
 */
public class SelectOptionTest extends FreeColTestCase {
	/**
	 * Run the SelectOption(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testSelectOption_1()
		throws Exception {
		Specification specification = new Specification();

		SelectOption result = new SelectOption(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("selectValue", result.getXMLItemElementTagName());
		assertEquals("selectOption", result.getXMLTagName());
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
		assertEquals("<selectOption value=\"0\" localizedLabels=\"false\"></selectOption>", result.serialize());
	}

	/**
	 * Run the void addItemValue(Integer,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testAddItemValue_1()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
		Integer key = new Integer(1);
		String value = "";

		fixture.addItemValue(key, value);

		// add additional test code here
	}

	/**
	 * Run the void clearItemValues() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testClearItemValues_1()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;

		fixture.clearItemValues();

		// add additional test code here
	}

	/**
	 * Run the Map<Integer, String> getItemValues() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testGetItemValues_1()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;

		Map<Integer, String> result = fixture.getItemValues();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
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

		String result = SelectOption.getXMLElementTagName();

		// add additional test code here
		assertEquals("selectOption", result);
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;

		String result = fixture.getXMLItemElementTagName();

		// add additional test code here
		assertEquals("selectValue", result);
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("selectOption", result);
	}

	/**
	 * Run the boolean localizeLabels() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testLocalizeLabels_1()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;

		boolean result = fixture.localizeLabels();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean localizeLabels() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testLocalizeLabels_2()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = false;

		boolean result = fixture.localizeLabels();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
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
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
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
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
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
	 * Run the void setValue(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
		Integer value = new Integer(1);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testSetValue_2()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
		Integer value = new Integer(1);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testSetValue_3()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
		Integer value = new Integer(1);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testSetValue_4()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
		Integer value = new Integer(1);

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testSetValue_5()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
		Integer value = new Integer(1);

		fixture.setValue(value);

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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[null value=0 localized=true]", result);
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
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
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
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
	public void testWriteChildren_7()
		throws Exception {
		SelectOption fixture = new SelectOption(new Specification());
		fixture.isDefined = true;
		fixture.localizedLabels = true;
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
		new org.junit.runner.JUnitCore().run(SelectOptionTest.class);
	}
}