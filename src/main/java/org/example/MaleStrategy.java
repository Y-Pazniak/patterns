package org.example;

public class MaleStrategy implements DrinkStrategy {
    public static final VisitorType VISITOR_TYPE = VisitorType.MALE;

    @Override
    public String getDrink() {
        return "Whiskey";
    }
}
