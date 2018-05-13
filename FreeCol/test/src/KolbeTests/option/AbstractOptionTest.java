package net.sf.freecol.common.option;

import java.io.InputStream;
import java.io.PipedInputStream;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractOptionTest</code> contains tests for the class <code>{@link AbstractOption}</code>.
 *
 * @generatedBy CodePro at 5/13/18, 2:22 PM
 * @author Kolbe
 * @version $Revision: 1.0 $
 */
public class AbstractOptionTest extends FreeColTestCase {
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
		fixture.isDefined = true;

		fixture.generateChoices();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.option.AbstractUnitOption.generateChoices(AbstractUnitOption.java:201)
		//       at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	}

	/**
	 * Run the String getGroup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGetGroup_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;

		String result = fixture.getGroup();

		// add additional test code here
		assertEquals("", result);
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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
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
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
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
	public void testReadAttributes_3()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
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
	public void testReadAttributes_4()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
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
	public void testReadAttributes_5()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
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
	public void testReadAttributes_6()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
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
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadOption_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadOption_2()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadOption_3()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadOption_4()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadOption_5()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadOption_6()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadOption_7()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadOption_8()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadOption_9()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadOption_10()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
		//       at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadOption_11()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at jdk.internal.reflect.GeneratedConstructorAccessor781.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadOption_12()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at jdk.internal.reflect.GeneratedConstructorAccessor781.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadOption_13()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at jdk.internal.reflect.GeneratedConstructorAccessor781.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadOption_14()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at jdk.internal.reflect.GeneratedConstructorAccessor781.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadOption_15()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at jdk.internal.reflect.GeneratedConstructorAccessor781.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the AbstractOption readOption(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testReadOption_16()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		FreeColXMLReader xr = new FreeColXMLReader(new PipedInputStream());

		AbstractOption result = fixture.readOption(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:94)
		//       at jdk.internal.reflect.GeneratedConstructorAccessor781.newInstance(Unknown Source)
		//       at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the void setGroup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetGroup_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		String group = "";

		fixture.setGroup(group);

		// add additional test code here
	}

	/**
	 * Run the void setGroup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetGroup_2()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		String group = null;

		fixture.setGroup(group);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testSetValue_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		String valueString = "";
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
	}

	/**
	 * Run the void setValues(AbstractOption<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValues_1()
		throws Exception {
		AbstractUnitOption fixture = new AbstractUnitOption(new Specification());
		fixture.isDefined = true;
		AbstractUnitOption source = new AbstractUnitOption(new Specification());
		source.isDefined = true;

		fixture.setValues(source);

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
		new org.junit.runner.JUnitCore().run(AbstractOptionTest.class);
	}
}