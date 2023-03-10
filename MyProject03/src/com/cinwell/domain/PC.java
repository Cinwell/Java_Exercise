package com.cinwell.domain;

public class PC implements Equipment{

    private String model;
    private String display;

    public String getModel() {
        return model;
    }

    public String getDisplay() {
        return display;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public PC() {
        super();
    }

    public PC(String model, String display) {
        super();
        this.model = model;
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display +")";
    }
}
