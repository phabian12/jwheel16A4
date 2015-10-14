package testingBugs;

import static org.mockito.Mockito.mock;

import org.junit.Before;

import originalGame.Dice;
import originalGame.Game;
import originalGame.Player;

/* Author: James Wheeler
 * Student Number: 11515083
 * Intention of this test: Reproduce Bug 3
 */

public class TestBugThree {
	
	private static Player testPlayer_;
	private static Game testGame_;
	private static Dice mockDice1_, mockDice2_, mockDice3_;

	/* BEFORE TESTING */
	@Before
	public void setUp() throws Exception {
		mockDice1_ = mock(Dice.class);
		mockDice2_ = mock(Dice.class);
		mockDice3_ = mock(Dice.class);
		testPlayer_ = new Player("Jim", 80);
	}
}
