package com.company.display;

public class LCD implements Display {
    @Override
    public float cost() {
        return 200.0f;
    }

    @Override
    public void print() {
        System.out.println("LCD display, cost: " + cost());
    }
}

