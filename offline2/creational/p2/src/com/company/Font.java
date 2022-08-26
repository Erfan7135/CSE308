package com.company;

public abstract class Font {

    public Font(String filename) {
        font(filename);
    }

    public abstract void font(String filename);
}

class CourierNew extends Font{
    public CourierNew(String fileName) {
        super(fileName);
    }

    @Override
    public void font(String filename) {
        System.out.println("Editors font : Courier New");
    }
}

class Monaco extends Font{
    public Monaco(String fileName) {
        super(fileName);
    }

    @Override
    public void font(String filename) {
        System.out.println("Editors font : Monaco");
    }
}

class Consolas extends Font{
    public Consolas(String fileName) {
        super(fileName);
    }

    @Override
    public void font(String filename) {
        System.out.println("Editors font : Consolas");
    }
}
