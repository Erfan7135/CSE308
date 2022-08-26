package com.company.communication;

public class Wifi implements Communication{

        String com_system = "Wifi";

        public Wifi() {
        }

        @Override
        public String getCom_system() {
            return com_system;
        }

        @Override
        public float getCost() {
            return 200.0f;
        }

        @Override
        public void print() {
            System.out.println("Communication system: " + com_system+ ", Cost: " + getCost());
        }
}
