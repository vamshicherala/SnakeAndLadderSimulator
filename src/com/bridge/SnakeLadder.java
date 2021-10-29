package com.bridge;

import java.util.Random;
import java.util.Scanner;

public class SnakeLadder {
    public void diesRoll(){                         //Creating a method for rolling Dies
        Random rand = new Random();                 //using random function
        int least = 1;
        int number = least + rand.nextInt(6);   //here the random function is used to generate number b/w 1-6
        System.out.println("No after dies rolls : "+number);
    }
    public static void main(String[] args) {
        System.out.println("*****Welcome to Snake and Ladder Stimulator*****");
        String name = "Vamshi";      // Declaring the player name
        int playerPosition = 0;      //cnsidering the initial position of player as 0
        System.out.println("Welcome "+name+" Lets Start the Game and your initial position is : "+playerPosition);
        SnakeLadder s = new SnakeLadder();
        s.diesRoll();               //calling the diesRoll function
    }
}
