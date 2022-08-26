package com.company;

public class FontFactory {
    public static Font getFont(String fileName) {
        String[] ext = fileName.split("\\.", 2);
        String extention = ext[1];
        if (extention.equals("c")) {
            return new CourierNew(fileName);
        } else if (extention.equals("cpp")) {
            return new Monaco(fileName);
        } else if (extention.equals("py")) {
            return new Consolas(fileName);
        } else {
            return null;
        }
    }
}
