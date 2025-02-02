package org.example;

import java.util.*;
import java.util.logging.Logger;

public class ProxyBartender implements DrinkService {
    private Bartender bartender;
    private static final Logger logger = Logger.getLogger(DrinkService.class.getName());

    @Override
    public void serveDrink(final String name, final int age, final Drink drink) {
        logger.info(String.format("Request for: name=%s, age=%s, drink=%s", name, age, drink));
        if (!isAdult(age)) {
            logger.warning("Request denied, too young: " + age);
            System.out.println("Sorry, " + name + " - too young :(");
            return;
        }

        if (bartender == null) {
            logger.info("Initializing bartender");
            bartender = new Bartender();
        }

        logger.info("Sending info to the main object");
        bartender.serveDrink(name, age, drink);
    }

    private boolean isAdult(final int age) {
        return age >= 18;
    }
}
