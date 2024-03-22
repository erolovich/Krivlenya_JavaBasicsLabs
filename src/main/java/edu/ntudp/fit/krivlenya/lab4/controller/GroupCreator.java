package edu.ntudp.fit.krivlenya.lab4.controller;

import edu.ntudp.fit.krivlenya.lab4.model.Department;
import edu.ntudp.fit.krivlenya.lab4.model.Group;
import edu.ntudp.fit.krivlenya.lab4.model.Human;
import edu.ntudp.fit.krivlenya.lab4.model.Student;

import java.util.Objects;

public class GroupCreator{
    private final DepartmentCreator departmentCreator;
    public Group createGroup(String name, Human head) {
        return new Group(name, head);
    }

    public GroupCreator(DepartmentCreator departmentCreator) {
        this.departmentCreator = departmentCreator;
    }

    public void addGroupToDepartment(Group group, Department department) {
        departmentCreator.addGroupToDepartment(group, department);
    }

    public void addStudentToGroup(Student student, Group group) {
        group.addStudent(student);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroupCreator that)) return false;
        return Objects.equals(departmentCreator, that.departmentCreator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentCreator);
    }
}
