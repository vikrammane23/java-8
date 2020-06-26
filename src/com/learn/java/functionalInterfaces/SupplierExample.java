package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 9;

        System.out.println("Supplier is : " + supplier.get());

        Supplier<Student> studentSupplier = () -> new Student("Adam", 2, 3.6, "male", 10, Arrays.asList("swimming", "basketball", "volleyball"));

        Supplier<List<Student>> listSupplier = () -> StudentDatabase.getAllStudents();

        System.out.println("Supplier of Student is : " + studentSupplier.get());

        System.out.println("Supplier of Students is : " + listSupplier.get());

    }
}
