package edu.ntudp.fit.krivlenya.lab4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty implements Ruleable {
    private final String name;
    private final Human dean;
    private final List<Department> departments;

    public Faculty(String name, Human dean) {
        this.name = name;
        this.dean = dean;
        this.departments = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty faculty)) return false;
        return Objects.equals(name, faculty.name) && Objects.equals(dean, faculty.dean) && Objects.equals(departments, faculty.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dean, departments);
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return dean;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

}
