package org.example;

public class Main {
    public static void main(String[] args) {
        DrinkService bar = new ProxyBartender();

        bar.serveDrink("Lupa", 25, Drink.WHISKEY);
        bar.serveDrink("Pupa", 30, Drink.MOJITO);
        bar.serveDrink("Batman", 30, Drink.BEER);
        bar.serveDrink("King Karl the Third", 25, Drink.BEER);
        bar.serveDrink("Batman", 15, Drink.MOJITO);
    }
}