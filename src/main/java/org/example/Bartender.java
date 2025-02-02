package org.example;

public class Bartender implements DrinkService {
    @Override
    public void serveDrink(final String name, final int age, final Drink drink) {
        System.out.println("Made " + drink + " for " + name);
    }
}
