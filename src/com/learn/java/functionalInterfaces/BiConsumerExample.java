package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (x, y) -> System.out.println("x : " + x + " and y : " + y);
        biConsumer.accept("Vikram", "Mane");
        printNameAndActivities();

    }

    public static void printNameAndActivities() {
        List<Student> students = StudentDatabase.getAllStudents();
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println("Name : " + name + " and Activities : " + activities);
        students.forEach(student -> {
            biConsumer.accept(student.getName(), student.getActivities());
        });
    }
}
