package com.company;

import com.company.qms.QMS;
import com.company.qms.QMSBuilder;

public class Main {

    public static void main(String[] args) {
	// write your code here
        QMSBuilder builder= new QMSBuilder();
        QMS qms = builder.buildQMS("Delux","Application","Cellular",10);

        qms.print();
        qms.printCost();

        qms = builder.buildQMS("Poor","Application","Wifi",5);

        qms.print();
        qms.printCost();



    }
}
