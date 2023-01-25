package com.cinwell.domain;

public class Printer implements Equipment{
    private String name;
    private String type;

    public Printer() {
        super();
    }

    public Printer(String name, String type) {
        super();
        this.name = name;
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name + "(" + type +")";
    }
}
