package org.example.handler;

import org.example.model.Visitor;

public class AgeCheckHandler extends DrinkHandler {
    @Override
    public boolean checkVisitor(Visitor visitor) {
        if (visitor.getAge() >= 18) {
            System.out.println("Age is OK");
            return super.processRequest(visitor);
        }
        System.out.println("Too young: " + visitor.getAge());
        return false;
    }
}
