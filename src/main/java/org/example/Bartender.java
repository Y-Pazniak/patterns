package org.example;

import org.example.handler.AgeCheckHandler;
import org.example.handler.DrinkCheckHandler;
import org.example.handler.DrinkHandler;
import org.example.handler.FundsCheckerHandler;
import org.example.model.Visitor;

public class Bartender {
    private final DrinkHandler chain;

    public Bartender() {
        chain = DrinkHandler.buildChain(
                new AgeCheckHandler(),
                new DrinkCheckHandler(),
                new FundsCheckerHandler()
        );
    }

    public void processOrder(final Visitor visitor) {
        String result = chain.checkVisitor(visitor) ? "Order successful" : "Order failed";
        System.out.println(result);
    }
}
