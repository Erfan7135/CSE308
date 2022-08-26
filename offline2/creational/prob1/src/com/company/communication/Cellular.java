package com.company.communication;

public class Cellular implements Communication {

    String com_system="Cellular";

    public Cellular() {
    }

    @Override
    public String getCom_system() {
        return "Cellular";
    }

    @Override
    public float getCost() {
        return 100.0f;
    }

    @Override
    public void print() {
        System.out.println("Communication system: " + com_system+ ", Cost: " + getCost());
    }

}
