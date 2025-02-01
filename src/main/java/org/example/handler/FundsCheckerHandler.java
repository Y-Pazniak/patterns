package org.example.handler;

import org.example.model.Visitor;

public class FundsCheckerHandler extends DrinkHandler {
    @Override
    public boolean checkVisitor(Visitor visitor) {
        if (visitor.getFunds() > 0) {
            System.out.println("Funds are OK");
            return super.processRequest(visitor);
        }
        System.out.println("Not enough funds");
        return false;
    }
}
