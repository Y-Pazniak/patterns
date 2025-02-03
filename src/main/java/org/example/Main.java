package org.example;

import org.example.decorator.BillDecorator;
import org.example.decorator.IceDecorator;
import org.example.decorator.UmbrellaDecorator;
import org.example.service.Cocktail;
import org.example.service.Drink;

public class Main {
    public static void main(String[] args) {
        Drink basicCocktail = new Cocktail();
        System.out.println(basicCocktail.serve() + "...$" + basicCocktail.getPrice());

        Drink withIce = new IceDecorator(new Cocktail());
        System.out.println(withIce.serve() + "...$" + withIce.getPrice());

        Drink ultimateDrink = new BillDecorator(new UmbrellaDecorator(new IceDecorator(new Cocktail())));
        System.out.println(ultimateDrink.serve() + "...$" + ultimateDrink.getPrice());
    }
}