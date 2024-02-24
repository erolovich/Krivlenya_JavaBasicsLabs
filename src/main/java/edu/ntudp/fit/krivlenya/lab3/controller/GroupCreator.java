package edu.ntudp.fit.krivlenya.lab3.controller;

import edu.ntudp.fit.krivlenya.lab3.model.*;

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
}
