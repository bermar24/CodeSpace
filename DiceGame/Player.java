package DiceGame;

public class Player {
    private final String name;
    private int score;
    private boolean isActive;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.isActive = true;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int newScore){
        this.score = newScore;
    }

    public void addScore(int value){
        this.score += value;
    }

    public boolean isPlayerActive(){
        return isActive;
    }

    public void setActive(boolean state){ isActive = state; }
}

