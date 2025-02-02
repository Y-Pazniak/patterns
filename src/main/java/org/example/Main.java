package org.example;

public class Main {
    public static void main(String[] args) {
        DrinkService bar = new ProxyBartender();

        bar.serveDrink("Batman", 25, Drink.WHISKEY);
        bar.serveDrink("Superman", 30, Drink.MOJITO);
        bar.serveDrink("Eugene", 30, Drink.BEER);
        bar.serveDrink("King Karl the Third", 25, Drink.BEER);
        bar.serveDrink("Vova", 15, Drink.MOJITO);
    }
}