package org.example.model;

public class Visitor {
    private final int age;
    private final String request;
    private final int funds;

    public Visitor(int age, String request, int funds) {
        this.age = age;
        this.request = request;
        this.funds = funds;
    }

    public int getAge() {
        return age;
    }

    public String getRequest() {
        return request;
    }

    public int getFunds() {
        return funds;
    }
}
