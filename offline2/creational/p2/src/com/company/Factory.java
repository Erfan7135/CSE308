package com.company;

public class Factory {
    public static Parser getParser(String fileName) {
        String[] ext= fileName.split("\\.", 2);
        String extention = ext[1];
        if (extention.equals("c")) {
            return new cParser(fileName);
        } else if (extention.equals("cpp")) {
            return new cppParser(fileName);
        } else if (extention.equals("py")) {
            return new pythonParser(fileName);
        } else {
            return null;
        }
    }
}
