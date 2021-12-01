package com.bridge;

import java.util.Random;

/**
 * @class - SnakeLadderStimulator
 * @author - vamshi
 * @date - 1st Dec
 * in class SnakeLadderStimulator we print a welcome message with player position and single player
 */
public class SnakeLadderStimulator {
    public static void main(String[] args) {
        System.out.println("*****Welcome to Snake and Ladder Stimulator*****");
        String name = "Vamshi";
        int playerPosition = 0;
        System.out.println("Welcome "+name+" Lets Start the Game and your initial position is : "+playerPosition);
        DiesRoll diesRoll = new DiesRoll();
        System.out.println(diesRoll.number);
    }
}
