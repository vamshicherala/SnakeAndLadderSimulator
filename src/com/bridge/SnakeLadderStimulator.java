package com.bridge;

import java.util.Random;

/**
 * @class - SnakeLadderStimulator
 * @author - vamshi
 * @date - 1st Dec
 * in class SnakeLadderStimulator we print a welcome message with player position and single player
 */
public class SnakeLadderStimulator {
    static int PLAYERPOSITION = 0;
    public static void main(String[] args) {
        System.out.println("*****Welcome to Snake and Ladder Stimulator*****");
        String name = "Vamshi";
        System.out.println("Welcome "+name+" Lets Start the Game and your initial position is : "+ PLAYERPOSITION);
        SnakeLadderStimulator snakeLadderStimulator = new SnakeLadderStimulator();
        int dies = snakeLadderStimulator.diesRoll();
        System.out.println( "DiesRoll number: "+ dies);
        snakeLadderStimulator.positions(PLAYERPOSITION,dies);

    }

    int diesRoll(){
        Random rand = new Random();
        int least = 1;
        int number = least + rand.nextInt(6);
        return number;
    }
    void positions(int PLAYERPOSITION, int dies){
        Random rand1 = new Random();
        int option = rand1.nextInt(2);
        switch (option){
            case 1:
                System.out.println("**Ladder**");
                PLAYERPOSITION = PLAYERPOSITION + dies;
                System.out.println(PLAYERPOSITION);
                break;
            case 0:
                System.out.println("**Snake**");
                PLAYERPOSITION= PLAYERPOSITION - dies;
                System.out.println(PLAYERPOSITION);
                break;
            default:
                System.out.println("No Play");
                System.out.println(PLAYERPOSITION);
        }
    }
}
