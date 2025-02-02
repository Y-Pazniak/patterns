package org.example;

import org.example.strategy.DrinkStrategy;
import org.example.strategy.FemaleStrategy;
import org.example.strategy.KidStrategy;
import org.example.strategy.MaleStrategy;

import java.util.EnumMap;
import java.util.Map;

public class Main {
    private static BartenderContext bartenderContext;
    private static Map<VisitorType, DrinkStrategy> strategyMap;


    public static void main(String[] args) {
        initMap(strategyMap);
        processDrink(VisitorType.FEMALE);
        processDrink(VisitorType.MALE);
        processDrink(VisitorType.KID);
        processDrink(VisitorType.DOG);
    }

    private static void initMap(final Map<VisitorType, DrinkStrategy> enumMap) {
        if (enumMap == null) {
            strategyMap = new EnumMap<>(VisitorType.class);
        }
        strategyMap.put(FemaleStrategy.VISITOR_TYPE, new FemaleStrategy());
        strategyMap.put(MaleStrategy.VISITOR_TYPE, new MaleStrategy());
        strategyMap.put(KidStrategy.VISITOR_TYPE, new KidStrategy());
    }

    private static void processDrink(final VisitorType visitorType) {
        initStrategy(visitorType);
        System.out.printf("For visitor's type %s bartender serves %s%n", visitorType, bartenderContext.getDrink());
    }

    private static void initStrategy(final VisitorType visitorType) {
        DrinkStrategy strategy = strategyMap.get(visitorType);
        if (strategy == null) {
            throw new IllegalArgumentException("strategy does not exist for: " + visitorType);
        }
        if (bartenderContext == null) {
            bartenderContext = new BartenderContext(strategyMap.get(visitorType));
        } else {
            bartenderContext.setStrategy(strategy);
        }
    }
}