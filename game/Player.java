package game;

public class Player {

    private int score;
    private String playerName;

    public Player(String playerName) {
        this.score = 0;
        this.playerName = playerName;
    }

    public int getScore() {
        return this.score;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void addScore(int points) {
        this.score += points;
    }

}