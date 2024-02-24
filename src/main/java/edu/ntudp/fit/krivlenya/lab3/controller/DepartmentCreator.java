package edu.ntudp.fit.krivlenya.lab3.controller;

import edu.ntudp.fit.krivlenya.lab3.model.*;

public class DepartmentCreator{

    private final FacultyCreator facultyCreator;
    public Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }

    public DepartmentCreator(FacultyCreator facultyCreator) {
        this.facultyCreator = facultyCreator;
    }
    public void addDepartmentToFaculty(Department department, Faculty faculty) {
        facultyCreator.addDepartmentToFaculty(department, faculty);
    }

    public void addGroupToDepartment(Group group, Department department) {
        department.addGroup(group);
    }
}
