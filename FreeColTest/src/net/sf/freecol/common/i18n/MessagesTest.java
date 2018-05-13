package net.sf.freecol.common.i18n;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.sf.freecol.common.model.StringTemplate;
import net.sf.freecol.common.ObjectWithId;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import net.sf.freecol.common.model.AbstractGoods;
import net.sf.freecol.common.io.FreeColModFile;
import net.sf.freecol.common.model.Named;
import static org.junit.Assert.*;

/**
 * The class <code>MessagesTest</code> contains tests for the class <code>{@link Messages}</code>.
 *
 * @generatedBy CodePro at 5/13/18 2:24 PM
 * @author Club President
 * @version $Revision: 1.0 $
 */
public class MessagesTest {
	/**
	 * Run the Messages() constructor test.
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testMessages_1()
		throws Exception {
		Messages result = new Messages();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the boolean containsKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testContainsKey_1()
		throws Exception {
		String key = "";

		boolean result = Messages.containsKey(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testContainsKey_2()
		throws Exception {
		String key = "";

		boolean result = Messages.containsKey(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String descriptionKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testDescriptionKey_1()
		throws Exception {
		String id = "";

		String result = Messages.descriptionKey(id);

		// add additional test code here
		assertEquals(".description", result);
	}

	/**
	 * Run the String descriptionKey(ObjectWithId) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testDescriptionKey_2()
		throws Exception {
		ObjectWithId object = new AbstractGoods();

		String result = Messages.descriptionKey(object);

		// add additional test code here
		assertEquals("null.description", result);
	}

	/**
	 * Run the String getBestDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetBestDescription_1()
		throws Exception {
		String id = "";

		String result = Messages.getBestDescription(id);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getBestDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetBestDescription_2()
		throws Exception {
		String id = "";

		String result = Messages.getBestDescription(id);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getBestDescription(ObjectWithId) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetBestDescription_3()
		throws Exception {
		ObjectWithId object = new AbstractGoods();

		String result = Messages.getBestDescription(object);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String[] getBestNameAndDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetBestNameAndDescription_1()
		throws Exception {
		String id = ".name";

		String[] result = Messages.getBestNameAndDescription(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.length);
		assertEquals("", result[0]);
		assertEquals(null, result[1]);
	}

	/**
	 * Run the String[] getBestNameAndDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetBestNameAndDescription_2()
		throws Exception {
		String id = "";

		String[] result = Messages.getBestNameAndDescription(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.length);
		assertEquals("", result[0]);
		assertEquals(null, result[1]);
	}

	/**
	 * Run the String[] getBestNameAndDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetBestNameAndDescription_3()
		throws Exception {
		String id = "";

		String[] result = Messages.getBestNameAndDescription(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.length);
		assertEquals("", result[0]);
		assertEquals(null, result[1]);
	}

	/**
	 * Run the String[] getBestNameAndDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetBestNameAndDescription_4()
		throws Exception {
		String id = null;

		String[] result = Messages.getBestNameAndDescription(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.length);
		assertEquals(null, result[0]);
		assertEquals(null, result[1]);
	}

	/**
	 * Run the String[] getBestNameAndDescription(Named) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetBestNameAndDescription_5()
		throws Exception {
		Named named = new AbstractGoods();

		String[] result = Messages.getBestNameAndDescription(named);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.AbstractGoods.getNameKey(AbstractGoods.java:237)
		//       at net.sf.freecol.common.i18n.Messages.getBestNameAndDescription(Messages.java:434)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		String id = "";

		String result = Messages.getDescription(id);

		// add additional test code here
		assertEquals(".description", result);
	}

	/**
	 * Run the String getDescription(ObjectWithId) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetDescription_2()
		throws Exception {
		ObjectWithId object = new AbstractGoods();

		String result = Messages.getDescription(object);

		// add additional test code here
		assertEquals("null.description", result);
	}

	/**
	 * Run the String getKey(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetKey_1()
		throws Exception {
		String preferredKey = "";
		String defaultKey = "";

		String result = Messages.getKey(preferredKey, defaultKey);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getKey(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetKey_2()
		throws Exception {
		String preferredKey = "";
		String defaultKey = "";

		String result = Messages.getKey(preferredKey, defaultKey);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Locale getLocale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetLocale_1()
		throws Exception {
		String languageID = "";

		Locale result = Messages.getLocale(languageID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.NoSuchElementException
		//       at java.util.StringTokenizer.nextToken(Unknown Source)
		//       at net.sf.freecol.common.i18n.Messages.getLocale(Messages.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the Locale getLocale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetLocale_2()
		throws Exception {
		String languageID = "";

		Locale result = Messages.getLocale(languageID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.NoSuchElementException
		//       at java.util.StringTokenizer.nextToken(Unknown Source)
		//       at net.sf.freecol.common.i18n.Messages.getLocale(Messages.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the Locale getLocale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetLocale_3()
		throws Exception {
		String languageID = "";

		Locale result = Messages.getLocale(languageID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.NoSuchElementException
		//       at java.util.StringTokenizer.nextToken(Unknown Source)
		//       at net.sf.freecol.common.i18n.Messages.getLocale(Messages.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the Locale getLocale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetLocale_4()
		throws Exception {
		String languageID = "";

		Locale result = Messages.getLocale(languageID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.NoSuchElementException
		//       at java.util.StringTokenizer.nextToken(Unknown Source)
		//       at net.sf.freecol.common.i18n.Messages.getLocale(Messages.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the Locale getLocale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetLocale_5()
		throws Exception {
		String languageID = "";

		Locale result = Messages.getLocale(languageID);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.NoSuchElementException
		//       at java.util.StringTokenizer.nextToken(Unknown Source)
		//       at net.sf.freecol.common.i18n.Messages.getLocale(Messages.java:307)
		assertNotNull(result);
	}

	/**
	 * Run the String getName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		String id = "";

		String result = Messages.getName(id);

		// add additional test code here
		assertEquals(".name", result);
	}

	/**
	 * Run the String getName(Named) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetName_2()
		throws Exception {
		Named named = new AbstractGoods();

		String result = Messages.getName(named);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.AbstractGoods.getNameKey(AbstractGoods.java:237)
		//       at net.sf.freecol.common.i18n.Messages.getName(Messages.java:346)
		assertNotNull(result);
	}

	/**
	 * Run the String getRulerName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetRulerName_1()
		throws Exception {
		String id = "";

		String result = Messages.getRulerName(id);

		// add additional test code here
		assertEquals(".ruler", result);
	}

	/**
	 * Run the String getShortDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetShortDescription_1()
		throws Exception {
		String id = "";

		String result = Messages.getShortDescription(id);

		// add additional test code here
		assertEquals(".shortDescription", result);
	}

	/**
	 * Run the String getShortDescription(ObjectWithId) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetShortDescription_2()
		throws Exception {
		ObjectWithId object = new AbstractGoods();

		String result = Messages.getShortDescription(object);

		// add additional test code here
		assertEquals("null.shortDescription", result);
	}

	/**
	 * Run the StringTemplate getUnitLabel(String,String,int,String,String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetUnitLabel_1()
		throws Exception {
		String name = "";
		String typeId = "";
		int number = 1;
		String nationId = "";
		String roleId = "";
		StringTemplate extra = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		StringTemplate result = Messages.getUnitLabel(name, typeId, number, nationId, roleId, extra);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getUnitLabel(String,String,int,String,String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetUnitLabel_2()
		throws Exception {
		String name = "";
		String typeId = "";
		int number = 1;
		String nationId = "";
		String roleId = "";
		StringTemplate extra = null;

		StringTemplate result = Messages.getUnitLabel(name, typeId, number, nationId, roleId, extra);

		// add additional test code here
		assertNotNull(result);
		assertEquals("LABEL: NAME: NAME:  (KEY: .nameNAME:  KEY: .nameNAME: /TEMPLATE: .name [[%number%: NAME: 1]]NAME: )", result.toString());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals(null, result.getDefaultId());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<stringTemplate id=\"\" templateType=\"label\"><stringTemplate id=\"\" templateType=\"name\"></stringTemplate><stringTemplate id=\" (\" templateType=\"name\"></stringTemplate><stringTemplate id=\".name\" templateType=\"key\"></stringTemplate><stringTemplate id=\" \" templateType=\"name\"></stringTemplate><stringTemplate id=\".name\" templateType=\"key\"></stringTemplate><stringTemplate id=\"/\" templateType=\"name\"></stringTemplate><stringTemplate id=\".name\" templateType=\"template\"><key value=\"%number%\"></key><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate></stringTemplate><stringTemplate id=\")\" templateType=\"name\"></stringTemplate></stringTemplate>", result.serialize());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the StringTemplate getUnitLabel(String,String,int,String,String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetUnitLabel_3()
		throws Exception {
		String name = "";
		String typeId = "";
		int number = 1;
		String nationId = "";
		String roleId = "";
		StringTemplate extra = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		StringTemplate result = Messages.getUnitLabel(name, typeId, number, nationId, roleId, extra);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getUnitLabel(String,String,int,String,String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetUnitLabel_4()
		throws Exception {
		String name = "";
		String typeId = "";
		int number = 1;
		String nationId = "";
		String roleId = "";
		StringTemplate extra = null;

		StringTemplate result = Messages.getUnitLabel(name, typeId, number, nationId, roleId, extra);

		// add additional test code here
		assertNotNull(result);
		assertEquals("LABEL: NAME: NAME:  (KEY: .nameNAME:  KEY: .nameNAME: /TEMPLATE: .name [[%number%: NAME: 1]]NAME: )", result.toString());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals(null, result.getDefaultId());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<stringTemplate id=\"\" templateType=\"label\"><stringTemplate id=\"\" templateType=\"name\"></stringTemplate><stringTemplate id=\" (\" templateType=\"name\"></stringTemplate><stringTemplate id=\".name\" templateType=\"key\"></stringTemplate><stringTemplate id=\" \" templateType=\"name\"></stringTemplate><stringTemplate id=\".name\" templateType=\"key\"></stringTemplate><stringTemplate id=\"/\" templateType=\"name\"></stringTemplate><stringTemplate id=\".name\" templateType=\"template\"><key value=\"%number%\"></key><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate></stringTemplate><stringTemplate id=\")\" templateType=\"name\"></stringTemplate></stringTemplate>", result.serialize());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the StringTemplate getUnitLabel(String,String,int,String,String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetUnitLabel_5()
		throws Exception {
		String name = "";
		String typeId = "";
		int number = 1;
		String nationId = null;
		String roleId = "";
		StringTemplate extra = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		StringTemplate result = Messages.getUnitLabel(name, typeId, number, nationId, roleId, extra);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getUnitLabel(String,String,int,String,String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetUnitLabel_6()
		throws Exception {
		String name = "";
		String typeId = "";
		int number = 1;
		String nationId = null;
		String roleId = "";
		StringTemplate extra = null;

		StringTemplate result = Messages.getUnitLabel(name, typeId, number, nationId, roleId, extra);

		// add additional test code here
		assertNotNull(result);
		assertEquals("LABEL: NAME: NAME:  (KEY: .nameNAME: /TEMPLATE: .name [[%number%: NAME: 1]]NAME: )", result.toString());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals(null, result.getDefaultId());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<stringTemplate id=\"\" templateType=\"label\"><stringTemplate id=\"\" templateType=\"name\"></stringTemplate><stringTemplate id=\" (\" templateType=\"name\"></stringTemplate><stringTemplate id=\".name\" templateType=\"key\"></stringTemplate><stringTemplate id=\"/\" templateType=\"name\"></stringTemplate><stringTemplate id=\".name\" templateType=\"template\"><key value=\"%number%\"></key><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate></stringTemplate><stringTemplate id=\")\" templateType=\"name\"></stringTemplate></stringTemplate>", result.serialize());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the StringTemplate getUnitLabel(String,String,int,String,String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetUnitLabel_7()
		throws Exception {
		String name = "";
		String typeId = "";
		int number = 1;
		String nationId = null;
		String roleId = "";
		StringTemplate extra = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		StringTemplate result = Messages.getUnitLabel(name, typeId, number, nationId, roleId, extra);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getUnitLabel(String,String,int,String,String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetUnitLabel_8()
		throws Exception {
		String name = "";
		String typeId = "";
		int number = 1;
		String nationId = null;
		String roleId = "";
		StringTemplate extra = null;

		StringTemplate result = Messages.getUnitLabel(name, typeId, number, nationId, roleId, extra);

		// add additional test code here
		assertNotNull(result);
		assertEquals("LABEL: NAME: NAME:  (KEY: .nameNAME: /TEMPLATE: .name [[%number%: NAME: 1]]NAME: )", result.toString());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals(null, result.getDefaultId());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<stringTemplate id=\"\" templateType=\"label\"><stringTemplate id=\"\" templateType=\"name\"></stringTemplate><stringTemplate id=\" (\" templateType=\"name\"></stringTemplate><stringTemplate id=\".name\" templateType=\"key\"></stringTemplate><stringTemplate id=\"/\" templateType=\"name\"></stringTemplate><stringTemplate id=\".name\" templateType=\"template\"><key value=\"%number%\"></key><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate></stringTemplate><stringTemplate id=\")\" templateType=\"name\"></stringTemplate></stringTemplate>", result.serialize());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the StringTemplate getUnitLabel(String,String,int,String,String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetUnitLabel_9()
		throws Exception {
		String name = null;
		String typeId = "";
		int number = 1;
		String nationId = "";
		String roleId = "";
		StringTemplate extra = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		StringTemplate result = Messages.getUnitLabel(name, typeId, number, nationId, roleId, extra);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getUnitLabel(String,String,int,String,String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetUnitLabel_10()
		throws Exception {
		String name = null;
		String typeId = "";
		int number = 1;
		String nationId = "";
		String roleId = "";
		StringTemplate extra = null;

		StringTemplate result = Messages.getUnitLabel(name, typeId, number, nationId, roleId, extra);

		// add additional test code here
		assertNotNull(result);
		assertEquals("LABEL: KEY: .nameNAME:  KEY: .nameNAME:  (TEMPLATE: .name [[%number%: NAME: 1]]NAME: )", result.toString());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals(null, result.getDefaultId());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<stringTemplate id=\"\" templateType=\"label\"><stringTemplate id=\".name\" templateType=\"key\"></stringTemplate><stringTemplate id=\" \" templateType=\"name\"></stringTemplate><stringTemplate id=\".name\" templateType=\"key\"></stringTemplate><stringTemplate id=\" (\" templateType=\"name\"></stringTemplate><stringTemplate id=\".name\" templateType=\"template\"><key value=\"%number%\"></key><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate></stringTemplate><stringTemplate id=\")\" templateType=\"name\"></stringTemplate></stringTemplate>", result.serialize());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the StringTemplate getUnitLabel(String,String,int,String,String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetUnitLabel_11()
		throws Exception {
		String name = null;
		String typeId = "";
		int number = 1;
		String nationId = "";
		String roleId = "";
		StringTemplate extra = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		StringTemplate result = Messages.getUnitLabel(name, typeId, number, nationId, roleId, extra);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getUnitLabel(String,String,int,String,String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetUnitLabel_12()
		throws Exception {
		String name = null;
		String typeId = "";
		int number = 1;
		String nationId = "";
		String roleId = "";
		StringTemplate extra = null;

		StringTemplate result = Messages.getUnitLabel(name, typeId, number, nationId, roleId, extra);

		// add additional test code here
		assertNotNull(result);
		assertEquals("LABEL: KEY: .nameNAME:  KEY: .nameNAME:  (TEMPLATE: .name [[%number%: NAME: 1]]NAME: )", result.toString());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals(null, result.getDefaultId());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<stringTemplate id=\"\" templateType=\"label\"><stringTemplate id=\".name\" templateType=\"key\"></stringTemplate><stringTemplate id=\" \" templateType=\"name\"></stringTemplate><stringTemplate id=\".name\" templateType=\"key\"></stringTemplate><stringTemplate id=\" (\" templateType=\"name\"></stringTemplate><stringTemplate id=\".name\" templateType=\"template\"><key value=\"%number%\"></key><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate></stringTemplate><stringTemplate id=\")\" templateType=\"name\"></stringTemplate></stringTemplate>", result.serialize());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the StringTemplate getUnitLabel(String,String,int,String,String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetUnitLabel_13()
		throws Exception {
		String name = null;
		String typeId = "";
		int number = 1;
		String nationId = null;
		String roleId = "";
		StringTemplate extra = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		StringTemplate result = Messages.getUnitLabel(name, typeId, number, nationId, roleId, extra);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getUnitLabel(String,String,int,String,String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetUnitLabel_14()
		throws Exception {
		String name = null;
		String typeId = "";
		int number = 1;
		String nationId = null;
		String roleId = "";
		StringTemplate extra = null;

		StringTemplate result = Messages.getUnitLabel(name, typeId, number, nationId, roleId, extra);

		// add additional test code here
		assertNotNull(result);
		assertEquals("LABEL: KEY: .nameNAME:  (TEMPLATE: .name [[%number%: NAME: 1]]NAME: )", result.toString());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals(null, result.getDefaultId());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<stringTemplate id=\"\" templateType=\"label\"><stringTemplate id=\".name\" templateType=\"key\"></stringTemplate><stringTemplate id=\" (\" templateType=\"name\"></stringTemplate><stringTemplate id=\".name\" templateType=\"template\"><key value=\"%number%\"></key><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate></stringTemplate><stringTemplate id=\")\" templateType=\"name\"></stringTemplate></stringTemplate>", result.serialize());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the StringTemplate getUnitLabel(String,String,int,String,String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetUnitLabel_15()
		throws Exception {
		String name = null;
		String typeId = "";
		int number = 1;
		String nationId = null;
		String roleId = "";
		StringTemplate extra = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		StringTemplate result = Messages.getUnitLabel(name, typeId, number, nationId, roleId, extra);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the StringTemplate getUnitLabel(String,String,int,String,String,StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testGetUnitLabel_16()
		throws Exception {
		String name = null;
		String typeId = "";
		int number = 1;
		String nationId = null;
		String roleId = "";
		StringTemplate extra = null;

		StringTemplate result = Messages.getUnitLabel(name, typeId, number, nationId, roleId, extra);

		// add additional test code here
		assertNotNull(result);
		assertEquals("LABEL: KEY: .nameNAME:  (TEMPLATE: .name [[%number%: NAME: 1]]NAME: )", result.toString());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals(null, result.getDefaultId());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<stringTemplate id=\"\" templateType=\"label\"><stringTemplate id=\".name\" templateType=\"key\"></stringTemplate><stringTemplate id=\" (\" templateType=\"name\"></stringTemplate><stringTemplate id=\".name\" templateType=\"template\"><key value=\"%number%\"></key><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate></stringTemplate><stringTemplate id=\")\" templateType=\"name\"></stringTemplate></stringTemplate>", result.serialize());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(-1, result.getIdNumber());
		assertEquals("", result.getIdType());
	}

	/**
	 * Run the void loadActiveModMessageBundle(List<FreeColModFile>,Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadActiveModMessageBundle_1()
		throws Exception {
		List<FreeColModFile> mods = new ArrayList<FreeColModFile>();
		Locale locale = Locale.getDefault();

		Messages.loadActiveModMessageBundle(mods, locale);

		// add additional test code here
	}

	/**
	 * Run the void loadActiveModMessageBundle(List<FreeColModFile>,Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadActiveModMessageBundle_2()
		throws Exception {
		List<FreeColModFile> mods = new ArrayList<FreeColModFile>();
		Locale locale = Locale.getDefault();

		Messages.loadActiveModMessageBundle(mods, locale);

		// add additional test code here
	}

	/**
	 * Run the void loadActiveModMessageBundle(List<FreeColModFile>,Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadActiveModMessageBundle_3()
		throws Exception {
		List<FreeColModFile> mods = new ArrayList<FreeColModFile>();
		Locale locale = Locale.getDefault();

		Messages.loadActiveModMessageBundle(mods, locale);

		// add additional test code here
	}

	/**
	 * Run the void loadActiveModMessageBundle(List<FreeColModFile>,Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadActiveModMessageBundle_4()
		throws Exception {
		List<FreeColModFile> mods = new ArrayList<FreeColModFile>();
		Locale locale = Locale.getDefault();

		Messages.loadActiveModMessageBundle(mods, locale);

		// add additional test code here
	}

	/**
	 * Run the void loadActiveModMessageBundle(List<FreeColModFile>,Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadActiveModMessageBundle_5()
		throws Exception {
		List<FreeColModFile> mods = new ArrayList<FreeColModFile>();
		Locale locale = Locale.getDefault();

		Messages.loadActiveModMessageBundle(mods, locale);

		// add additional test code here
	}

	/**
	 * Run the void loadMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessageBundle_1()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadMessageBundle(locale);

		// add additional test code here
	}

	/**
	 * Run the void loadMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessageBundle_2()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadMessageBundle(locale);

		// add additional test code here
	}

	/**
	 * Run the void loadMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessageBundle_3()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadMessageBundle(locale);

		// add additional test code here
	}

	/**
	 * Run the void loadMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessageBundle_4()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadMessageBundle(locale);

		// add additional test code here
	}

	/**
	 * Run the void loadMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessageBundle_5()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadMessageBundle(locale);

		// add additional test code here
	}

	/**
	 * Run the void loadMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessageBundle_6()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadMessageBundle(locale);

		// add additional test code here
	}

	/**
	 * Run the void loadMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessageBundle_7()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadMessageBundle(locale);

		// add additional test code here
	}

	/**
	 * Run the void loadMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessageBundle_8()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadMessageBundle(locale);

		// add additional test code here
	}

	/**
	 * Run the void loadMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessageBundle_9()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadMessageBundle(locale);

		// add additional test code here
	}

	/**
	 * Run the void loadMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessageBundle_10()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadMessageBundle(locale);

		// add additional test code here
	}

	/**
	 * Run the void loadMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessageBundle_11()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadMessageBundle(locale);

		// add additional test code here
	}

	/**
	 * Run the void loadMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessageBundle_12()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadMessageBundle(locale);

		// add additional test code here
	}

	/**
	 * Run the void loadMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessageBundle_13()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadMessageBundle(locale);

		// add additional test code here
	}

	/**
	 * Run the void loadMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessageBundle_14()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadMessageBundle(locale);

		// add additional test code here
	}

	/**
	 * Run the void loadMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessageBundle_15()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadMessageBundle(locale);

		// add additional test code here
	}

	/**
	 * Run the void loadMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessageBundle_16()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadMessageBundle(locale);

		// add additional test code here
	}

	/**
	 * Run the void loadMessages(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessages_1()
		throws Exception {
		InputStream is = new ByteArrayInputStream("".getBytes());

		Messages.loadMessages(is);

		// add additional test code here
	}

	/**
	 * Run the void loadMessages(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessages_2()
		throws Exception {
		InputStream is = new ByteArrayInputStream("".getBytes());

		Messages.loadMessages(is);

		// add additional test code here
	}

	/**
	 * Run the void loadMessages(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessages_3()
		throws Exception {
		InputStream is = new ByteArrayInputStream("".getBytes());

		Messages.loadMessages(is);

		// add additional test code here
	}

	/**
	 * Run the void loadMessages(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessages_4()
		throws Exception {
		InputStream is = new ByteArrayInputStream("".getBytes());

		Messages.loadMessages(is);

		// add additional test code here
	}

	/**
	 * Run the void loadMessages(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessages_5()
		throws Exception {
		InputStream is = new ByteArrayInputStream("".getBytes());

		Messages.loadMessages(is);

		// add additional test code here
	}

	/**
	 * Run the void loadMessages(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessages_6()
		throws Exception {
		InputStream is = new ByteArrayInputStream("".getBytes());

		Messages.loadMessages(is);

		// add additional test code here
	}

	/**
	 * Run the void loadMessages(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessages_7()
		throws Exception {
		InputStream is = new ByteArrayInputStream("".getBytes());

		Messages.loadMessages(is);

		// add additional test code here
	}

	/**
	 * Run the void loadMessages(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadMessages_8()
		throws Exception {
		InputStream is = new ByteArrayInputStream("".getBytes());

		Messages.loadMessages(is);

		// add additional test code here
	}

	/**
	 * Run the void loadModMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadModMessageBundle_1()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadModMessageBundle(locale);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.io.Mods.getRuleSets(Mods.java:120)
		//       at net.sf.freecol.common.i18n.Messages.loadModMessageBundle(Messages.java:264)
	}

	/**
	 * Run the void loadModMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadModMessageBundle_2()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadModMessageBundle(locale);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.io.Mods.getRuleSets(Mods.java:120)
		//       at net.sf.freecol.common.i18n.Messages.loadModMessageBundle(Messages.java:264)
	}

	/**
	 * Run the void loadModMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadModMessageBundle_3()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadModMessageBundle(locale);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.io.Mods.getRuleSets(Mods.java:120)
		//       at net.sf.freecol.common.i18n.Messages.loadModMessageBundle(Messages.java:264)
	}

	/**
	 * Run the void loadModMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadModMessageBundle_4()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadModMessageBundle(locale);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.io.Mods.getRuleSets(Mods.java:120)
		//       at net.sf.freecol.common.i18n.Messages.loadModMessageBundle(Messages.java:264)
	}

	/**
	 * Run the void loadModMessageBundle(Locale) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testLoadModMessageBundle_5()
		throws Exception {
		Locale locale = Locale.getDefault();

		Messages.loadModMessageBundle(locale);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.io.Mods.getRuleSets(Mods.java:120)
		//       at net.sf.freecol.common.i18n.Messages.loadModMessageBundle(Messages.java:264)
	}

	/**
	 * Run the String message(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testMessage_1()
		throws Exception {
		String messageId = "";

		String result = Messages.message(messageId);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String message(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testMessage_2()
		throws Exception {
		String messageId = "";

		String result = Messages.message(messageId);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String message(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testMessage_3()
		throws Exception {
		String messageId = null;

		String result = Messages.message(messageId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String message(StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testMessage_4()
		throws Exception {
		StringTemplate template = null;

		String result = Messages.message(template);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String message(StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testMessage_5()
		throws Exception {
		StringTemplate template = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		String result = Messages.message(template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the String message(StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testMessage_6()
		throws Exception {
		StringTemplate template = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		String result = Messages.message(template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the String message(StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testMessage_7()
		throws Exception {
		StringTemplate template = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		String result = Messages.message(template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the String message(StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testMessage_8()
		throws Exception {
		StringTemplate template = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		String result = Messages.message(template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the String message(StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testMessage_9()
		throws Exception {
		StringTemplate template = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));
		template.setDefaultId("");

		String result = Messages.message(template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the String message(StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testMessage_10()
		throws Exception {
		StringTemplate template = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		String result = Messages.message(template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the String message(StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testMessage_11()
		throws Exception {
		StringTemplate template = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		String result = Messages.message(template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the String message(StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testMessage_12()
		throws Exception {
		StringTemplate template = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		String result = Messages.message(template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the String message(StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testMessage_13()
		throws Exception {
		StringTemplate template = new StringTemplate(new FreeColXMLReader(new ByteArrayInputStream("".getBytes())));

		String result = Messages.message(template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:275)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1237)
		//       at net.sf.freecol.common.model.StringTemplate.<init>(StringTemplate.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the String nameKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testNameKey_1()
		throws Exception {
		String id = "";

		String result = Messages.nameKey(id);

		// add additional test code here
		assertEquals(".name", result);
	}

	/**
	 * Run the String nameKey(ObjectWithId) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testNameKey_2()
		throws Exception {
		ObjectWithId object = new AbstractGoods();

		String result = Messages.nameKey(object);

		// add additional test code here
		assertEquals("null.name", result);
	}

	/**
	 * Run the String rulerKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testRulerKey_1()
		throws Exception {
		String id = "";

		String result = Messages.rulerKey(id);

		// add additional test code here
		assertEquals(".ruler", result);
	}

	/**
	 * Run the void setGrammaticalNumber(Number) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testSetGrammaticalNumber_1()
		throws Exception {
		Number number = new DefaultNumberRule();

		Messages.setGrammaticalNumber(number);

		// add additional test code here
	}

	/**
	 * Run the String shortDescriptionKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	@Test
	public void testShortDescriptionKey_1()
		throws Exception {
		String id = "";

		String result = Messages.shortDescriptionKey(id);

		// add additional test code here
		assertEquals(".shortDescription", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/13/18 2:24 PM
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
	 * @generatedBy CodePro at 5/13/18 2:24 PM
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
	 * @generatedBy CodePro at 5/13/18 2:24 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MessagesTest.class);
	}
}