package partTwoSimplification;

import originalGame.Dice;
import originalGame.DiceValue;
import originalGame.Game;
import originalGame.Player;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/* Author: James Wheeler
 * Student Number: 11515083
 * Intention of this test: Reproduce Bug 1
 */

public class TestBugOne {

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
	
	/* 1 MATCH */
	@Test
	public void testScenarioOne() {

		System.out.println("1 Match");

		// assign dice values
		when(mockDice1_.getValue()).thenReturn(DiceValue.CLUB);
		when(mockDice2_.getValue()).thenReturn(DiceValue.CROWN);
		when(mockDice3_.getValue()).thenReturn(DiceValue.DIAMOND);

		// initialize new game and parsing the Dice values
		testGame_ = new Game(mockDice1_, mockDice2_, mockDice3_);

		System.out.println("Starting Balance: " + testPlayer_.getBalance());
		
		// assign player's pick to CLUB
		DiceValue testPick_ = DiceValue.CLUB;
		// initialize balance, bet and winnings
		int playerBalance_ = testPlayer_.getBalance();
		int playerBet_ = 5;
		// calculate winnings by playing round and parsing player, pick and bet
		int playerWinnings_ = testGame_.playRound(testPlayer_, testPick_, playerBet_);

		// ensure the bet and winnings match
		assertEquals(5, playerWinnings_);

		// calculate new balance after the player has Bet
		int newBalance_ = (playerBalance_ - playerBet_);

		// begin prinying out playing details
		System.out.println("Player Name: " + testPlayer_.getName());
		System.out.println("Player Bet: " + playerBet_);
		System.out.println("Balance After Bet: " + newBalance_ + "\n");

		System.out.println("Player Picked: " + testPick_);
		System.out.println("Game Rolled: " + testGame_.getDiceValues());
		System.out.println(testPlayer_.getName() + " Wins: " + playerWinnings_ + " after his Bet of: " + playerBet_);

		// Reproducing Bug 1
		System.out.println("Balance WITH Bug: " + testPlayer_.getBalance());
		System.out.println("----------------------------------");
	}

	/* 2 MATCHES */
	@Test
	public void testScenarioTwo() {

		System.out.println("\n2 Matches");

		// assign dice values
		when(mockDice1_.getValue()).thenReturn(DiceValue.CLUB);
		when(mockDice2_.getValue()).thenReturn(DiceValue.CLUB);
		when(mockDice3_.getValue()).thenReturn(DiceValue.DIAMOND);

		// initialize new game and parsing the Dice values
		testGame_ = new Game(mockDice1_, mockDice2_, mockDice3_);

		System.out.println("Starting Balance: " + testPlayer_.getBalance());
		
		// assign player's pick to CLUB
		DiceValue testPick_ = DiceValue.CLUB;
		
		// initialize balance, bet and winnings
		int playerBalance_ = testPlayer_.getBalance();
		int playerBet_ = 5;
		int playerWinnings_ = testGame_.playRound(testPlayer_, testPick_, playerBet_);

		// ensure the bet and winnings match
		// winnings are multiplied by 2 for matching 2 dice.
		assertEquals(10, playerWinnings_);

		// calculate new balance after the player has Bet
		int newBalance_ = (playerBalance_ - playerBet_);

		// begin prinying out playing details

		System.out.println("Player Name: " + testPlayer_.getName());
		System.out.println("Player Bet: " + playerBet_);
		System.out.println("Balance After Bet: " + newBalance_ + "\n");
		System.out.println("Player Picked: " + testPick_);
		System.out.println("Game Rolled: " + testGame_.getDiceValues());
		System.out.println(testPlayer_.getName() + " Wins: " + playerWinnings_ + " after his Bet of: " + playerBet_);

		// Reproducing Bug 1
		System.out.println("Balance WITH Bug: " + testPlayer_.getBalance());
		System.out.println("----------------------------------");
	}

	/* 3 MATCHES */
	@Test
	public void testScenarioThree() {

		System.out.println("\n3 Matches");

		// assign dice values
		when(mockDice1_.getValue()).thenReturn(DiceValue.CLUB);
		when(mockDice2_.getValue()).thenReturn(DiceValue.CLUB);
		when(mockDice3_.getValue()).thenReturn(DiceValue.CLUB);

		// initialize new game and parsing the Dice values
		testGame_ = new Game(mockDice1_, mockDice2_, mockDice3_);

		System.out.println("Starting Balance: " + testPlayer_.getBalance());
		
		// assign player's pick to CLUB
		DiceValue testPick_ = DiceValue.CLUB;
		
		// initialize balance, bet and winnings
		int playerBalance_ = testPlayer_.getBalance();
		int playerBet_ = 5;
		int playerWinnings_ = testGame_.playRound(testPlayer_, testPick_, playerBet_);

		// ensure the bet and winnings match
		// winnings are multiplied by 2 for matching 2 dice.
		assertEquals(15, playerWinnings_);
		// calculate new balance after the player has Bet
		int newBalance_ = (playerBalance_ - playerBet_);

		// begin prinying out playing details
		System.out.println("Player Name: " + testPlayer_.getName());
		System.out.println("Player Bet: " + playerBet_);
		System.out.println("Balance After Bet: " + newBalance_ + "\n");

		System.out.println("Player Picked: " + testPick_);
		System.out.println("Game Rolled: " + testGame_.getDiceValues());
		System.out.println(testPlayer_.getName() + " Wins: " + playerWinnings_ + " after his Bet of: " + playerBet_);

		// Reproducing Bug 1
		System.out.println("Balance WITH Bug: " + testPlayer_.getBalance());
		System.out.println("----------------------------------");
	}
	
	@After
	public void reset() throws Exception {
		mockDice1_ = null;
		mockDice2_ = null;
		mockDice3_ = null;

		testPlayer_ = null;
	}

}
