package net.sf.freecol.common.sound;

import java.io.File;
import java.io.FileNotFoundException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Mixer;
import org.junit.*;
import net.sf.freecol.common.option.PercentageOption;
import net.sf.freecol.common.model.Specification;
import net.sf.freecol.common.option.AudioMixerOption;
import static org.junit.Assert.*;

/**
 * The class <code>SoundPlayerTest</code> contains tests for the class <code>{@link SoundPlayer}</code>.
 *
 * @generatedBy CodePro at 5/8/18 7:01 PM
 * @author dibasy
 * @version $Revision: 1.0 $
 */
public class SoundPlayerTest {
	/**
	 * Run the SoundPlayer(AudioMixerOption,PercentageOption) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 7:01 PM
	 */
	@Test
	public void testSoundPlayer_1()
		throws Exception {
		AudioMixerOption mixerOption = new AudioMixerOption(new Specification());
		mixerOption.setValue(new net.sf.freecol.common.option.AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		PercentageOption volumeOption = new PercentageOption(new Specification());

		SoundPlayer result = new SoundPlayer(mixerOption, volumeOption);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getVolume());
	}

	/**
	 * Run the SoundPlayer(AudioMixerOption,PercentageOption) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 7:01 PM
	 */
	@Test
	public void testSoundPlayer_2()
		throws Exception {
		AudioMixerOption mixerOption = new AudioMixerOption(new Specification());
		mixerOption.setValue(new net.sf.freecol.common.option.AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		PercentageOption volumeOption = new PercentageOption(new Specification());

		SoundPlayer result = new SoundPlayer(mixerOption, volumeOption);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getVolume());
	}

	/**
	 * Run the AudioInputStream getAudioInputStream(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 7:01 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetAudioInputStream_1()
		throws Exception {
		File file = new File("");

		AudioInputStream result = SoundPlayer.getAudioInputStream(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AudioInputStream getAudioInputStream(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 7:01 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetAudioInputStream_2()
		throws Exception {
		File file = new File("");

		AudioInputStream result = SoundPlayer.getAudioInputStream(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AudioInputStream getAudioInputStream(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 7:01 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetAudioInputStream_3()
		throws Exception {
		File file = new File("sound.intro.general");

		AudioInputStream result = SoundPlayer.getAudioInputStream(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AudioInputStream getAudioInputStream(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 7:01 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetAudioInputStream_4()
		throws Exception {
		File file = new File("");

		AudioInputStream result = SoundPlayer.getAudioInputStream(file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Mixer getMixer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 7:01 PM
	 */
	@Test
	public void testGetMixer_1()
		throws Exception {
		AudioMixerOption audioMixerOption = new AudioMixerOption(new Specification());
		audioMixerOption.setValue(new net.sf.freecol.common.option.AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		SoundPlayer fixture = new SoundPlayer(audioMixerOption, new PercentageOption(new Specification()));

		Mixer result = fixture.getMixer();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isOpen());
	}

	/**
	 * Run the int getVolume() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 7:01 PM
	 */
	@Test
	public void testGetVolume_1()
		throws Exception {
		AudioMixerOption audioMixerOption = new AudioMixerOption(new Specification());
		audioMixerOption.setValue(new net.sf.freecol.common.option.AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		SoundPlayer fixture = new SoundPlayer(audioMixerOption, new PercentageOption(new Specification()));

		int result = fixture.getVolume();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void playOnce(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 7:01 PM
	 */
	@Test
	public void testPlayOnce_1()
		throws Exception {
		AudioMixerOption audioMixerOption = new AudioMixerOption(new Specification());
		audioMixerOption.setValue(new net.sf.freecol.common.option.AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		SoundPlayer fixture = new SoundPlayer(audioMixerOption, new PercentageOption(new Specification()));
		File file = new File("");

		fixture.playOnce(file);

		// add additional test code here
	}

	/**
	 * Run the void playOnce(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 7:01 PM
	 */
	@Test
	public void testPlayOnce_2()
		throws Exception {
		AudioMixerOption audioMixerOption = new AudioMixerOption(new Specification());
		audioMixerOption.setValue(new net.sf.freecol.common.option.AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		SoundPlayer fixture = new SoundPlayer(audioMixerOption, new PercentageOption(new Specification()));
		File file = new File("");

		fixture.playOnce(file);

		// add additional test code here
	}

	/**
	 * Run the void playOnce(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 7:01 PM
	 */
	@Test
	public void testPlayOnce_3()
		throws Exception {
		AudioMixerOption audioMixerOption = new AudioMixerOption(new Specification());
		audioMixerOption.setValue(new net.sf.freecol.common.option.AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		SoundPlayer fixture = new SoundPlayer(audioMixerOption, new PercentageOption(new Specification()));
		File file = new File("");

		fixture.playOnce(file);

		// add additional test code here
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/8/18 7:01 PM
	 */
	@Test
	public void testStop_1()
		throws Exception {
		AudioMixerOption audioMixerOption = new AudioMixerOption(new Specification());
		audioMixerOption.setValue(new net.sf.freecol.common.option.AudioMixerOption.MixerWrapper("", (javax.sound.sampled.Mixer.Info) null));
		SoundPlayer fixture = new SoundPlayer(audioMixerOption, new PercentageOption(new Specification()));

		fixture.stop();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/8/18 7:01 PM
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
	 * @generatedBy CodePro at 5/8/18 7:01 PM
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
	 * @generatedBy CodePro at 5/8/18 7:01 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SoundPlayerTest.class);
	}
}