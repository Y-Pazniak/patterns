package org.example;

public class FemaleStrategy implements DrinkStrategy{
    public static final VisitorType VISITOR_TYPE = VisitorType.FEMALE;
    @Override
    public String getDrink() {
        return "Mojito";
    }
}
