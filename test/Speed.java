package test;

import game.Die;
import game.util.Util;

public class Speed {

    public static void main(String[] args){
        
        Die die = new Die();
        final int NUMBER_OF_ROLLS = 1000;
        final int MAX_RUNTIME_MS = 333 * NUMBER_OF_ROLLS;

        long startTime = System.currentTimeMillis();

        for(var i = 0; i < NUMBER_OF_ROLLS; i++){
            die.roll().getFaceValue();
        }

        long endTime = System.currentTimeMillis();
        long runtime = endTime - startTime;

        if (runtime < MAX_RUNTIME_MS){
            Util.print("Test passed");
        } else{
            Util.print("Test failed");
        }     
    }
}




