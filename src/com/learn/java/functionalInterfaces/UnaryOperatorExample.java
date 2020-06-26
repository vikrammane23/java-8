package com.learn.java.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> stringUnaryOperator = (a) -> a.concat(" Mane");

    public static void main(String[] args) {
        System.out.println(stringUnaryOperator.apply("Vikram"));
    }
}
