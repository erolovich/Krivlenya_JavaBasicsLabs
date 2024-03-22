package edu.ntudp.fit.krivlenya.lab4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department implements Ruleable {
    private String name;
    private Human head;
    private List<Group> groups;

    public Department(String name, Human head) {
        this.name = name;
        this.head = head;
        this.groups = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department that)) return false;
        return Objects.equals(name, that.name) && Objects.equals(head, that.head) && Objects.equals(groups, that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, groups);
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public List<Group> getGroups() {
        return groups;
    }
}
