package game;

public class Die {

    private Integer faceValue;

    public Die() {
        this.faceValue = null;
    }

    public Integer getFaceValue() {
        return this.faceValue;
    }

    public Die roll() {
        this.faceValue = (int)(Math.random() * 6) + 1;
        return this;
    }

}