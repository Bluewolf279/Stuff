package com.bluewolf;

/**
 * Created by Matt on 28/07/2015.
 * Class use: This class is used for basic math functions.
 */
public class baseFunctions {
    public static int toDegrees(int i) {
        return (int) (i * (180 / Math.PI));
    }
    public static int toRadians(int i){
        return (int) (i * (Math.PI / 180));
    }

}
