package game;

import game.util.Util;

public class Player {

    private int score;

    public Player() {
        this.score = 0;
        Util.print("player initialized with score " + this.score);
    }

    public int getScore() {
        return this.score;
    }

    public void addScore(int points) {
        this.score += points;
    }

}