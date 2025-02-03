package org.example.decorator;

import org.example.service.Drink;

public abstract class DrinkDecorator implements Drink {
    protected final Drink drink;

    public DrinkDecorator(final Drink drink) {
        this.drink = drink;
    }

    @Override
    public String serve() {
        return drink.serve();
    }

    @Override
    public int getPrice() {
        return drink.getPrice();
    }
}
