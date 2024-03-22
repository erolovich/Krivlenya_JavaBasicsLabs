package edu.ntudp.fit.krivlenya.lab4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University implements Ruleable {
    private final String name;
    private final Human rector;
    private final List<Faculty> faculties;

    public University(String name, Human rector) {
        this.name = name;
        this.rector = rector;
        this.faculties = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University that)) return false;
        return Objects.equals(name, that.name) && Objects.equals(rector, that.rector) && Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rector, faculties);
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
}
