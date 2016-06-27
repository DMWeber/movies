package com.kreait.Entity;

public class Person {
    private String name;

    private Profession role;

    public String getName() {
        return name;
    }

    public Profession getRole() {
        return role;
    }

    public enum Profession {
        Director, Actor, Producer
    }
}
