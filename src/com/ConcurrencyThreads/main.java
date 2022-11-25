package com.ConcurrencyThreads;

public class main {
    public static void main(String[] args) {
        /*Thread thread = new Thread(new Runnable() {


            @Override
            public void run() {
                for(int i=0; i<5; i++){
                    System.out.println("Printing " + i + "in a worker thread");
                    try {
                        Thread.sleep(1000); //makes the thread wait 1 second
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });


        thread.start();
        for(int i=0; i<5; i++){
            System.out.println("Printing " + i + "in a main thread");
            try {
                Thread.sleep(1000); //makes the thread wait 1 second
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }*/

        int a = 2;
        int b = 0;
        String name = null;

        try{
            name.equals("aaaa");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Name was null");
        }


        try {
            System.out.println(a / b); //ArithmeticException
        }catch(Exception e){ //Exception accepts all exceptions whereas ArithmeticException and other catch specific cases
            System.out.println("b was zero");
        } //instead of application crashing it throws an exception
    }
}
