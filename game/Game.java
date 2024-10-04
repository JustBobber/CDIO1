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
        this.player1 = new Player();
        this.player2 = new Player();
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

    public void start() {
        Util.print("game started");
        while (true) { 
            if (round % 2 == 0) {
                Util.print("player 1 press enter to roll");
                waitForEnter();
                int roll1 = this.die.roll().getFaceValue();
                int roll2 = this.die.roll().getFaceValue();
                Util.print("player 1 rolled " + (roll1+roll2));
                this.player1.addScore(roll1+roll2);
            } else {
                Util.print("player 2 press enter to roll");
                waitForEnter();
                int roll1 = this.die.roll().getFaceValue();
                int roll2 = this.die.roll().getFaceValue();
                Util.print("player 2 rolled " + (roll1+roll2));
                this.player2.addScore(roll1+roll2);
            }
            round++;
            Util.print("player1 score: " + this.player1.getScore());
            Util.print("player2 score: " + this.player2.getScore());
        }
    }

}