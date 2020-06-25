package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;

    Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;

    BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println("Name : " + name + " and Activities : " + activities);

    Consumer<Student> consumer = student -> {
        if (p1.and(p2).test(student)) {
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    Consumer<Student> consumer1 = student -> {
        if (p1.or(p2).test(student)) {
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public void printNameAndActivities(List<Student> studentList) {
        studentList.forEach(consumer);
        studentList.forEach(consumer1);
    }

    public static void main(String[] args) {
        List<Student> students = StudentDatabase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(students);
    }
}
