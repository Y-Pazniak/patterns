package org.example;

public class Main {
    public static final BartenderContext bartenderContext = new BartenderContext();

    public static void main(String[] args) {
        processDrink(VisitorType.FEMALE);
        processDrink(VisitorType.MALE);
        processDrink(VisitorType.KID);
        processDrink(VisitorType.DOG);
    }

    private static void processDrink(final VisitorType visitorType) {
        System.out.printf("For visitor's type %s bartender serves %s%n", visitorType, bartenderContext.getDrink(visitorType));
    }
}