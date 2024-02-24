package edu.ntudp.fit.krivlenya.lab3.controller;

import edu.ntudp.fit.krivlenya.lab3.model.*;

public class UniversityCreator{
    public University createUniversity(String name, Human head) {
        return new University(name, head);
    }

    public void addFacultyToUniversity(Faculty faculty, University university) {
        university.addFaculty(faculty);
    }
}
