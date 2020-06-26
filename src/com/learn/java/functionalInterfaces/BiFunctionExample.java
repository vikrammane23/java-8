package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = ((students, studentPredicate) -> {
        Map<String, Double> map = new HashMap<>();
        students.forEach(student -> {
            if (studentPredicate.test(student)) {
                map.put(student.getName(), student.getGpa());
            }
        });
        return map;
    });

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDatabase.getAllStudents(), PredicateStudentExample.p1));
    }
}
