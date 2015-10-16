package part2Simplification;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import originalGame.Dice;
import originalGame.DiceValue;
import originalGame.Game;
import originalGame.Player;

/* Author: James Wheeler
 * Student Number: 11515083
 * Intention of this test: Reproduce Bug 3
 */

public class TestBugThree {

	private Player testPlayer_;

	private int bet_;

	int playerWinnings_;
	int gameRunnings_;
	int gamesWon_;
	int gamesLost_;

	private List<Dice> diceList_;
	private Dice dice1_;
	private Dice dice2_;
	private Dice dice3_;

	private Game testGame_;

	/* BEFORE TESTING */
	@Before
	public void setUp() throws Exception {
		this.testPlayer_ = new Player("Jim", 180);

		this.bet_ = 5;
		this.playerWinnings_ = 0;
		this.gameRunnings_ = 0;
		this.gamesWon_ = 0;
		this.gamesLost_ = 0;

		this.dice1_ = new Dice();
		this.dice2_ = new Dice();
		this.dice3_ = new Dice();

		this.diceList_ = new ArrayList<Dice>();
		diceList_.add(dice1_);
		diceList_.add(dice2_);
		diceList_.add(dice3_);

		this.testGame_ = new Game(dice1_, dice2_, dice3_);
	}

	/* AFTER TESTING */
	@After
	public void reset() throws Exception {
		this.testPlayer_ = null;

		this.bet_ = 0;
		this.playerWinnings_ = 0;
		this.gameRunnings_ = 0;
		this.gamesWon_ = 0;
		this.gamesLost_ = 0;

		this.dice1_ = null;
		this.dice2_ = null;
		this.dice3_ = null;

		this.diceList_ = null;

		this.testGame_ = null;
	}

	/* BUG REPLICATION */
	@Test
	public void testGameOdds() {

		List<DiceValue> diceValues_ = testGame_.getDiceValues();

		while (testPlayer_.balanceExceedsLimitBy(bet_) && testPlayer_.getBalance() < 200 && gameRunnings_ < 1000) {

			// randomise the player's pick
			DiceValue testPick_ = DiceValue.getRandom();

			// print out their selection
			System.out.println(testPlayer_.getName() + " bet " + bet_ + " on the dice " + testPick_);

			// calculate player winnings
			playerWinnings_ = testGame_.playRound(testPlayer_, testPick_, bet_);
			// assign new dice values
			diceValues_ = testGame_.getDiceValues();

			// print out the results of the game
			System.out.println(
					"Game Rolled: " + " " + diceValues_.get(0) + " " + diceValues_.get(1) + " " + diceValues_.get(2));

			// if player's pick matches one of the game values, then they will
			// that round
			if (diceValues_.get(0).equals(testPick_) || diceValues_.get(1).equals(testPick_)
					|| diceValues_.get(2).equals(testPick_)) {
				// if the player is succesful in winning their round, their win
				// count increases
				gamesWon_++;
			} else {
				// if they lose their round, their loss count increases
				gamesLost_++;
			}

			// printing out whether they won or lost
			// printing out their current balance
			if (playerWinnings_ > 0) {
				System.out.println(testPlayer_.getName() + " won " + playerWinnings_ + ". Balance is now: "
						+ testPlayer_.getBalance() + "\n");
			} else {
				System.out.println(testPlayer_.getName() + " lost. Balance is now: " + testPlayer_.getBalance() + "\n");
			}
		}

		// printing out the total number of wins and losses the player has
		System.out.println("Win Count =  " + gamesWon_ + ", " + "Lose Count = " + gamesLost_);

		// refomatting the to 2 decimal places
		DecimalFormat reformat_ = new DecimalFormat("####0.00");
		// printing out the win loss ration
		System.out.println("Win/Loss Ratio: " + reformat_.format((float) gamesWon_ / (gamesWon_ + gamesLost_)) + "%");
	}
}
