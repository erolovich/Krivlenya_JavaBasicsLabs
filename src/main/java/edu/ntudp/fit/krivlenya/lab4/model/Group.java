package edu.ntudp.fit.krivlenya.lab4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group implements Ruleable {
    private final String name;
    private final Human head;
    private final List<Student> students;

    public Group(String name, Human head) {
        this.name = name;
        this.head = head;
        this.students = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group group)) return false;
        return Objects.equals(name, group.name) && Objects.equals(head, group.head) && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, students);
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

