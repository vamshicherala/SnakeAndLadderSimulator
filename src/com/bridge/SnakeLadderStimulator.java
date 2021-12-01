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
        System.out.println("Welcome " + name + " Lets Start the Game and your initial position is : " + PLAYERPOSITION);
        SnakeLadderStimulator snakeLadderStimulator = new SnakeLadderStimulator();
        snakeLadderStimulator.positions();
    }

    void positions() {
        int playerPosition = 0;
        int min =1;
        for (int i = 0; PLAYERPOSITION < 100; i++) {
            Random rand = new Random();
            int diesRoll = min + rand.nextInt(6);
            System.out.println("Diesroll number: " + diesRoll);
            Random rand1 = new Random();
            playerPosition=PLAYERPOSITION;
            int option = rand1.nextInt(2);
            switch (option) {
                case 1:
                    System.out.println("**Ladder**");
                    PLAYERPOSITION = PLAYERPOSITION + diesRoll;
                    if (PLAYERPOSITION>100)
                        System.out.println(playerPosition);
                    else
                        System.out.println(PLAYERPOSITION);
                    break;
                case 0:
                    System.out.println("**Snake**");
                    PLAYERPOSITION = PLAYERPOSITION - diesRoll;
                    System.out.println(PLAYERPOSITION);
                    if (PLAYERPOSITION < 0)
                        PLAYERPOSITION = 0;
                    break;
                default:
                    System.out.println("No Play");
                    System.out.println(PLAYERPOSITION);
            }
        }
    }
}