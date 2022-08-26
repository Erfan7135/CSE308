package com.company.processor;

public class RaspberryPi implements Processor {
    @Override
    public float cost() {
        return 600.0f;
    }

    @Override
    public void print() {
        System.out.println("RaspberryPi processor, cost: " + cost());
    }
}

