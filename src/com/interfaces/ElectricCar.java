package com.interfaces;

public class ElectricCar implements CarInterface{

    public String name;

    public ElectricCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(this); //Will refer to this class
        System.out.println("Electricity flow started ");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() + " is moving at " + speed + "km/h");
    }
}
