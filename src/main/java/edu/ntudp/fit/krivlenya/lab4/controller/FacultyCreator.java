package edu.ntudp.fit.krivlenya.lab4.controller;

import edu.ntudp.fit.krivlenya.lab4.model.Department;
import edu.ntudp.fit.krivlenya.lab4.model.Faculty;
import edu.ntudp.fit.krivlenya.lab4.model.Human;
import edu.ntudp.fit.krivlenya.lab4.model.University;

import java.util.Objects;


public class FacultyCreator{
    private final UniversityCreator universityCreator;

    public Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }

    public FacultyCreator(UniversityCreator universityCreator) {
        this.universityCreator = universityCreator;
    }

    public void addDepartmentToFaculty(Department department, Faculty faculty) {
        faculty.addDepartment(department);
    }

    public void addFacultyToUniversity(Faculty faculty, University university) {
        universityCreator.addFacultyToUniversity(faculty, university);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FacultyCreator that)) return false;
        return Objects.equals(universityCreator, that.universityCreator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(universityCreator);
    }
}
