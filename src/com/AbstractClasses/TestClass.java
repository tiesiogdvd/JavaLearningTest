package com.AbstractClasses;

public class TestClass extends TestAbstractClass{ // difference between interface and abstract class is instead of "implements", it uses "extends" ||  also you cannot extend to multiple abstract classes || also in abstract class you can have non abstract methods
    @Override
    public void printName(String name) {
        System.out.println(name);
    }
}
