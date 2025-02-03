package org.example.decorator;

import org.example.service.Drink;

public class BillDecorator extends DrinkDecorator{
    public BillDecorator(final Drink drink) {
        super(drink);
    }

    @Override
    public String serve() {
        return super.serve() + " check printed";
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
