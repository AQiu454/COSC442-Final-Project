package net.sf.freecol.common.option;

import java.io.CharArrayWriter;
import java.io.File;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.io.Writer;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;

/**
 * The class <code>FileOptionTest</code> contains tests for the class <code>{@link FileOption}</code>.
 *
 * @generatedBy CodePro at 5/13/18, 2:22 PM
 * @author Kolbe
 * @version $Revision: 1.0 $
 */
public class FileOptionTest extends FreeColTestCase {
	/**
	 * Run the FileOption(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testFileOption_1()
		throws Exception {
		Specification specification = new Specification();

		FileOption result = new FileOption(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null value=null]", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(true, result.isNullValueOK());
		assertEquals("fileOption", result.getXMLTagName());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<fileOption></fileOption>", result.serialize());
	}

	/**
	 * Run the FileOption clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testClone_1()
		throws Exception {
		FileOption fixture = new FileOption(new Specification());
		fixture.setValue(new File(""));
		fixture.isDefined = true;

		FileOption result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[null value=]", result.toString());
		assertEquals(true, result.isNullValueOK());
		assertEquals("fileOption", result.getXMLTagName());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("<fileOption value=\"E:\\Program Files\\eclipse\"></fileOption>", result.serialize());
	}

	/**
	 * Run the File getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		FileOption fixture = new FileOption(new Specification());
		fixture.setValue(new File(""));
		fixture.isDefined = true;

		File result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0L, result.length());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(null, result.getParent());
		assertEquals(false, result.isAbsolute());
		assertEquals(null, result.list());
		assertEquals(false, result.canRead());
		assertEquals("", result.getPath());
		assertEquals(null, result.getParentFile());
		assertEquals("E:\\Program Files\\eclipse", result.getAbsolutePath());
		assertEquals("E:\\Program Files\\eclipse", result.getCanonicalPath());
		assertEquals(false, result.isDirectory());
		assertEquals(false, result.canWrite());
		assertEquals(false, result.exists());
		assertEquals(false, result.isFile());
		assertEquals(false, result.isHidden());
		assertEquals(0L, result.lastModified());
		assertEquals(null, result.listFiles());
		assertEquals(false, result.canExecute());
		assertEquals(0L, result.getTotalSpace());
		assertEquals(0L, result.getFreeSpace());
		assertEquals(0L, result.getUsableSpace());
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

		String result = FileOption.getXMLElementTagName();

		// add additional test code here
		assertEquals("fileOption", result);
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
		FileOption fixture = new FileOption(new Specification());
		fixture.setValue(new File(""));
		fixture.isDefined = true;

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("fileOption", result);
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
		FileOption fixture = new FileOption(new Specification());
		fixture.setValue(new File(""));
		fixture.isDefined = true;

		boolean result = fixture.isNullValueOK();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void setValue(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		FileOption fixture = new FileOption(new Specification());
		fixture.setValue(new File(""));
		fixture.isDefined = true;
		File value = new File("");

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValue(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_2()
		throws Exception {
		FileOption fixture = new FileOption(new Specification());
		fixture.setValue(new File(""));
		fixture.isDefined = true;
		File value = new File("");

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
	public void testSetValue_3()
		throws Exception {
		FileOption fixture = new FileOption(new Specification());
		fixture.setValue(new File(""));
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
	public void testSetValue_4()
		throws Exception {
		FileOption fixture = new FileOption(new Specification());
		fixture.setValue(new File(""));
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
		FileOption fixture = new FileOption(new Specification());
		fixture.setValue(new File(""));
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
		FileOption fixture = new FileOption(new Specification());
		fixture.setValue(new File(""));
		fixture.isDefined = true;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[null value=]", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		FileOption fixture = new FileOption(new Specification());
		fixture.setValue((File) null);
		fixture.isDefined = true;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[null value=null]", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		FileOption fixture = new FileOption(new Specification());
		fixture.setValue((File) null);
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
		FileOption fixture = new FileOption(new Specification());
		fixture.setValue(new File(""));
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
		FileOption fixture = new FileOption(new Specification());
		fixture.setValue(new File(""));
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
		FileOption fixture = new FileOption(new Specification());
		fixture.setValue(new File(""));
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
		new org.junit.runner.JUnitCore().run(FileOptionTest.class);
	}
}