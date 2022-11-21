package com.androidJavaLearning;

public class Hello {
    public static void main(String[] args) {   //Write psvm and tab || run appllication from green marks on the left
       /* System.out.println("haha"); // print and println difference is one prints a to a new line, other one does not TODO: test
        boolean a = true;
        System.out.println(a);

        float myFloat = (float) 4.5; // float stores smaller numbers
        System.out.println(myFloat);

        int aa = 5;
        do { //even if condition is not true, loops' code is executed at least once
            System.out.println("Hello");
        } while(aa<5);*/

        /*Scanner scanner = new Scanner(System.in); //allows users input like in c++ std::cin>>var;
        int answer = scanner.nextInt();
        System.out.println("answer = " + answer);

        Random random = new Random();
        int number = random.nextInt(20 + 1); //does not include the number 20 so +1 is added
        System.out.println(number);*/

        String name = "David";
        String name1 = "Davi";
        name1 += "d";
        System.out.println(name1);

        if (name == name1) {
            System.out.println(name + " is same as " + name1);
        } else {
            System.out.println(name + " is not same as " + name1);
        }

        if (name.equals(name1)) { //Best practice is to use .equals() because of cases like this
            System.out.println(name + " is same as " + name1);
        } else {
            System.out.println(name + " is not same as " + name1);
        }
    }
}
