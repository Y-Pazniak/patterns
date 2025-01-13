package org.example;

public class ClassLoadingSingleton {
    private static final ClassLoadingSingleton classLoadingSingleton = new ClassLoadingSingleton(); //it is thread-safe, but does not allow lazy initialization

    private ClassLoadingSingleton() {
    }

    public static ClassLoadingSingleton getInstance() {
        return classLoadingSingleton;
    }
}
