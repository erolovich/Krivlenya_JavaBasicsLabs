package edu.ntudp.fit.krivlenya.lab5.controller;

import edu.ntudp.fit.krivlenya.lab5.model.Student;


import java.util.List;

public class StudentPrinter {
    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.getId() + " | " +
                    student.getName() + " | " +
                    student.getSurname() + " | " +
                    student.getPatronymic() + " | " +
                    student.getDate_of_birth() + " | " +
                    student.getStudents_record_book_number());
        }
    }
}
