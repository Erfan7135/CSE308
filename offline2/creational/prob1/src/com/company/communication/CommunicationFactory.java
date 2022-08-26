package com.company.communication;

public class CommunicationFactory {

        public static Communication getCommunication(String communication) {
            if(communication.equals("Cellular")) {
                return new Cellular();
            }
            else if(communication.equals("Wifi")) {
                return new Wifi();
            }
            else {
                return null;
            }
        }
}
