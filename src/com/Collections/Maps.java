package com.Collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> emailList = new HashMap<>(); // better to use this because making it like the line below will automatically add a lot of extra override code
        //Map<String, String> contacts = new Map<String, String>() {}

        emailList.put("Name","Name@gmail.com");  // To rename multiple instances of code at once, instead of refactor it is possible to use SHIFT - F6!!!!
        emailList.put("Brad","Brad@gmail.com");
        System.out.println(emailList.get("Name"));
        System.out.println(emailList.size());
        //emailList.remove("Brad");
        emailList.containsKey("Brad"); //returns a boolean value
        emailList.containsValue("Brad@gmail.com");


    }
}
