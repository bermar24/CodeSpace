package DiceGame;

public class DiceCup {
    private final Dice[] dices;

    public DiceCup(int numberOfDices){
        dices = new Dice[numberOfDices];
        for (int i = 0; i < numberOfDices; i++){
            dices[i] = new Dice();
        }
    }

    public int roll(){
        int value = 0;
        for (Dice dice : dices) {
            value += dice.roll();
        }
        return value;
    }
}
