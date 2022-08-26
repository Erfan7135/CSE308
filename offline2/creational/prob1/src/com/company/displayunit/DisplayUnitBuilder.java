package com.company.displayunit;

import com.company.display.LCD;
import com.company.display.LED;
import com.company.processor.ATMega32;
import com.company.processor.ArduinoMega;
import com.company.processor.RaspberryPi;

public class DisplayUnitBuilder {

    public static DisplayUnit Delux(){
        DisplayUnit displayUnit = new DisplayUnit();
        displayUnit.setName("Delux");
        displayUnit.setDisplay(new LCD());
        displayUnit.setProcessor(new RaspberryPi());
        return displayUnit;
    }

    public static DisplayUnit Optimal(){
        DisplayUnit displayUnit = new DisplayUnit();
        displayUnit.setName("Optimal");
        displayUnit.setDisplay(new LED());
        displayUnit.setProcessor(new ArduinoMega());
        return displayUnit;
    }

    public static DisplayUnit Poor(){
        DisplayUnit displayUnit = new DisplayUnit();
        displayUnit.setName("Poor");
        displayUnit.setDisplay(new LED());
        displayUnit.setProcessor(new ATMega32());
        return displayUnit;
    }



}
