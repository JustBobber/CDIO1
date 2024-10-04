package test;

import java.util.HashMap;
import java.util.Collections;

import game.Die;
import game.util.Util;

public class StatisticValidation {

    public static void main(String[] args){
        
        int pass = 0;
        int fail = 0;
        final int TESTS = 100;

        for (var j = 0; j < TESTS; j++){

            Die die = new Die();
            final double NUMBER_OF_ROLLS = 1000;
            final double MAX_DIFFERENCE = NUMBER_OF_ROLLS * 0.05; 
            HashMap<Integer, Integer> rollCount = new HashMap<>(); 
            
            for(int i = 1; i <= 6; i++){
                rollCount.put(i, 0);
            }

            for(double i = 0.0; i < NUMBER_OF_ROLLS; i+=1){
                int roll = die.roll().getFaceValue();
                rollCount.replace(roll, rollCount.get(roll) + 1);
            }

            if ((Collections.max(rollCount.values()) - Collections.min(rollCount.values()) > MAX_DIFFERENCE)){
                fail++;
            } else {
                pass++;
            }
        }
        
        Util.print("Test passed: " + pass);
        Util.print("Test failed: " + fail);
    }
}




