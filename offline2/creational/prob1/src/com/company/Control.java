package com.company;

public class Control {
    int number;

    public Control(int n){
        number = n;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void print(Float cost) {
        System.out.println("Number of DisplayUnit : "+number+", Cost : "+cost*number);
    }


}
