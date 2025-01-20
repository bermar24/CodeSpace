package DiceGame;

import java.util.ArrayList;
import java.util.Scanner;

public class DiceGame {
    private Scanner scanner;
    ArrayList<Player> players = new ArrayList<Player>();
    DiceCup diceCup;
    int edge;

    public DiceGame(ArrayList<Player> players, int dices, int edge){
        this.players = players;
        this.diceCup = new DiceCup(dices);
        this.edge = edge;
    }

    public void move(Player player) {
        String name = player.getName();
        System.out.println(name + " hat aktuell " + player.getScore() + " Punkte.\n" + name + ", möchtest du würfeln? (1=Ja, 2=Nein)");
        scanner = new Scanner(System.in);
        boolean isRolling = scanner.nextInt() == 1;
        if (isRolling) {
            int scored = diceCup.roll();
            player.addScore(scored);
            System.out.println(name + " hat " + scored + " gewürfelt.\n" + name + " hat insgesamt " + player.getScore() + " Punkte.");
        }
    }

    public void start() {
        boolean running = true;
        int inactivePlayers = 0;

        while (running) {
            for (Player player : players) {
                if(!player.isPlayerActive()) {
                    continue;
                }
                move(player);
                if (player.getScore() > this.edge) {
                    inactivePlayers ++;
                    player.setActive(false);
                } else if ( player.getScore() == this.edge ) {
                    running = false;
                    for(Player p : players){
                        if (p != player) { p.setActive(false); }
                    }
                    break;
                }
                if (inactivePlayers == players.size() - 1) {
                    running = false;
                    break;
                }
            }
        }

        for (Player player: players) {
            if (!player.isPlayerActive()) {
                System.out.println(player.getName() + " hat verloren!");
            } else{
                System.out.println(player.getName() + " hat gewonnen!");
            }
        }
    }
}