package com.company.qms;

import com.company.Application;
import com.company.Control;
import com.company.communication.Communication;
import com.company.displayunit.DisplayUnit;

public class QMS {

    private DisplayUnit displayUnit;
    private Application application;
    private Communication communication;
    private Control control;

    public QMS() {
        displayUnit = null;
    }

    public void setDisplayUnit(DisplayUnit displayUnit) {
        this.displayUnit = displayUnit;
    }

    public void setApplication(Application application) {
       this.application = application;
    }

    public void setCommunication(Communication communication) {
        this.communication = communication;
    }

    public void setControl(Control control) {
        this.control = control;
    }


    public float getCost() {
        float cost = 0.0f;
        cost += displayUnit.getCost()*control.getNumber();
        cost += application.getCost();
        cost += communication.getCost();
        return cost;
    }

    public void printCost() {
        System.out.println("Total Cost: " + getCost());
        System.out.println("-----------------------------------------------------");
    }

    public void print() {
        System.out.println("DisplayUnit : " + displayUnit.getName()+", Cost : "+displayUnit.getCost());
        displayUnit.print();
        application.print();
        communication.print();
        control.print(displayUnit.getCost());

    }
}
