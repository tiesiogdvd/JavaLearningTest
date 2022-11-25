package com.InnerClasses;

public class TestClass1 {

    private int age;
    private String color;

    private class TestInnerClass{ //possible to make it private and static which is not possible with the parent class
        private String name;

        public TestInnerClass(String name) {
            this.name = name;
        }

        private void printAge(){
            System.out.println("Age: " + age); //Outer class elements can be accessed by inner class
        }

    }
}
