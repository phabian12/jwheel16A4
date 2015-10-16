package partTwoSimplification;

import org.junit.Before;
import org.junit.Test;

import originalGame.Player;

/* Author: James Wheeler
 * Student Number: 11515083
 * Intention of this test: Reproduce Bug 2
 */


public class TestBugTwo {
	
	private static Player testPlayer_;
	
	/* BEFORE */
	@Before
	public void setUp() throws Exception{
		
		//new player
		testPlayer_ = new Player("Jimbo", 6);
		//set bet limit to 0
		testPlayer_.setLimit(0);
	}
	
	@Test
	public void testPlayerBetLimits(){
		
		//universal bet
		int testBet_ = 5;
		
	    System.out.println("Balance: " + testPlayer_.getBalance());
	    System.out.println("Bet: " + testBet_);
	    System.out.println("Balance Exceeds Limit By " + testBet_ + ": "
	    		+ "" + testPlayer_.balanceExceedsLimitBy(testBet_));
		
	    testPlayer_ = new Player("Test1", 1);
	    System.out.println("\nBalance: " + testPlayer_.getBalance());
	    System.out.println("Bet: " + testBet_);
	    System.out.println("Balance Exceeds Limit By " + testBet_ + ": "
	    		+ "" + testPlayer_.balanceExceedsLimitBy(testBet_));
	    
	    testPlayer_ = new Player("Test2", 2);
	    System.out.println("\nBalance: " + testPlayer_.getBalance());
	    System.out.println("Bet: " + testBet_);
	    System.out.println("Balance Exceeds Limit By " + testBet_ + ": "
	    		+ "" + testPlayer_.balanceExceedsLimitBy(testBet_));
	    
	    testPlayer_ = new Player("Test3", 3);
	    System.out.println("\nBalance: " + testPlayer_.getBalance());
	    System.out.println("Bet: " + testBet_);
	    System.out.println("Balance Exceeds Limit By " + testBet_ + ": "
	    		+ "" + testPlayer_.balanceExceedsLimitBy(testBet_));
	    
	    testPlayer_ = new Player("Test4", 4);
	    System.out.println("\nBalance: " + testPlayer_.getBalance());
	    System.out.println("Bet: " + testBet_);
	    System.out.println("Balance Exceeds Limit By " + testBet_ + ": "
	    		+ "" + testPlayer_.balanceExceedsLimitBy(testBet_));
	    
	    testPlayer_ = new Player("Test5", 5);
	    System.out.println("\nBalance: " + testPlayer_.getBalance());
	    System.out.println("Bet: " + testBet_);
	    System.out.println("Balance Exceeds Limit By " + testBet_ + ": "
	    		+ "" + testPlayer_.balanceExceedsLimitBy(testBet_));
	    
	    testPlayer_ = new Player("Test6", 6);
	    System.out.println("\nBalance: " + testPlayer_.getBalance());
	    System.out.println("Bet: " + testBet_);
	    System.out.println("Balance Exceeds Limit By " + testBet_ + ": "
	    		+ "" + testPlayer_.balanceExceedsLimitBy(testBet_));
	    
	    testPlayer_ = new Player("Test7", 7);
	    System.out.println("\nBalance: " + testPlayer_.getBalance());
	    System.out.println("Bet: " + testBet_);
	    System.out.println("Balance Exceeds Limit By " + testBet_ + ": "
	    		+ "" + testPlayer_.balanceExceedsLimitBy(testBet_));
	    
	    testPlayer_ = new Player("Test8", 8);
	    System.out.println("\nBalance: " + testPlayer_.getBalance());
	    System.out.println("Bet: " + testBet_);
	    System.out.println("Balance Exceeds Limit By " + testBet_ + ": "
	    		+ "" + testPlayer_.balanceExceedsLimitBy(testBet_));
	    
	    testPlayer_ = new Player("Test9", 9);
	    System.out.println("\nBalance: " + testPlayer_.getBalance());
	    System.out.println("Bet: " + testBet_);
	    System.out.println("Balance Exceeds Limit By " + testBet_ + ": "
	    		+ "" + testPlayer_.balanceExceedsLimitBy(testBet_));
	    
	    testPlayer_ = new Player("Test10", 10);
	    System.out.println("\nBalance: " + testPlayer_.getBalance());
	    System.out.println("Bet: " + testBet_);
	    System.out.println("Balance Exceeds Limit By " + testBet_ + ": "
	    		+ "" + testPlayer_.balanceExceedsLimitBy(testBet_));
	    
	}

}
