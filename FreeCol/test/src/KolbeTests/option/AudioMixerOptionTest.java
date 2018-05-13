package net.sf.freecol.common.option;

import java.io.CharArrayWriter;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.io.Writer;
import java.util.List;
import javax.sound.sampled.Mixer;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;

/**
 * The class <code>AudioMixerOptionTest</code> contains tests for the class <code>{@link AudioMixerOption}</code>.
 *
 * @generatedBy CodePro at 5/13/18, 2:22 PM
 * @author Kolbe
 * @version $Revision: 1.0 $
 */
public class AudioMixerOptionTest extends FreeColTestCase {
	/**
	 * Run the AudioMixerOption(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testAudioMixerOption_1()
		throws Exception {
		Specification specification = new Specification();

		AudioMixerOption result = new AudioMixerOption(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("audioMixerOption", result.getXMLTagName());
		assertEquals(null, result.getValue());
		assertEquals(false, result.isNullValueOK());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("net.sf.freecol.common.option.AudioMixerOption:null", result.toString());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<audioMixerOption></audioMixerOption>", result.serialize());
	}

	/**
	 * Run the AudioMixerOption clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testClone_1()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		fixture.isDefined = true;

		AudioMixerOption result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals("audioMixerOption", result.getXMLTagName());
		assertEquals(false, result.isNullValueOK());
		assertEquals("", result.getGroup());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals("net.sf.freecol.common.option.AudioMixerOption:null", result.toString());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<audioMixerOption value=\"\"></audioMixerOption>", result.serialize());
	}

	/**
	 * Run the List<AudioMixerOption.MixerWrapper> getChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGetChoices_1()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		fixture.isDefined = true;

		List<AudioMixerOption.MixerWrapper> result = fixture.getChoices();

		// add additional test code here
		assertNotNull(result);
		assertEquals(9, result.size());
	}

	/**
	 * Run the AudioMixerOption.MixerWrapper getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		fixture.isDefined = true;

		AudioMixerOption.MixerWrapper result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getMixerInfo());
		assertEquals("", result.toString());
		assertEquals("", result.getKey());
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

		String result = AudioMixerOption.getXMLElementTagName();

		// add additional test code here
		assertEquals("audioMixerOption", result);
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
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		fixture.isDefined = true;

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("audioMixerOption", result);
	}

	/**
	 * Run the void setValue(MixerWrapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		fixture.isDefined = true;
		AudioMixerOption.MixerWrapper newValue = null;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(MixerWrapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_2()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		fixture.isDefined = true;
		AudioMixerOption.MixerWrapper newValue = new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null);

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(MixerWrapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_3()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		fixture.isDefined = true;
		AudioMixerOption.MixerWrapper newValue = null;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(MixerWrapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18, 2:22 PM
	 */
	@Test
	public void testSetValue_4()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		fixture.isDefined = true;
		AudioMixerOption.MixerWrapper newValue = new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null);

		fixture.setValue(newValue);

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
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
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
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
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
	public void testSetValue_7()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
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
	public void testSetValue_8()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
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
	public void testSetValue_9()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		fixture.isDefined = true;
		String valueString = "";
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
	public void testSetValue_10()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		fixture.isDefined = true;
		String valueString = "";
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
	public void testSetValue_11()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
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
	public void testSetValue_12()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
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
	public void testSetValue_13()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
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
	public void testSetValue_14()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
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
	public void testSetValue_15()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
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
	public void testSetValue_16()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
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
	public void testSetValue_17()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
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
	public void testSetValue_18()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		fixture.isDefined = true;
		String valueString = "";
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
	public void testSetValue_19()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		fixture.isDefined = true;
		String valueString = "";
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
	public void testSetValue_20()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		fixture.isDefined = true;
		String valueString = null;
		String defaultValueString = null;

		fixture.setValue(valueString, defaultValueString);

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
	public void testWriteAttributes_1()
		throws Exception {
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
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
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
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
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue(new AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
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
		AudioMixerOption fixture = new AudioMixerOption(new Specification());
		fixture.setValue((AudioMixerOption.MixerWrapper) null);
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
		new org.junit.runner.JUnitCore().run(AudioMixerOptionTest.class);
	}
}