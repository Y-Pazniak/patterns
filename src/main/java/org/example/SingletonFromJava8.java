package org.example;

import java.util.function.Supplier;

public class SingletonFromJava8 { //very similar to variant with static class, but instead of basic tools we will use here lambdas
    private static class SingletonFromJava8Holder {
        static final Supplier<SingletonFromJava8> SINGLETON_FROM_JAVA_8_SUPPLIER = SingletonFromJava8::new;
    }

    public static SingletonFromJava8 getInstance() {
        return SingletonFromJava8Holder.SINGLETON_FROM_JAVA_8_SUPPLIER.get();
    }
}
