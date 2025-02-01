package org.example.handler;

import org.example.model.Visitor;

public abstract class DrinkHandler {
    private DrinkHandler nextHandler;

    public static DrinkHandler buildChain(final DrinkHandler first, DrinkHandler... handlers) {
        DrinkHandler head = first;
        for (DrinkHandler drinkHandler : handlers) {
            head.nextHandler = drinkHandler;
            head = drinkHandler;
        }
        return first;
    }

    public abstract boolean checkVisitor(final Visitor visitor);

    protected boolean processRequest(final Visitor visitor) {
        if (nextHandler == null) {
            return true;
        }
        return nextHandler.checkVisitor(visitor);
    }


}
