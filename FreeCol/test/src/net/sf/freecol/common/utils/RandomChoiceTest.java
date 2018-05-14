package net.sf.freecol.common.util;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;
import java.util.logging.Logger;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RandomChoiceTest</code> contains tests for the class <code>{@link RandomChoice}</code>.
 *
 * @generatedBy CodePro at 4/30/18 10:56 PM
 * @author dibasy
 * @version $Revision: 1.0 $
 */
public class RandomChoiceTest {
	/**
	 * Run the RandomChoice(T,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 10:56 PM
	 */
	@Test
	public void testRandomChoice_1()
		throws Exception {
		int probability = 1;

		RandomChoice result = new RandomChoice(null, probability);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getObject());
		assertEquals(1, result.getProbability());
	}

	/**
	 * Run the Object getObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 10:56 PM
	 */
	@Test
	public void testGetObject_1()
		throws Exception {
		RandomChoice fixture = new RandomChoice((Object) null, 1);

		Object result = fixture.getObject();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getProbability() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 10:56 PM
	 */
	@Test
	public void testGetProbability_1()
		throws Exception {
		RandomChoice fixture = new RandomChoice((Object) null, 1);

		int result = fixture.getProbability();

		// add additional test code here
		assertEquals(1, result);
	}
	
	
	@Test
	public void testSelect_1()
		throws Exception {
		Collection<RandomChoice<Object>> input = new LinkedList();

		int result = 0;

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTotalProbability(Collection<RandomChoice<T>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 10:56 PM
	 */
	@Test
	public void testGetTotalProbability_1()
		throws Exception {
		Collection<RandomChoice<Object>> input = new LinkedList();

		int result = RandomChoice.getTotalProbability(input);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Object getWeightedRandom(Logger,String,Collection<RandomChoice<T>>,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 10:56 PM
	 */
	@Test
	public void testGetWeightedRandom_1()
		throws Exception {
		Logger logger = Logger.getAnonymousLogger();
		String logMe = "";
		Collection<RandomChoice<Object>> input = new LinkedList();
		Random random = new Random();

		Object result = RandomChoice.getWeightedRandom(logger, logMe, input, random);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getWeightedRandom(Logger,String,Collection<RandomChoice<T>>,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 10:56 PM
	 */
	@Test
	public void testGetWeightedRandom_2()
		throws Exception {
		Logger logger = Logger.getAnonymousLogger();
		String logMe = "";
		Collection<RandomChoice<Object>> input = new LinkedList();
		Random random = new Random();

		Object result = RandomChoice.getWeightedRandom(logger, logMe, input, random);

		// add additional test code here
		//asser
		assertEquals(null, result);
	}

	/**
	 * Run the Object getWeightedRandom(Logger,String,Collection<RandomChoice<T>>,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 10:56 PM
	 */
	@Test
	public void testGetWeightedRandom_3()
		throws Exception {
		Logger logger = Logger.getAnonymousLogger();
		String logMe = "";
		Collection<RandomChoice<Object>> input = null;
		Random random = new Random();

		Object result = RandomChoice.getWeightedRandom(logger, logMe, input, random);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getWeightedRandom(Logger,String,Collection<RandomChoice<T>>,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 10:56 PM
	 */
	@Test
	public void testGetWeightedRandom_4()
		throws Exception {
		Logger logger = Logger.getAnonymousLogger();
		String logMe = "";
		Collection<RandomChoice<Object>> input = new LinkedList();
		Random random = new Random();

		Object result = RandomChoice.getWeightedRandom(logger, logMe, input, random);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getWeightedRandom(Logger,String,Collection<RandomChoice<T>>,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/30/18 10:56 PM
	 */
	@Test
	public void testGetWeightedRandom_5()
		throws Exception {
		Logger logger = Logger.getAnonymousLogger();
		String logMe = "";
		Collection<RandomChoice<Object>> input = new LinkedList();
		Random random = new Random();

		Object result = RandomChoice.getWeightedRandom(logger, logMe, input, random);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/30/18 10:56 PM
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
	 * @generatedBy CodePro at 4/30/18 10:56 PM
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
	 * @generatedBy CodePro at 4/30/18 10:56 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RandomChoiceTest.class);
	}
}