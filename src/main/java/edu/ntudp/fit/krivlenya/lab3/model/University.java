package edu.ntudp.fit.krivlenya.lab3.model;

import java.util.ArrayList;
import java.util.List;
public class University implements Ruleable {
    private String name;
    private Human rector;
    private List<Faculty> faculties;

    public University(String name, Human rector) {
        this.name = name;
        this.rector = rector;
        this.faculties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return rector;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
}
