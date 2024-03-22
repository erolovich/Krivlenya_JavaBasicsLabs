package edu.ntudp.fit.krivlenya.lab4.controller;

import edu.ntudp.fit.krivlenya.lab4.model.Department;
import edu.ntudp.fit.krivlenya.lab4.model.Faculty;
import edu.ntudp.fit.krivlenya.lab4.model.Group;
import edu.ntudp.fit.krivlenya.lab4.model.Human;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepartmentCreator that)) return false;
        return Objects.equals(facultyCreator, that.facultyCreator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facultyCreator);
    }
}
