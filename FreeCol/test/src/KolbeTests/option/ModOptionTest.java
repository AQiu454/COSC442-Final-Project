package net.sf.freecol.common.option;

import java.io.CharArrayWriter;
import java.io.File;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.io.Writer;
import java.util.List;
import net.sf.freecol.common.io.FreeColModFile;
import org.junit.*;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;

/**
 * The class <code>ModOptionTest</code> contains tests for the class <code>{@link ModOption}</code>.
 *
 * @generatedBy CodePro at 5/13/18, 2:21 PM
 * @author Kolbe
 * @version $Revision: 1.0 $
 */
public class ModOptionTest extends FreeColTestCase {
	/**
	 * Run the ModOption(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testModOption_1()
		throws Exception {
		Specification specification = new Specification();

		ModOption result = new ModOption(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("modOption", result.getXMLTagName());
		assertEquals(true, result.isNullValueOK());
		assertEquals("[null]", result.toString());
		assertEquals(null, result.getValue());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<modOption></modOption>", result.serialize());
	}

	/**
	 * Run the ModOption clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testClone_1()
		throws Exception {
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;

		ModOption result = fixture.clone();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;
		ModOption o = new ModOption(new Specification());
		o.setValue(new FreeColModFile(new File("")));
		o.isDefined = true;

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;
		ModOption o = new ModOption(new Specification());
		o.setValue(new FreeColModFile(new File("")));

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;
		ModOption o = new ModOption(new Specification());
		o.setValue(new FreeColModFile(new File("")));

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;
		ModOption o = new ModOption(new Specification());
		o.setValue(new FreeColModFile(new File("")));

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertTrue(result);
	}

	/**
	 * Run the List<FreeColModFile> getChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testGetChoices_1()
		throws Exception {
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;

		List<FreeColModFile> result = fixture.getChoices();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColModFile getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;

		FreeColModFile result = fixture.getValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
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

		String result = ModOption.getXMLElementTagName();

		// add additional test code here
		assertEquals("modOption", result);
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
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at jdk.internal.reflect.GeneratedConstructorAccessor750.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;

		int result = fixture.hashCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isNullValueOK() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testIsNullValueOK_1()
		throws Exception {
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;

		boolean result = fixture.isNullValueOK();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertTrue(result);
	}

	/**
	 * Run the void setValue(FreeColModFile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;
		FreeColModFile value = new FreeColModFile(new File(""));

		fixture.setValue(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
	}

	/**
	 * Run the void setValue(FreeColModFile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testSetValue_2()
		throws Exception {
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = false;
		FreeColModFile value = new FreeColModFile(new File(""));

		fixture.setValue(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
	}

	/**
	 * Run the void setValue(FreeColModFile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testSetValue_3()
		throws Exception {
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;
		FreeColModFile value = new FreeColModFile(new File(""));

		fixture.setValue(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
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
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;
		String valueString = null;
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
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
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;
		String valueString = null;
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testSetValue_6()
		throws Exception {
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;
		String valueString = "";
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
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
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at jdk.internal.reflect.GeneratedConstructorAccessor750.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at jdk.internal.reflect.GeneratedConstructorAccessor750.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at jdk.internal.reflect.GeneratedConstructorAccessor750.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at jdk.internal.reflect.GeneratedConstructorAccessor750.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:21 PM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		ModOption fixture = new ModOption(new Specification());
		fixture.setValue(new FreeColModFile(new File("")));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:83)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:60)
		//       at jdk.internal.reflect.GeneratedConstructorAccessor750.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
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
		new org.junit.runner.JUnitCore().run(ModOptionTest.class);
	}
}