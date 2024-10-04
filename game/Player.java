package game;

public class Player {

    private int score;
    private String playerName;
    private int playerNumber;

    public Player(String playerName, int playerNumber) {
        this.score = 0;
        this.playerName = playerName;
        this.playerNumber = playerNumber;
    }

    public int getScore() {
        return this.score;
    }

    public int getPlayerNumber() {
        return this.playerNumber;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void addScore(int points) {
        this.score += points;
    }

}