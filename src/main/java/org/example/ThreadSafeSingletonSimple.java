package org.example;

public class ThreadSafeSingletonSimple { //allows lazy loading and thread-safe, but not optimal variant
    private static ThreadSafeSingletonSimple threadSafeSingleton;

    private ThreadSafeSingletonSimple() { //private constructor makes impossible to create an object from an outside
    }

    public static synchronized ThreadSafeSingletonSimple getInstance() { //the same as the simpliest, just with locking creation method to avoid creation more than one singleton in different threads
        if (threadSafeSingleton == null) {
            threadSafeSingleton = new ThreadSafeSingletonSimple();
        }
        return threadSafeSingleton;
    }
}
