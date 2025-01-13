package org.example;

public class StaticInnerClassSingleton { //lazy and safe singleton realization - recommends to use
    private StaticInnerClassSingleton() { //impossible to create singleton
    }

    public static StaticInnerClassSingleton getInstance() { //access to singleton object
        return TheBestSingletonHolder.THE_BEST_SINGLETON_INSTANCE;
    }

    private static class TheBestSingletonHolder { //thread safe lazy initialization singleton into a private class
        private static final StaticInnerClassSingleton THE_BEST_SINGLETON_INSTANCE = new StaticInnerClassSingleton();
    }
}
