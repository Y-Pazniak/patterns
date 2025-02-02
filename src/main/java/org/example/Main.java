package org.example;

import org.example.model.Drink;
import org.example.model.Visitor;

public class Main {
    public static void main(String[] args) {
        Bartender bartender = new Bartender();
        bartender.processOrder(new Visitor(20, Drink.BEER, 10));
        bartender.processOrder(new Visitor(15, Drink.MOJITO, 5));
        bartender.processOrder(new Visitor(30, "Grape's day", 2));
        bartender.processOrder(new Visitor(32, Drink.WHISKEY, -1));
    }
}