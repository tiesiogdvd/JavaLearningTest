package com.JavaLearningOOPInheritance;

public class OOPBird extends OOPAnimal{

    private int wings;
    public OOPBird(String name, String color, int legs, boolean hasTail) {
        super(name, color, legs, hasTail);
    }

    public OOPBird(String name, String color, int legs, boolean hasTail, int wings) {
        super(name, color, legs, hasTail);
        this.wings = wings;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}
