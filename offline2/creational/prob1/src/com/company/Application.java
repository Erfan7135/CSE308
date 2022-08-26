package com.company;

public class Application {
    private String app_name;

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public Application(String app_name) {
        this.app_name = app_name;
    }

    public float getCost() {
        return 100.0f;
    }

    public void print() {
        System.out.println("Application name: " + app_name+ ", Cost: " + getCost());
    }
}
