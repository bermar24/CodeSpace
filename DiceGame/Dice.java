package DiceGame;

public class Dice {
    private int value;

    public Dice(){
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public int roll() {
        this.value = (int) (Math.random() * 6) + 1;
        return value;
    }
}