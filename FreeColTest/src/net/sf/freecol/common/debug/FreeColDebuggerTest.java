package net.sf.freecol.common.debug;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.server.FreeColServer;
import net.sf.freecol.common.util.LogBuilder;
import net.sf.freecol.common.model.Player;
import org.junit.*;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>FreeColDebuggerTest</code> contains tests for the class <code>{@link FreeColDebugger}</code>.
 *
 * @generatedBy CodePro at 5/13/18 2:21 PM
 * @author Club President
 * @version $Revision: 1.0 $
 */
public class FreeColDebuggerTest {
	/**
	 * Run the FreeColDebugger() constructor test.
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testFreeColDebugger_1()
		throws Exception {
		FreeColDebugger result = new FreeColDebugger();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void addStackTrace(LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testAddStackTrace_1()
		throws Exception {
		LogBuilder lb = new LogBuilder(1);

		FreeColDebugger.addStackTrace(lb);

		// add additional test code here
	}

	/**
	 * Run the void addStackTrace(LogBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testAddStackTrace_2()
		throws Exception {
		LogBuilder lb = new LogBuilder(1);

		FreeColDebugger.addStackTrace(lb);

		// add additional test code here
	}

	/**
	 * Run the void configureDebugRun(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testConfigureDebugRun_1()
		throws Exception {
		String option = "a";

		FreeColDebugger.configureDebugRun(option);

		// add additional test code here
	}

	/**
	 * Run the void configureDebugRun(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testConfigureDebugRun_2()
		throws Exception {
		String option = "a";

		FreeColDebugger.configureDebugRun(option);

		// add additional test code here
	}

	/**
	 * Run the void configureDebugRun(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testConfigureDebugRun_3()
		throws Exception {
		String option = "";

		FreeColDebugger.configureDebugRun(option);

		// add additional test code here
	}

	/**
	 * Run the void configureDebugRun(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testConfigureDebugRun_4()
		throws Exception {
		String option = "";

		FreeColDebugger.configureDebugRun(option);

		// add additional test code here
	}

	/**
	 * Run the void configureDebugRun(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testConfigureDebugRun_5()
		throws Exception {
		String option = "a";

		FreeColDebugger.configureDebugRun(option);

		// add additional test code here
	}

	/**
	 * Run the void configureDebugRun(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testConfigureDebugRun_6()
		throws Exception {
		String option = "a";

		FreeColDebugger.configureDebugRun(option);

		// add additional test code here
	}

	/**
	 * Run the void configureDebugRun(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testConfigureDebugRun_7()
		throws Exception {
		String option = "";

		FreeColDebugger.configureDebugRun(option);

		// add additional test code here
	}

	/**
	 * Run the void configureDebugRun(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testConfigureDebugRun_8()
		throws Exception {
		String option = "";

		FreeColDebugger.configureDebugRun(option);

		// add additional test code here
	}

	/**
	 * Run the Player debugDisplayColonyValuePlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testDebugDisplayColonyValuePlayer_1()
		throws Exception {

		Player result = FreeColDebugger.debugDisplayColonyValuePlayer();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the boolean debugDisplayCoordinates() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testDebugDisplayCoordinates_1()
		throws Exception {

		boolean result = FreeColDebugger.debugDisplayCoordinates();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean debugDisplayCoordinates() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testDebugDisplayCoordinates_2()
		throws Exception {

		boolean result = FreeColDebugger.debugDisplayCoordinates();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void debugLog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testDebugLog_1()
		throws Exception {
		String msg = "";

		FreeColDebugger.debugLog(msg);

		// add additional test code here
	}

	/**
	 * Run the boolean debugShowMission() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testDebugShowMission_1()
		throws Exception {

		boolean result = FreeColDebugger.debugShowMission();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean debugShowMission() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testDebugShowMission_2()
		throws Exception {

		boolean result = FreeColDebugger.debugShowMission();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean debugShowMissionInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testDebugShowMissionInfo_1()
		throws Exception {

		boolean result = FreeColDebugger.debugShowMissionInfo();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean debugShowMissionInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testDebugShowMissionInfo_2()
		throws Exception {

		boolean result = FreeColDebugger.debugShowMissionInfo();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void enableDebugMode(DebugMode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testEnableDebugMode_1()
		throws Exception {
		FreeColDebugger.DebugMode mode = FreeColDebugger.DebugMode.COMMS;

		FreeColDebugger.enableDebugMode(mode);

		// add additional test code here
	}

	/**
	 * Run the boolean finishDebugRun(FreeColClient,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testFinishDebugRun_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		boolean force = true;

		boolean result = FreeColDebugger.finishDebugRun(freeColClient, force);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:382)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:375)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:179)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:138)
		assertTrue(result);
	}

	/**
	 * Run the boolean finishDebugRun(FreeColClient,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testFinishDebugRun_2()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		boolean force = false;

		boolean result = FreeColDebugger.finishDebugRun(freeColClient, force);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:382)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:375)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:179)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:138)
		assertTrue(result);
	}

	/**
	 * Run the boolean finishDebugRun(FreeColClient,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testFinishDebugRun_3()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		freeColClient.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		boolean force = true;

		boolean result = FreeColDebugger.finishDebugRun(freeColClient, force);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:382)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:375)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:179)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:138)
		assertTrue(result);
	}

	/**
	 * Run the boolean finishDebugRun(FreeColClient,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testFinishDebugRun_4()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new ByteArrayInputStream("".getBytes()), "");
		boolean force = true;

		boolean result = FreeColDebugger.finishDebugRun(freeColClient, force);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:382)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:375)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:179)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:138)
		assertTrue(result);
	}

	/**
	 * Run the String getDebugModes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testGetDebugModes_1()
		throws Exception {

		String result = FreeColDebugger.getDebugModes();

		// add additional test code here
		assertEquals("COMMS", result);
	}

	/**
	 * Run the String getDebugRunSave() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testGetDebugRunSave_1()
		throws Exception {

		String result = FreeColDebugger.getDebugRunSave();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getDebugRunTurns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testGetDebugRunTurns_1()
		throws Exception {

		int result = FreeColDebugger.getDebugRunTurns();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the boolean getNormalGameFogOfWar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testGetNormalGameFogOfWar_1()
		throws Exception {

		boolean result = FreeColDebugger.getNormalGameFogOfWar();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getNormalGameFogOfWar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testGetNormalGameFogOfWar_2()
		throws Exception {

		boolean result = FreeColDebugger.getNormalGameFogOfWar();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void handleCrash() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testHandleCrash_1()
		throws Exception {

		FreeColDebugger.handleCrash();

		// add additional test code here
	}

	/**
	 * Run the void handleCrash() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testHandleCrash_2()
		throws Exception {

		FreeColDebugger.handleCrash();

		// add additional test code here
	}

	/**
	 * Run the boolean isInDebugMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testIsInDebugMode_1()
		throws Exception {

		boolean result = FreeColDebugger.isInDebugMode();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isInDebugMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testIsInDebugMode_2()
		throws Exception {

		boolean result = FreeColDebugger.isInDebugMode();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isInDebugMode(DebugMode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testIsInDebugMode_3()
		throws Exception {
		FreeColDebugger.DebugMode mode = FreeColDebugger.DebugMode.COMMS;

		boolean result = FreeColDebugger.isInDebugMode(mode);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isInDebugMode(DebugMode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testIsInDebugMode_4()
		throws Exception {
		FreeColDebugger.DebugMode mode = FreeColDebugger.DebugMode.COMMS;

		boolean result = FreeColDebugger.isInDebugMode(mode);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setDebugDisplayColonyValuePlayer(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testSetDebugDisplayColonyValuePlayer_1()
		throws Exception {
		Player display = new Player(new Game(new IIOMetadataNode(), ""), new IIOMetadataNode());

		FreeColDebugger.setDebugDisplayColonyValuePlayer(display);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Read failure
		//       at net.sf.freecol.common.model.FreeColObject.readFromXMLElement(FreeColObject.java:912)
		//       at net.sf.freecol.common.model.Game.<init>(Game.java:216)
	}

	/**
	 * Run the void setDebugDisplayCoordinates(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testSetDebugDisplayCoordinates_1()
		throws Exception {
		boolean display = true;

		FreeColDebugger.setDebugDisplayCoordinates(display);

		// add additional test code here
	}

	/**
	 * Run the boolean setDebugModes(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testSetDebugModes_1()
		throws Exception {
		String optionValue = null;

		boolean result = FreeColDebugger.setDebugModes(optionValue);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setDebugModes(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testSetDebugModes_2()
		throws Exception {
		String optionValue = "";

		boolean result = FreeColDebugger.setDebugModes(optionValue);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean setDebugModes(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testSetDebugModes_3()
		throws Exception {
		String optionValue = "0";

		boolean result = FreeColDebugger.setDebugModes(optionValue);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setDebugModes(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testSetDebugModes_4()
		throws Exception {
		String optionValue = "0";

		boolean result = FreeColDebugger.setDebugModes(optionValue);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setDebugModes(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testSetDebugModes_5()
		throws Exception {
		String optionValue = "0";

		boolean result = FreeColDebugger.setDebugModes(optionValue);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setDebugModes(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testSetDebugModes_6()
		throws Exception {
		String optionValue = "0";

		boolean result = FreeColDebugger.setDebugModes(optionValue);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setDebugModes(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testSetDebugModes_7()
		throws Exception {
		String optionValue = "";

		boolean result = FreeColDebugger.setDebugModes(optionValue);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean setDebugModes(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testSetDebugModes_8()
		throws Exception {
		String optionValue = "";

		boolean result = FreeColDebugger.setDebugModes(optionValue);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void setDebugRunSave(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testSetDebugRunSave_1()
		throws Exception {
		String debugRunSave = "";

		FreeColDebugger.setDebugRunSave(debugRunSave);

		// add additional test code here
	}

	/**
	 * Run the void setDebugRunTurns(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testSetDebugRunTurns_1()
		throws Exception {
		int debugRunTurns = 1;

		FreeColDebugger.setDebugRunTurns(debugRunTurns);

		// add additional test code here
	}

	/**
	 * Run the void setDebugShowMission(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testSetDebugShowMission_1()
		throws Exception {
		boolean display = true;

		FreeColDebugger.setDebugShowMission(display);

		// add additional test code here
	}

	/**
	 * Run the void setDebugShowMissionInfo(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testSetDebugShowMissionInfo_1()
		throws Exception {
		boolean display = true;

		FreeColDebugger.setDebugShowMissionInfo(display);

		// add additional test code here
	}

	/**
	 * Run the void setNormalGameFogOfWar(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testSetNormalGameFogOfWar_1()
		throws Exception {
		boolean normalGameFogOfWar = true;

		FreeColDebugger.setNormalGameFogOfWar(normalGameFogOfWar);

		// add additional test code here
	}

	/**
	 * Run the void signalEndDebugRun() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testSignalEndDebugRun_1()
		throws Exception {

		FreeColDebugger.signalEndDebugRun();

		// add additional test code here
	}

	/**
	 * Run the void signalEndDebugRun() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testSignalEndDebugRun_2()
		throws Exception {

		FreeColDebugger.signalEndDebugRun();

		// add additional test code here
	}

	/**
	 * Run the String stackTraceToString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	@Test
	public void testStackTraceToString_1()
		throws Exception {

		String result = FreeColDebugger.stackTraceToString();

		// add additional test code here
		assertEquals("java.lang.Thread.getStackTrace(Unknown Source)\nnet.sf.freecol.common.debug.FreeColDebugger.addStackTrace(FreeColDebugger.java:402)\nnet.sf.freecol.common.debug.FreeColDebugger.stackTraceToString(FreeColDebugger.java:392)\nsun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\nsun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\nsun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\njava.lang.reflect.Method.invoke(Unknown Source)\ncom.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:575)\ncom.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)\ncom.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)\njava.lang.Thread.run(Unknown Source)", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/13/18 2:21 PM
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
	 * @generatedBy CodePro at 5/13/18 2:21 PM
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
	 * @generatedBy CodePro at 5/13/18 2:21 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FreeColDebuggerTest.class);
	}
}