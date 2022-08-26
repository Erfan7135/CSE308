package com.company.displayunit;

public class DisplayFactory {

    public static DisplayUnit getDisplayUnit(String type) {
        DisplayUnit displayUnit = null;
        if (type.equals("Delux")) {
            return DisplayUnitBuilder.Delux();
        } else if (type.equals("Optimal")) {
            return DisplayUnitBuilder.Optimal();
        } else if (type.equals("Poor")) {
            return DisplayUnitBuilder.Poor();
        }
        return displayUnit;
    }
}
