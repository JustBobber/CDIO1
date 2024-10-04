package game;

public class Player {

    private int score;
    private String playerName;
    private int playerNumber;
    private boolean lastThrowWasPairSix;

    public Player(String playerName, int playerNumber) {
        this.score = 0;
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        this.lastThrowWasPairSix = false;
    }

    public int getScore() {
        return this.score;
    }

    public boolean isLastThrowPairSix() {
        return this.lastThrowWasPairSix;
    }

    public void setLastThrowPairSix(boolean lastThrowPairSix) {
        this.lastThrowWasPairSix = lastThrowPairSix;
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

    public void resetScore() {
        this.score = 0;
    }

}