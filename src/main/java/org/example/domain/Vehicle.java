package org.example.domain;

public class Vehicle {

    private String color;
    private String model;
    private String mark;
    private String registrationNumber;

    private int id;


    public Vehicle() {
    }


    public Vehicle(String color, String model, String mark, String registrationNumber, int id) {
        this.color = color;
        this.model = model;
        this.mark = mark;
        this.registrationNumber = registrationNumber;
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }





}
