package org.example;

public class Bartender implements DrinkService {
    @Override
    public void serveDrink(final String name, final int age, final Drink drink) {
        System.out.printf("Made %s for %s \n", drink, name);
    }
}
