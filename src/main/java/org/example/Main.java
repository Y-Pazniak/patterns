package org.example;

public class Main {
    public static void main(String[] args) {
        Cocktail whiteRus = new Cocktail.CocktailBuilder()
                .setBase("Vodka")
                .setSweetener("Coffee liquor")
                .setMixer("Cream")
                .setBeauty("Umbrella straw")
                .setIceCount(3)
                .build();
        System.out.println(whiteRus);

        Cocktail mojito = new Cocktail.CocktailBuilder().
                setBase("Rum").
                setMixer("Sprite").
                setBeauty("Mint").
                build();
        System.out.println(mojito);
    }
}