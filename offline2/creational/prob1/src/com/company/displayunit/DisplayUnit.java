package com.company.displayunit;

import com.company.display.Display;
import com.company.processor.Processor;

public class DisplayUnit {

    private static String name;

    private static Display display;
    private static Processor processor;

    public DisplayUnit(){
        display=null;
        processor=null;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setDisplay(Display display){
        this.display=display;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public float getCost() {
        float cost = 0.0f;
        cost += display.cost();
        cost += processor.cost();
        return cost;
    }

    public void print() {
        display.print();
        processor.print();
    }

    public String getName() {
        return name;
    }
}
