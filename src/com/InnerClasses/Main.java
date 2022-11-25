package com.InnerClasses;

public class Main {
    public static void main(String[] args) { // static here means that there can be only one instance of this method  in the whole application
        //TestClass a = new TestClass(25,'white');
        //a.setName("naaame"); //Setter for newly initialized class element a;
        TestClass.name = "name"; //you can assign values even without instantiating the object
        TestClass a = new TestClass(25,"white");
        System.out.println("Name: " + a.getName());
        TestClass b = new TestClass(30,"black");
        System.out.println("Name: " + b.getName()); //Prints out the same variable because name element in the class is static. Name does not belong to specific object, but the whole class

        a.setName("NameEdited");
        System.out.println("Name: " + b.getName()); //if you change a static element in one class object it will get changed for the others as well

        TestClass.print(); //Does not require an object to be initialized because the class function is static

    }
}
