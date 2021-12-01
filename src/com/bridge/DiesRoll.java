package com.bridge;

import java.util.Random;

/**
 * @class - DiesRoll is used to obtain random number from range[1-6] by using Random keyword
 * @author - vamshi
 */
public class DiesRoll {
    Random rand = new Random();
    int least = 1;
    int number = least + rand.nextInt(6);
}
