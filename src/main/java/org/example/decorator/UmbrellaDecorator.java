package org.example.decorator;

import org.example.service.Drink;

public class UmbrellaDecorator extends DrinkDecorator {
    public UmbrellaDecorator(final Drink drink) {
        super(drink);
    }

    @Override
    public String serve() {
        return super.serve() + " with umbrella ";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
