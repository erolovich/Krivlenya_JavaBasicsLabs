package edu.ntudp.fit.krivlenya.lab3.controller;

import edu.ntudp.fit.krivlenya.lab3.model.*;


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
}
