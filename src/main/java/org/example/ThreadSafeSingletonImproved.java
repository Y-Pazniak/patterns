package org.example;

public class ThreadSafeSingletonImproved { //also can be named as a double-check locking singleton - recommended simple version for using in multi-thread applications
    private static volatile ThreadSafeSingletonImproved threadSafeSingletonImproved; //need volatile here to be sure about last changes

    private ThreadSafeSingletonImproved() {
    } //private constructor makes impossible to create object

    public static ThreadSafeSingletonImproved getInstance() {
        if (threadSafeSingletonImproved == null) { //first checking for optimization - no need to synchronize checking if object is not null
            synchronized (ThreadSafeSingletonImproved.class) { //if singleton is null we need to synchronize this code
                if (threadSafeSingletonImproved == null) { //second checking is IMPORTANT: we are checking here is our singleton still null or another thread created an object before the current
                    threadSafeSingletonImproved = new ThreadSafeSingletonImproved();
                }
            }
        }
        return threadSafeSingletonImproved;
    }
}
