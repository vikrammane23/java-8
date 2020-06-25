package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c1 = (student) -> System.out.println(student.getName());
    static Consumer<Student> c2 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());

    public static void printName() {
        System.out.println("printName : ");
        List<Student> personList = StudentDatabase.getAllStudents();
        personList.forEach(c1);
    }

    public static void printNameAndActivities() {
        System.out.println("printNameAndActivities : ");
        List<Student> personList = StudentDatabase.getAllStudents();
        personList.forEach(c2.andThen(c3));
    }

    public static void printNameAndActivitiesUsingCondition() {
        System.out.println("printNameAndActivitiesUsingCondition : ");
        List<Student> personList = StudentDatabase.getAllStudents();
        personList.forEach((student) -> {
            if (student.getGender().equalsIgnoreCase("male")) {
                c2.andThen(c3).accept(student);
            }
        });
    }

    public static void main(String[] args) {

        Consumer<String> consumer = (s) -> {
            System.out.println(s.toUpperCase());
        };

        consumer.accept("Vikram");

        Consumer<Integer> consumer1 = (i) -> {
            System.out.println(i.floatValue());
        };

        consumer1.accept(1);

        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();

    }
}
