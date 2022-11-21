package com.androidJavaLearning;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the game of guessing the number");
        System.out.println("Please enter your name:");

        String name = scanner.next();
        System.out.println("Welcome " + name);

        int number = 1 + random.nextInt(10);
        System.out.println("I have generated a number from 1 to 10, please try guessing it.");

        for(int i=0; i<5; i++){

            System.out.println("You have " + (5-i) + " tries left.");
            int guess = scanner.nextInt();
            if(guess > 10 || guess < 0) {System.out.println("The number you selected is out of range from 1-10");
            } else if (guess != number){
                if(i==4){System.out.println("You have run out of tries. The number was " + number); return;}
                if(guess<number){System.out.println("The number should be larger");}
                if(guess>number){System.out.println("The number should be smaller");}
            } else {System.out.println("The number " + guess + " is correct. You have guessed it in " + (i+1) + " tries"); return;}

        }
    }
}
