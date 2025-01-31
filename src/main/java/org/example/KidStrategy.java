package org.example;

public class KidStrategy implements DrinkStrategy {
    public static final VisitorType VISITOR_TYPE = VisitorType.KID;
    @Override
    public String getDrink() {
        return "Milk";
    }
}
