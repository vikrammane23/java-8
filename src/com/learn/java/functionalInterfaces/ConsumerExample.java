package com.learn.java.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> consumer = (s) -> {
            System.out.println(s.toUpperCase());
        };

        consumer.accept("Vikram");

        Consumer<Integer> consumer1 = (i) -> {
            System.out.println(i.floatValue());
        };

        consumer1.accept(1);
    }
}
