package DiceGame;

import java.util.ArrayList;
import java.util.Scanner;

public class DiceExec {
    public static void main(String[] args) {
        System.out.println("Wie viele Spieler sollen mitspielen?");
        Scanner readPlayers = new Scanner(System.in);
        int playerCount = readPlayers.nextInt();
        ArrayList<Player> players = new ArrayList<Player>();
        for (int i = 1; i <= playerCount; i++) {
            players.add(inPlayer(i));
        }
        System.out.println("Wie viele Würfel sollen benutzt werden?");
        Scanner readDices = new Scanner(System.in);
        int diceCount = readDices.nextInt();
        if (diceCount > 0 && playerCount > 1) {
            System.out.println("An welche Grenze sollen die Spieler herankommen?");
            Scanner readEdge = new Scanner(System.in);
            DiceGame game = new DiceGame(players, diceCount, readEdge.nextInt());
            game.start();
        } else {
            System.out.println("Es müssen mindestens 2 Spieler mit mindestens einen Würfel mitspielen.");
        }
    }

    private static Player inPlayer(int number){
        System.out.println("Gib Name für Spieler " + Integer.toString(number) + " ein:");
        Scanner read = new Scanner(System.in);
        return new Player(read.nextLine());
    }

//    public static void main(String[] args) {
//        Player p1 = new Player("Spieler 1");
//        Player p2 = new Player("Spieler 2");
//
//        p1.setScore((int) (Math.random() * 6) + 1);
//        p2.setScore((int) (Math.random() * 6) + 1);
//
//        int p1Score = p1.getScore();
//        int p2Score = p2.getScore();
//
//        System.out.println("Spieler 1 hat eine " + p1Score + " gewürfelt.");
//        System.out.println("Spieler 2 hat eine " + p2Score + " gewürfelt.");
//
//        if (p1Score > p2Score) {
//            System.out.println(p1.getName() + " hat gewonnen!");
//        } else if (p1Score < p2Score) {
//            System.out.println(p2.getName() + " hat gewonnen!");
//        } else {
//            System.out.println("Unentschieden!");
//        }
//    }
}