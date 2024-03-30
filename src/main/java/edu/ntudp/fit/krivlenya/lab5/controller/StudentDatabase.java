package edu.ntudp.fit.krivlenya.lab5.controller;

import edu.ntudp.fit.krivlenya.lab5.model.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {
    private String url;
    private String user;
    private String password;

    public StudentDatabase(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public List<Student> getStudentsBornInMonth(int month) throws SQLException {
        List<Student> students = new ArrayList<>();
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM students WHERE MONTH(date_of_birth) = " + month;
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setSurname(resultSet.getString("surname"));
            student.setPatronymic(resultSet.getString("patronymic"));
            student.setDate_of_birth(resultSet.getDate("date_of_birth").toLocalDate());
            student.setStudents_record_book_number(resultSet.getInt("students_record_book_number"));
            students.add(student);
        }
        return students;
    }
}
