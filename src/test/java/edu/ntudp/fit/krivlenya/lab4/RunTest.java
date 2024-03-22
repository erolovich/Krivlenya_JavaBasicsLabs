package edu.ntudp.fit.krivlenya.lab4;

import edu.ntudp.fit.krivlenya.lab4.controller.*;
import edu.ntudp.fit.krivlenya.lab4.model.*;
import org.junit.Test;


import static org.junit.Assert.*;

public class RunTest {

    @Test
    public void main(){
        UniversityCreator createUniversity = new UniversityCreator();


        University oldUniversity = createUniversity.createUniversity("oldUniversity",
                new Human("Yosyfata", "Nikitchenko", "Yosyfivna", Human.Sex.FEMALE));



        FacultyCreator facultyCreator = new FacultyCreator(createUniversity);


        Faculty faculty1 = facultyCreator.createFaculty("Faculty of Science",
                new Human("Cheslava", "Evetska", "Konstantinivna", Human.Sex.FEMALE));
        facultyCreator.addFacultyToUniversity(faculty1, oldUniversity);

        Faculty faculty2 = facultyCreator.createFaculty("Faculty of Information Technology",
                new Human("Mykyta", "Leskiv", "Yukhymovych", Human.Sex.MALE));
        facultyCreator.addFacultyToUniversity(faculty2, oldUniversity);




        DepartmentCreator departmentCreator = new DepartmentCreator(facultyCreator);


        Department department1 = departmentCreator.createDepartment("Department of Physics",
                new Human("Shchedra", "Ulytska", "Davydivna", Human.Sex.FEMALE));
        departmentCreator.addDepartmentToFaculty(department1, faculty1);

        Department department2 = departmentCreator.createDepartment("Department of Chemistry",
                new Human("Maria", "Podshyvaylo", "Adamivna", Human.Sex.FEMALE));
        departmentCreator.addDepartmentToFaculty(department2, faculty1);

        Department department3 = departmentCreator.createDepartment("Department of Information Technology and Computer Engineering",
                new Human("Varvara", "Anishchenko", "Cheslavivna", Human.Sex.FEMALE));
        departmentCreator.addDepartmentToFaculty(department3, faculty2);

        Department department4 = departmentCreator.createDepartment("Department of Information Technology and Computer Engineering",
                new Human("Nfirst", "Lfirst", "Pfirst", Human.Sex.FEMALE));
        departmentCreator.addDepartmentToFaculty(department4, faculty2);




        GroupCreator groupCreator = new GroupCreator(departmentCreator);


        Group group1 = groupCreator.createGroup("Physics Group",
                new Human("Chestyslav", "Radchuk", "Zhdanovych", Human.Sex.MALE));
        groupCreator.addGroupToDepartment(group1, department1);

        Group group2 = groupCreator.createGroup("Chemistry Group",
                new Human("Boleslava", "Ostrozka", "Ustymivna", Human.Sex.FEMALE));
        groupCreator.addGroupToDepartment(group2, department1);

        Group group3 = groupCreator.createGroup("Computer engineering Group",
                new Human("Yevheniia", "Paley", "Nikodymivna", Human.Sex.FEMALE));
        groupCreator.addGroupToDepartment(group3, department2);

        Group group4 = groupCreator.createGroup("Physics Group",
                new Human("Nfirst", "Lfirst", "Pfirst", Human.Sex.MALE));
        groupCreator.addGroupToDepartment(group4, department2);

        Group group5 = groupCreator.createGroup("Chemistry Group",
                new Human("Nfirst", "Lfirst", "Pfirst", Human.Sex.FEMALE));
        groupCreator.addGroupToDepartment(group5, department3);

        Group group6 = groupCreator.createGroup("Computer engineering Group",
                new Human("Nfirst", "Lfirst", "Pfirst", Human.Sex.FEMALE));
        groupCreator.addGroupToDepartment(group6, department3);

        Group group7 = groupCreator.createGroup("Chemistry Group",
                new Human("Nfirst", "Lfirst", "Pfirst", Human.Sex.FEMALE));
        groupCreator.addGroupToDepartment(group7, department4);

        Group group8 = groupCreator.createGroup("Computer engineering Group",
                new Human("Nfirst", "Lfirst", "Pfirst", Human.Sex.FEMALE));
        groupCreator.addGroupToDepartment(group8, department4);




        Student student1 = new Student("Nikita", "Krivlenya", "Yuriyovich", Human.Sex.MALE);
        groupCreator.addStudentToGroup(student1, group1);

        Student student2 = new Student("Zhanna", "Storozh", "Ihorivna", Human.Sex.FEMALE);
        groupCreator.addStudentToGroup(student2, group1);

        Student student3 = new Student("Josef", "Zhuravel", "Olegovich", Human.Sex.MALE);
        groupCreator.addStudentToGroup(student3, group2);

        Student student4 = new Student("Nfirst", "Lfirst", "Pfirst", Human.Sex.MALE);
        groupCreator.addStudentToGroup(student4, group2);

        Student student5 = new Student("Nfirst", "Lfirst", "Pfirst", Human.Sex.FEMALE);
        groupCreator.addStudentToGroup(student5, group3);

        Student student6 = new Student("Nfirst", "Lfirst", "Pfirst", Human.Sex.MALE);
        groupCreator.addStudentToGroup(student6, group3);

        Student student7 = new Student("Nfirst", "Lfirst", "Pfirst", Human.Sex.MALE);
        groupCreator.addStudentToGroup(student7, group4);

        Student student8 = new Student("Nfirst", "Lfirst", "Pfirst", Human.Sex.FEMALE);
        groupCreator.addStudentToGroup(student8, group4);

        Student student9 = new Student("Nfirst", "Lfirst", "Pfirst", Human.Sex.MALE);
        groupCreator.addStudentToGroup(student9, group5);

        Student student10 = new Student("Nfirst", "Lfirst", "Pfirst", Human.Sex.MALE);
        groupCreator.addStudentToGroup(student10, group5);

        Student student11 = new Student("Nfirst", "Lfirst", "Pfirst", Human.Sex.FEMALE);
        groupCreator.addStudentToGroup(student11, group6);

        Student student12 = new Student("Nfirst", "Lfirst", "Pfirst", Human.Sex.MALE);
        groupCreator.addStudentToGroup(student12, group6);

        Student student13 = new Student("Nfirst", "Lfirst", "Pfirst", Human.Sex.MALE);
        groupCreator.addStudentToGroup(student13, group7);

        Student student14 = new Student("Nfirst", "Lfirst", "Pfirst", Human.Sex.FEMALE);
        groupCreator.addStudentToGroup(student14, group7);

        Student student15 = new Student("Nfirst", "Lfirst", "Pfirst", Human.Sex.MALE);
        groupCreator.addStudentToGroup(student15, group8);

        Student student16 = new Student("Nfirst", "Lfirst", "Pfirst", Human.Sex.MALE);
        groupCreator.addStudentToGroup(student16, group8);

        String jsonUniversity = JsonManager.universityToJson(oldUniversity);

        University newUniversity = JsonManager.jsonToUniversity(jsonUniversity);

        assertEquals(oldUniversity, newUniversity);

    }
}