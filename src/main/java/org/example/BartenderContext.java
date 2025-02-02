package org.example;

import org.example.strategy.DrinkStrategy;

public class BartenderContext {
    private DrinkStrategy drinkStrategy;

    public BartenderContext(final DrinkStrategy drinkStrategy) {
        this.drinkStrategy = drinkStrategy;
    }

    public void setStrategy(final DrinkStrategy drinkStrategy) {
        if (drinkStrategy != null) {
            this.drinkStrategy = drinkStrategy;
        }
    }

    public String getDrink(){
        return drinkStrategy.getDrink();
    }
}
