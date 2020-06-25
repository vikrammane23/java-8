package com.learn.java.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p1 = (x) -> (x > 10);
    static Predicate<Integer> p2 = (x) -> (x % 2 == 0);
    static Predicate<String> p3 = Predicate.isEqual("vikram");

    public static void predicateAnd() {
        System.out.println("Result of Predicate And is : " + p1.and(p2).test(10));
    }

    public static void predicateOr() {
        System.out.println("Result of Predicate Or is : " + p1.or(p2).test(10));
    }

    public static void predicateNegate() {
        System.out.println("Result of Predicate Negate is : " + p1.and(p2).negate().test(10));
    }

    public static void predicateEqual() {
        System.out.println("Result of Predicate Equal is : " + p3.test("vikram"));
    }

    public static void main(String[] args) {
        System.out.println("Result of Predicate is : " + p1.test(5));
        predicateAnd();
        predicateOr();
        predicateNegate();
        predicateEqual();
    }
}
