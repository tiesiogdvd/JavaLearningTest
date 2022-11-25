package com.interfaces;

public class main {
    public static void main(String[] args) {
        //CarInterface carInterface = new CarInterface() {} // will create override code
        CarInterface carInterface = new ElectricCar("Tesla"); //This way a class is assigned to an interface and no override code is created
        carInterface.start();
        carInterface.move(60);

        CarInterface fossilCarInterface = new FossilFuelCar("Honda");
        fossilCarInterface.start();
        fossilCarInterface.move(100);
    }
}
