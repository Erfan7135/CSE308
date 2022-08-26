package com.company.processor;

public class ATMega32 implements Processor {
    @Override
    public float cost() {
        return 250.0f;
    }

    @Override
    public void print() {
        System.out.println("ATMega32 processor, cost: " + cost());
    }
}

