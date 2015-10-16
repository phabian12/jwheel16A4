package originalGame;
public class Dice {

	private DiceValue value;

	public Dice() {
		value = DiceValue.getRandom();
	}

	public DiceValue getValue() {
		return value;
	}

	/* OLD CODE */
//	public DiceValue roll() {
//		return DiceValue.getRandom();
//	}
	
	/* NEW CODE */
	public DiceValue roll() {
		return value = DiceValue.getRandom();
	}

	public String toString() {
		return value.toString();
	}
}
