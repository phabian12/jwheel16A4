package originalGame;
public class Dice {

	private DiceValue value;

	public Dice() {
		value = DiceValue.getRandom();
	}

	public DiceValue getValue() {
		return value;
	}

	public DiceValue roll() {
		return DiceValue.getRandom();
		//return value = DiceValue.getRandom();
	}

	public String toString() {
		return value.toString();
	}
}
