package game;
import game.util.Util;
import java.util.Scanner;

public class Game {

    private Player player1;
    private Player player2;
    private Die die;
    private int round;
    private Scanner scanner;

    public Game() {
        this.player1 = new Player("Player 1");
        this.player2 = new Player("Player 2");
        this.round = 0;
        this.scanner = new Scanner(System.in);
        this.die = new Die();
    }

    /**
     * wait for a user to press enter
     */
    private void waitForEnter() {
        this.scanner.nextLine(); 
    }

    /**
     * rolls the die twice, adds the score and prints the result
     */
    private void roll(Player player) { 
        int roll1 = this.die.roll().getFaceValue();
        int roll2 = this.die.roll().getFaceValue();
        player.addScore(roll1 + roll2);
        Util.print(player.getPlayerName() + " rolled " + (roll1 + roll2));
    }

    public void start() {
        while (true) { 
            if (round % 2 == 0) {
                Util.print(this.player1.getPlayerName() + " press enter to roll");
                waitForEnter();
                roll(this.player1);
            } else {
                Util.print(this.player2.getPlayerName() + " press enter to roll");
                waitForEnter();
                roll(this.player2);
            }
            round++;
            Util.print(this.player1.getPlayerName() + " score: " + this.player1.getScore());
            Util.print(this.player2.getPlayerName() + " score: " + this.player2.getScore());
        }
    }

}