package org.example;

public class TheSimpliestSingleton { //the basic version, only for one-thread applications, do not recommend to use
    private static TheSimpliestSingleton theSimpliestSingleton;

    private TheSimpliestSingleton() { // impossible to create the singleton
    }

    public static TheSimpliestSingleton getInstance() { //logic creating and checking of singleton existence
        if (theSimpliestSingleton == null) {
            theSimpliestSingleton = new TheSimpliestSingleton();
        }
        return theSimpliestSingleton;
    }
}
