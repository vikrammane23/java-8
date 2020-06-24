package com.learn.java.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {

        /**
         * Prior Java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Run method 1");
            }
        };

        new Thread(runnable).start();

        // Java 8 Lambda
        // () -> {};
        Runnable lambdaRunnable = () -> {
            System.out.println("Inside Run method 2");
        };

        new Thread(lambdaRunnable).start();

    }
}
