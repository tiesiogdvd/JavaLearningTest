package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {

        /*String [] names = {"asa", "asdasd", "asdasdasdasd"};
        System.out.println(names[2]);

        String[] newNames = new String[6];
        for (int i=0; i< names.length; i++){newNames[i]="name"+i;}
        for (int i=0; i< names.length; i++){
            System.out.println(newNames[i]);
        }*/

        ArrayList<String> names = new ArrayList<>();
        names.add("aababa");
        names.add("asdasd");
        names.add("basbsb");
        names.add("aaaaa");
        names.add("zzzzz");
        names.add("ccccc");
        System.out.println(names.get(0));
        System.out.println(names.size());
        //names.clear();
        //System.out.println(names.size());
        names.remove("aababa");
        System.out.println(names.get(0));
        //names.contains("asdasd"); // returns a boolean value if the ArrayList contains the item or not
        //names.isEmpty(); //returns boolean value if ArrayList is empty
        //names.indexOf(); //returns the index of an array element || if element does not exist returns -1
        //names.sort(); //for sorting

        ArrayList<ArrayStudent> students = new ArrayList<>();
        students.add(new ArrayStudent("asd", 6));
        students.add(new ArrayStudent("asdaaa", 68));

        for(ArrayStudent s: students){
            System.out.println(s.getName());

        }

    }


}
