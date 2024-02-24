package edu.ntudp.fit.krivlenya.lab3.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty implements Ruleable {
    private String name;
    private Human dean;
    private List<Department> departments;

    public Faculty(String name, Human dean) {
        this.name = name;
        this.dean = dean;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHead() {
        return dean;
    }

    public void setHead(Human dean) {
        this.dean = dean;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
