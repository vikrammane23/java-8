package com.learn.java.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> stringFunction = (name) -> name.toUpperCase();

    static Function<String, String> andThenFunction = (name) -> name.toLowerCase().concat(" Mane");

    public static void main(String[] args) {
        System.out.println("Result of function is : " + stringFunction.apply("Vikram"));

        System.out.println("Result of function is : " + stringFunction.andThen(andThenFunction).apply("Vikram"));

        System.out.println("Result of function is : " + stringFunction.compose(andThenFunction).apply("Vikram"));
    }
}
