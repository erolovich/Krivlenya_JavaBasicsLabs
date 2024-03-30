package edu.ntudp.fit.krivlenya.lab5.model;

import java.time.LocalDate;

public class Student {
    private int id;
    private String Name;
    private String surname;
    private String patronymic;
    private LocalDate date_of_birth;
    private int students_record_book_number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public int getStudents_record_book_number() {
        return students_record_book_number;
    }

    public void setStudents_record_book_number(int students_record_book_number) {
        this.students_record_book_number = students_record_book_number;
    }
}
