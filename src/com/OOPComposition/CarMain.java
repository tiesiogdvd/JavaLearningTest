package com.OOPComposition;

import java.sql.SQLOutput;

public class CarMain {
    public static void main(String[] args) {
        //Engine engine = new Engine("N22A2", 6000)
       /*
        Car Volvo = new Car("Volvo V50", 2, "Blue", new Engine("N22A2", 6000));
        Engine engine = Volvo.getEngine();
        System.out.println(Volvo.getEngine().getRpm()); //hovering with ctrl gives info  || pressing then  ctrl + q gives detailed info
        */

       /* Car Honda = null;
        if(Honda!=null){
        Honda.getName();
    } else{
            System.out.println("The car was null");
        }
    }*/

        //final int a=5;
        //a = a+1;  Would give error  Element final does not let the instance to be changed, but the properties can be changed

        final Engine engine = new Engine("N22A2", 6000);
        //engine = new Engine ("AA", 200); Gives error
        engine.setRpm(5000);
        engine.getRpm();


    }
}
