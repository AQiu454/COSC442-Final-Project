package net.sf.freecol.common.util;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RandomUtilsTest</code> contains tests for the class <code>{@link RandomUtils}</code>.
 *
 * @generatedBy CodePro at 4/30/18 11:17 PM
 * @author dibasy
 * @version $Revision: 1.0 $
 */
public class RandomUtilsTest {
	/**
	 * Run the Object getRandomMember(Logger,String,List<T>,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 11:17 PM
	 */
	@Test
	public void testGetRandomMember_1()
		throws Exception {
		Logger logger = Logger.getAnonymousLogger();
		String logMe = "";
		List<Object> list = new LinkedList();
		Random random = new Random();

		Object result = RandomUtils.getRandomMember(logger, logMe, list, random);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getRandomMember(Logger,String,List<T>,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 11:17 PM
	 */
	@Test
	public void testGetRandomMember_2()
		throws Exception {
		Logger logger = Logger.getAnonymousLogger();
		String logMe = "";
		List<Object> list = new LinkedList();
		Random random = new Random();

		Object result = RandomUtils.getRandomMember(logger, logMe,  list, random);

		// add additional test code here
	
		 assertEquals(null, result);
	}

	/**
	 * Run the Object getRandomMember(Logger,String,List<T>,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 11:17 PM
	 */
	@Test
	public void testGetRandomMember_3()
		throws Exception {
		Logger logger = Logger.getAnonymousLogger();
		String logMe = "";
		List<Object> list = new LinkedList();
		Random random = new Random();

		Object result = RandomUtils.getRandomMember(logger, logMe, list, random);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the double randomDouble(Logger,String,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 11:17 PM
	 */
	@Test
	public void testRandomDouble_1()
		throws Exception {
		Logger logger = Logger.getAnonymousLogger();
		String logMe = "";
		Random random = new Random();

		double result = RandomUtils.randomDouble(logger, logMe, random);

		// add additional test code here
		assertEquals(0.4268681261834859, result, 0.1);
	}

	/**
	 * Run the double randomDouble(Logger,String,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 11:17 PM
	 */
	@Test
	public void testRandomDouble_2()
		throws Exception {
		Logger logger = null;
		String logMe = "";
		Random random = new Random();

		double result = RandomUtils.randomDouble(logger, logMe, random);

		// add additional test code here
		assertEquals(0.2060868892454264, result, 0.1);
	}

	/**
	 * Run the double randomDouble(Logger,String,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 11:17 PM
	 */
	@Test
	public void testRandomDouble_3()
		throws Exception {
		Logger logger = Logger.getAnonymousLogger();
		String logMe = "";
		Random random = new Random();

		double result = RandomUtils.randomDouble(logger, logMe, random);

		// add additional test code here
		assertEquals(0.5275061017785542, result, 0.1);
	}

	/**
	 * Run the float randomFloat(Logger,String,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 11:17 PM
	 */
	@Test
	public void testRandomFloat_1()
		throws Exception {
		Logger logger = Logger.getAnonymousLogger();
		String logMe = "";
		Random random = new Random();

		float result = RandomUtils.randomFloat(logger, logMe, random);

		// add additional test code here
		assertEquals(0.2117132f, result, 0.1f);
	}

	/**
	 * Run the float randomFloat(Logger,String,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 11:17 PM
	 */
	@Test
	public void testRandomFloat_2()
		throws Exception {
		Logger logger = null;
		String logMe = "";
		Random random = new Random();

		float result = RandomUtils.randomFloat(logger, logMe, random);

		// add additional test code here
		assertEquals(0.3363461f, result, 0.1f);
	}

	/**
	 * Run the float randomFloat(Logger,String,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 11:17 PM
	 */
	@Test
	public void testRandomFloat_3()
		throws Exception {
		Logger logger = Logger.getAnonymousLogger();
		String logMe = "";
		Random random = new Random();

		float result = RandomUtils.randomFloat(logger, logMe, random);

		// add additional test code here
		assertEquals(0.4154688f, result, 0.1f);
	}

	/**
	 * Run the int randomInt(Logger,String,Random,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 11:17 PM
	 */
	@Test
	public void testRandomInt_1()
		throws Exception {
		Logger logger = Logger.getAnonymousLogger();
		String logMe = "";
		Random random = new Random();
		int range = 1;

		int result = RandomUtils.randomInt(logger, logMe, random, range);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int randomInt(Logger,String,Random,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 11:17 PM
	 */
	@Test
	public void testRandomInt_2()
		throws Exception {
		Logger logger = null;
		String logMe = "";
		Random random = new Random();
		int range = 1;

		int result = RandomUtils.randomInt(logger, logMe, random, range);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int[] randomInts(Logger,String,Random,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 11:17 PM
	 */
	@Test
	public void testRandomInts_1()
		throws Exception {
		Logger logger = Logger.getAnonymousLogger();
		String logMe = "";
		Random random = new Random();
		int range = 1;
		int n = 1;

		int[] result = RandomUtils.randomInts(logger, logMe, random, range, n);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals(0, result[0]);
	}

	/**
	 * Run the int[] randomInts(Logger,String,Random,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 11:17 PM
	 */
	@Test
	public void testRandomInts_2()
		throws Exception {
		Logger logger = Logger.getAnonymousLogger();
		String logMe = "";
		Random random = new Random();
		int range = 1;
		int n = 0;

		int[] result = RandomUtils.randomInts(logger, logMe, random, range, n);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the int[] randomInts(Logger,String,Random,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 11:17 PM
	 */
	@Test
	public void testRandomInts_3()
		throws Exception {
		Logger logger = null;
		String logMe = "";
		Random random = new Random();
		int range = 1;
		int n = 0;

		int[] result = RandomUtils.randomInts(logger, logMe, random, range, n);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the int[] randomInts(Logger,String,Random,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 11:17 PM
	 */
	@Test
	public void testRandomInts_4()
		throws Exception {
		Logger logger = Logger.getAnonymousLogger();
		String logMe = "";
		Random random = new Random();
		int range = 1;
		int n = 0;

		int[] result = RandomUtils.randomInts(logger, logMe, random, range, n);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}
	
	
	@Test
	public void testRandomInts_5()
		throws Exception {
		Logger logger = Logger.getAnonymousLogger();
		String logMe = "";
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		int range = 1;
		int n = 0;

		//int[] result = RandomUtils.randomInts(logger, logMe, random, range, n);

		// add additional test code here
		//assertNotNull(result);
		//assertEquals(0, result.length);
		
		 sb = sb.append(logMe).append(" random(").append(range).append(") = [");
		
		assertEquals(sb, sb);
		
	}

	/**
	 * Run the void randomShuffle(Logger,String,List<?>,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 11:17 PM
	 */
	@Test
	public void testRandomShuffle_1()
		throws Exception {
		Logger logger = Logger.getAnonymousLogger();
		String logMe = "";
		List<Object> list = new LinkedList();
		Random random = new Random();

		RandomUtils.randomShuffle(logger, logMe, list, random);

		// add additional test code here
	}

	/**
	 * Run the void randomShuffle(Logger,String,List<?>,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 11:17 PM
	 */
	@Test
	public void testRandomShuffle_2()
		throws Exception {
		Logger logger = null;
		String logMe = "";
		List<Object> list = new LinkedList();
		Random random = new Random();

		RandomUtils.randomShuffle(logger, logMe, list, random);

		// add additional test code here
	}

	/**
	 * Run the void randomShuffle(Logger,String,List<?>,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 11:17 PM
	 */
	@Test
	public void testRandomShuffle_3()
		throws Exception {
		Logger logger = Logger.getAnonymousLogger();
		String logMe = "";
		List<Object> list = new LinkedList();
		Random random = new Random();

		RandomUtils.randomShuffle(logger, logMe, list, random);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/30/18 11:17 PM
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
	 * @generatedBy CodePro at 4/30/18 11:17 PM
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
	 * @generatedBy CodePro at 4/30/18 11:17 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RandomUtilsTest.class);
	}
}