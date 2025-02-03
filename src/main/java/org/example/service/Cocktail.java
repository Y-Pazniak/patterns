package org.example.service;

public class Cocktail implements Drink {
    @Override
    public String serve() {
        return "Cocktail";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
