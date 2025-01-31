package org.example;

import java.util.HashMap;
import java.util.Map;

public class BartenderContext {
    private final Map<VisitorType, DrinkStrategy> strategyMap;

    public BartenderContext() {
        strategyMap = new HashMap<>();
        strategyMap.put(FemaleStrategy.VISITOR_TYPE, new FemaleStrategy());
        strategyMap.put(MaleStrategy.VISITOR_TYPE, new MaleStrategy());
        strategyMap.put(KidStrategy.VISITOR_TYPE, new KidStrategy());
    }

    public String getDrink(final VisitorType visitorType){
        DrinkStrategy strategy = strategyMap.get(visitorType);
        return strategy == null ? "unknown visitor's type" : strategy.getDrink();
    }
}
