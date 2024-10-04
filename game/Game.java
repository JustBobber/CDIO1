package game;
import game.util.Util;
import java.util.Scanner;

public class Game {

    private Player player1;
    private Player player2;
    private Die die;
    private int nextPlayerNumber;
    private Scanner scanner;
    final private int MAX_SCORE = 40;

    public Game() {
        this.player1 = new Player("Player 1", 1);
        this.player2 = new Player("Player 2", 2);
        this.nextPlayerNumber = 1;
        this.scanner = new Scanner(System.in);
        this.die = new Die();
    }

    private void setNextPlayer(Player player) {
        this.nextPlayerNumber = player.getPlayerNumber();
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
        if (roll1 == 1 && roll2 == 1) {
            player.resetScore();
            Util.print(player.getPlayerName() + " rolled two ones, so their score was set to zero");
            setNextPlayer(player);
            return;
        } 
        if (roll1 == roll2) {
            player.addScore(roll1 + roll2);
            setNextPlayer(player);
            Util.print(player.getPlayerName() + " rolled a pair of " + roll1 + "'s so they got an extra turn");
            return;
        }
        player.addScore(roll1 + roll2);
        Util.print(player.getPlayerName() + " rolled " + roll1 + " and " + roll2);
        switch (player.getPlayerNumber()) {
            case 1:
                setNextPlayer(this.player2);
                break;
            case 2:
                setNextPlayer(this.player1);
                break;
        }
    }

    public void start() {
        while (true) {
            if (this.player1.getScore() >= MAX_SCORE) {
                Util.print(this.player1.getPlayerName() + " has won the game!");
                break;
            } else if (this.player2.getScore() >= MAX_SCORE) {
                Util.print(this.player2.getPlayerName() + " has won the game!");
                break;
            }
            if (this.nextPlayerNumber == 1) {
                Util.print(this.player1.getPlayerName() + " press enter to roll");
                waitForEnter();
                roll(this.player1);
            } else {
                Util.print(this.player2.getPlayerName() + " press enter to roll");
                waitForEnter();
                roll(this.player2);
            }
            Util.print(this.player1.getPlayerName() + " score: " + this.player1.getScore());
            Util.print(this.player2.getPlayerName() + " score: " + this.player2.getScore());
        }
    }

}