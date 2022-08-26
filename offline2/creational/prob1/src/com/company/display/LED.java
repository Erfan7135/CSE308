package com.company.display;

public class LED implements Display {
    public void display() {
        //System.out.println("LED");
    }

    @Override
    public float cost() {
        return 100.0f;
    }

    @Override
    public void print() {
        System.out.println("LED display, cost: " + cost());
    }
}

