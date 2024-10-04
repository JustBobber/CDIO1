package game;

import game.util.Util;

public class Main {
    public static void main(String[] args){
        Util.welcome();
        Game game = new Game();
        game.start();
    }

}