package edu.ntudp.fit.krivlenya.lab3.model;

public class Human {
    private String firstName;
    private String lastName;
    private String patronymic;
    private Sex sex;

    public enum Sex {
        MALE,
        FEMALE
    }

    public Human(String firstName, String lastName, String patronymic, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
        }
}
