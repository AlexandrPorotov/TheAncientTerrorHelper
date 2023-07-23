package com.aleksandr.theancientterrorhelper.Utils;

public class DiceUtil {
    public static int getResultOfDice(int numOfFacet){
        return (int) (Math.random() * numOfFacet);
    }

    public static int getResultOfDice(){
        return (int) (Math.random() * 6);
    }
}
