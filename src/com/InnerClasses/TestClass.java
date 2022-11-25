package com.InnerClasses;



public class TestClass {
    public static String name;  //static means the element belongs to this whole class, any created object of this class will share the variable with other objects
    public int age;
    public String skinColor;

    public TestClass(int age, String skinColor) {
        this.age = age;
        this.skinColor = skinColor;
    }

    public void printSomething(){}

    public static void print(){  //Does not require an object to be initialized because the class function is static
        System.out.println("Printing....");
        //printSomething(); // Problem occurs when there is a need to call other class elements which are not static
        //System.out.println(age); Does not work either because element belongs to specific objects and not whole class
    }


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        TestClass.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
}
