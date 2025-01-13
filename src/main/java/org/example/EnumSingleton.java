package org.example;

public enum EnumSingleton {
    ENUM_SINGLETON; //new variant for me - author says, it is the simplest and the safest variant of singleton creating: lazy, thread-safe, serialization-safe, reflection-safe

    public void doingBusiness() {
        //all singleton logic is here
    }
}
