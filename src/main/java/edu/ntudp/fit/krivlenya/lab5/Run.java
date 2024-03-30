package edu.ntudp.fit.krivlenya.lab5;

import edu.ntudp.fit.krivlenya.lab5.controller.StudentDatabase;
import edu.ntudp.fit.krivlenya.lab5.controller.StudentPrinter;
import edu.ntudp.fit.krivlenya.lab5.model.Student;

import java.sql.*;
import java.util.List;

public class Run {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/university";
        String user = "root";
        String password = "nikita123-20-2";

        StudentDatabase studentDatabase = new StudentDatabase(url, user, password);
        List<Student> studentsBornInJanuary = studentDatabase.getStudentsBornInMonth(5);
        System.out.println("Students born in May:");
        StudentPrinter.printStudents(studentsBornInJanuary);

        List<Student> studentsBornInFebruary = studentDatabase.getStudentsBornInMonth(2);
        System.out.println("\nStudents born in February:");
        StudentPrinter.printStudents(studentsBornInFebruary);

        List<Student> studentsBornInJune = studentDatabase.getStudentsBornInMonth(6);
        System.out.println("\nStudents born in June:");
        StudentPrinter.printStudents(studentsBornInJune);
    }
}
