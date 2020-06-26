package com.learn.java.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;

    static Comparator<Integer> integerComparator = (a, b) -> a.compareTo(b);

    public static void main(String[] args) {
        System.out.println(binaryOperator.apply(3, 4));

        System.out.println(BinaryOperator.maxBy(integerComparator).apply(4, 10));

        System.out.println(BinaryOperator.minBy(integerComparator).apply(4, 10));
    }
}
