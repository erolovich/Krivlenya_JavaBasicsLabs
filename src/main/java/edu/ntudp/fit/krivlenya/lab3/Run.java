package edu.ntudp.fit.krivlenya.lab3;

import edu.ntudp.fit.krivlenya.lab3.controller.*;
import edu.ntudp.fit.krivlenya.lab3.model.*;

abstract public class Run {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();


        University university = universityCreator.createUniversity("University",
                new Human("Yosyfata", "Nikitchenko", "Yosyfivna", Human.Sex.FEMALE));




        FacultyCreator facultyCreator = new FacultyCreator(universityCreator);


        Faculty faculty1 = facultyCreator.createFaculty("Faculty of Science",
                new Human("Cheslava", "Evetska", "Konstantinivna", Human.Sex.FEMALE));
        facultyCreator.addFacultyToUniversity(faculty1, university);

        Faculty faculty2 = facultyCreator.createFaculty("Faculty of Information Technology",
                new Human("Mykyta", "Leskiv", "Yukhymovych", Human.Sex.MALE));
        facultyCreator.addFacultyToUniversity(faculty2, university);




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




        GroupCreator groupCreator = new GroupCreator(departmentCreator);


        Group group1 = groupCreator.createGroup("Physics Group",
                new Human("Chestyslav", "Radchuk", "Zhdanovych", Human.Sex.MALE));
        groupCreator.addGroupToDepartment(group1, department1);

        Group group2 = groupCreator.createGroup("Chemistry Group",
                new Human("Boleslava", "Ostrozka", "Ustymivna", Human.Sex.FEMALE));
        groupCreator.addGroupToDepartment(group2, department2);

        Group group3 = groupCreator.createGroup("Computer engineering Group",
                new Human("Yevheniia", "Paley", "Nikodymivna", Human.Sex.FEMALE));
        groupCreator.addGroupToDepartment(group3, department3);




        Student student1 = new Student("Nikita", "Krivlenya", "Yuriyovich", Human.Sex.MALE);
        groupCreator.addStudentToGroup(student1, group3);

        Student student2 = new Student("Zhanna", "Storozh", "Ihorivna", Human.Sex.FEMALE);
        groupCreator.addStudentToGroup(student2, group3);

        Student student3 = new Student("Josef", "Zhuravel", "Olegovich", Human.Sex.MALE);
        groupCreator.addStudentToGroup(student3, group3);




        System.out.println("--------------------------University Name: " + university.getName() + "--------------------------");
        System.out.println("University Rector: " + university.getHead().getFirstName() + " " + university.getHead().getLastName());
        System.out.println(" ");
        for (Faculty faculty : university.getFaculties()) {
            System.out.println("-Faculty Name: " + faculty.getName());
            System.out.println("-Faculty Dean: " + faculty.getHead().getFirstName() + " " + faculty.getHead().getLastName());
            System.out.println(" ");
            for (Department department : faculty.getDepartments()) {
                System.out.println("--Department Name: " + department.getName());
                System.out.println("--Department Head: " + department.getHead().getFirstName() + " " + department.getHead().getLastName());
                System.out.println(" ");
                for (Group group : department.getGroups()) {
                    System.out.println("---Group Name: " + group.getName());
                    System.out.println("---Group Head: " + group.getHead().getFirstName() + " " + group.getHead().getLastName());
                    System.out.println(" ");
                    for (Student student : group.getStudents()) {
                        System.out.println("----Student Name: " + student.getFirstName() + " " + student.getLastName());
                    }
                    System.out.println(" ");
                }
            }
        }
    }
}

