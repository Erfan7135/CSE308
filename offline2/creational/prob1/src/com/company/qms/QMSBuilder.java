package com.company.qms;

import com.company.Application;
import com.company.Control;
import com.company.communication.CommunicationFactory;
import com.company.displayunit.DisplayFactory;

public class QMSBuilder {

    public QMS buildQMS(String type,String application,String communication,int control) {
        QMS qms = new QMS();

        qms.setDisplayUnit(DisplayFactory.getDisplayUnit(type));
        qms.setApplication(new Application(application));
        qms.setCommunication(CommunicationFactory.getCommunication(communication));
        qms.setControl(new Control(control));

        System.out.println("A QMS is built.");

        return qms;
    }
}
