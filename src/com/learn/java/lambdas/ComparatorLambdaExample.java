package com.learn.java.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        /**
         * Prior Java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 -> o1=o2
                // 1 -> o1>o2
                // -1 -> o1<o2
            }
        };

        // Java 8
        // ()->{};
        System.out.println("Result of comparator prior to Java 8  : " + comparator.compare(10, 2));

        Comparator<Integer> lambdaComparator = (Integer x, Integer y) -> {
            return x.compareTo(y);
        };

        System.out.println("Result of comparator using lambda in java 8  : " + lambdaComparator.compare(10, 2));

        Comparator<Integer> lambdaComparator1 = (x, y) -> {
            return x.compareTo(y);
        };

        System.out.println("Result of comparator using lambda in java 8  : " + lambdaComparator1.compare(10, 2));
    }
}
