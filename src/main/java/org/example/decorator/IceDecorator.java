package org.example.decorator;

import org.example.service.Drink;

public class IceDecorator extends DrinkDecorator {

    public IceDecorator(final Drink drink) {
        super(drink);
    }

    @Override
    public String serve() {
        return super.serve() + " with ice";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
