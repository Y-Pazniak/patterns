package org.example.handler;

import org.example.model.Drink;
import org.example.model.Visitor;

public class DrinkCheckHandler extends DrinkHandler {
    @Override
    public boolean checkVisitor(Visitor visitor) {
        if (Drink.drinks.contains(visitor.getRequest())) {
            System.out.println("We serve this drink");

            return super.processRequest(visitor);
        }
        System.out.println("No such drink: " + visitor.getRequest());
        return false;
    }
}
