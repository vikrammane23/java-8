package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> function = (students) -> {
        Map<String, Double> map = new HashMap<>();
        students.forEach(student -> {
            if (PredicateStudentExample.p2.test(student))
                map.put(student.getName(), student.getGpa());
        });

        return map;
    };

    public static void main(String[] args) {
        System.out.println(function.apply(StudentDatabase.getAllStudents()));
    }
}
