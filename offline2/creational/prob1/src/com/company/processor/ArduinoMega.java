package com.company.processor;

public class ArduinoMega implements Processor {
    @Override
    public float cost() {
        return 400.0f;
    }

    @Override
    public void print() {
        System.out.println("ArduinoMega processor, cost: " + cost());
    }
}

