package edu.ntudp.fit.krivlenya.lab4.model;

import java.util.Objects;

public class Human {
    private final String firstName;
    private final String lastName;
    private final String patronymic;
    private final Sex sex;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return Objects.equals(firstName, human.firstName) && Objects.equals(lastName, human.lastName) && Objects.equals(patronymic, human.patronymic) && sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, patronymic, sex);
    }
}
