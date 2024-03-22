package edu.ntudp.fit.krivlenya.lab4.controller;

import edu.ntudp.fit.krivlenya.lab4.model.Faculty;
import edu.ntudp.fit.krivlenya.lab4.model.Human;
import edu.ntudp.fit.krivlenya.lab4.model.University;

public class UniversityCreator{
    public University createUniversity(String name, Human head) {
        return new University(name, head);
    }

    public void addFacultyToUniversity(Faculty faculty, University university) {
        university.addFaculty(faculty);
    }


}
