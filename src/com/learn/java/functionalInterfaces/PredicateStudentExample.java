package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;

    static Predicate<Student> p2 = (student) -> student.getGpa() > 3.9;
    static List<Student> students = StudentDatabase.getAllStudents();

    public static void filterStudentByGradeLevel() {
        System.out.println("filterStudentByGradeLevel : ");
        students.forEach((student -> {
            if (p1.test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentByGrade() {
        System.out.println("filterStudentByGrade : ");
        students.forEach(student -> {
            if (p2.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudent() {
        System.out.println("filterStudent : ");
        students.forEach(student -> {
            if (p1.or(p2).negate().test(student)) {
                System.out.println(student);
            } else {
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGrade();
        filterStudent();
    }
}
