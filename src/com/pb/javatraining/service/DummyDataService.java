package com.pb.javatraining.service;

import com.pb.javatraining.model.*;

import java.util.*;

import static java.util.Collections.emptyList;

class DummyDataService {

    /**
     * Build a collection of university branches contain chains of groups and students within
     */

    Collection<Branch> getDummyData() {
        Collection<Branch> branches = new ArrayList<>();

        // TODO should produce at least two branches.
        //  Each branch should contain at least two groups
        //  Each group should contain at least five students
        //  Each student should contain at least 2 lessons with marks
        //  Additional requirement: each entity should being filled by you

        Branch higherMathematics = new Branch("Higher Mathematics");
        higherMathematics.setGroups(getGroupsForBranchHigherMathematics());
        Branch economics  = new Branch("Economics");
        economics.setGroups(getGroupsForBranchEconomics());

        branches.add(higherMathematics);
        branches.add(economics);
        return branches;
    }


    private List<Group> getGroupsForBranchHigherMathematics() {
        List<Group> groups = new ArrayList<>();
        Group group1234 = new Group("1234", 1234);
        group1234.setStudents(getStudentForGroup1234());
        Group group4321 = new Group("4321", 4321);
        group4321.setStudents(getStudentForGroup4321());
        groups.add(group1234);
        groups.add(group4321);
        return groups;
    }

    private List<Group> getGroupsForBranchEconomics() {
        List<Group> groups = new ArrayList<>();
        Group group3214 = new Group("3214", 3214);
        group3214.setStudents(getStudentForGroup3214());
        Group group2134 = new Group("2134", 2134);
        group2134.setStudents(getStudentForGroup2134());
        groups.add(group3214);
        groups.add(group2134);
        return groups;
    }

    private List<Student> getStudentForGroup1234() {
        List<Student> students = new ArrayList<>();

        Student durak = new Student("Ivan", "Durak", 21, State.MALE);
        durak.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 2.5);
        durak.setMarksByLessons(EnumLessons.PHYSICS.getLesson(), 2.0);
        durak.setMarksByLessons(EnumLessons.COMPUTER_SCIENCE.getLesson(), 2.0);

        Student jonson = new Student("Jon", "Jonson", 21, State.MALE);
        jonson.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 3.1);
        jonson.setMarksByLessons(EnumLessons.GEOMETRY.getLesson(), 3.0);
        jonson.setMarksByLessons(EnumLessons.COMPUTER_SCIENCE.getLesson(), 2.9);


        Student viktorovna = new Student("Vika", "Viktorovna", 21, State.FEMALE);
        viktorovna.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 2.8);
        viktorovna.setMarksByLessons(EnumLessons.GEOMETRY.getLesson(), 2.7);
        viktorovna.setMarksByLessons(EnumLessons.COMPUTER_SCIENCE.getLesson(), 2.6);

        Student petrov = new Student("Petr", "Petrov", 19, State.MALE);
        petrov.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 5.0);
        petrov.setMarksByLessons(EnumLessons.COMPUTER_SCIENCE.getLesson(), 5.0);
        petrov.setMarksByLessons(EnumLessons.PHYSICS.getLesson(), 5.0);

        Student denisova = new Student("Kate", "Denisova", 22, State.FEMALE);
        denisova.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 4.0);
        denisova.setMarksByLessons(EnumLessons.GEOMETRY.getLesson(), 3.9);
        denisova.setMarksByLessons(EnumLessons.GEOMETRY.getLesson(), 3.8);

        students.add(durak);
        students.add(jonson);
        students.add(viktorovna);
        students.add(petrov);
        students.add(denisova);


        return students;
    }

    private List<Student> getStudentForGroup4321() {
        List<Student> students = new ArrayList<>();
        Student ivanov = new Student("Ivan", "Ivanov", 20, State.MALE);
        ivanov.setMarksByLessons(EnumLessons.GEOMETRY.getLesson(), 4.7);
        ivanov.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 4.8);
        ivanov.setMarksByLessons(EnumLessons.COMPUTER_SCIENCE.getLesson(), 4.9);

        Student viktorov = new Student("Viktor", "Viktorov", 21, State.MALE);
        viktorov.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 4.6);
        viktorov.setMarksByLessons(EnumLessons.PHYSICS.getLesson(), 4.5);
        viktorov.setMarksByLessons(EnumLessons.GEOMETRY.getLesson(), 4.4);

        Student denisov = new Student("Denis", "Denisov", 18, State.MALE);
        denisov.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 4.3);
        denisov.setMarksByLessons(EnumLessons.PHYSICS.getLesson(), 4.2);
        denisov.setMarksByLessons(EnumLessons.COMPUTER_SCIENCE.getLesson(), 4.1);




        Student maksimov = new Student("Maks", "Maksimov", 21, State.MALE);
        maksimov.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 3.4);
        maksimov.setMarksByLessons(EnumLessons.PHYSICS.getLesson(), 3.3);
        maksimov.setMarksByLessons(EnumLessons.COMPUTER_SCIENCE.getLesson(), 3.2);

        Student petrov1 = new Student("Petr1", "Petrov1", 19, State.MALE);
        petrov1.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 5.0);
        petrov1.setMarksByLessons(EnumLessons.COMPUTER_SCIENCE.getLesson(), 5.0);
        petrov1.setMarksByLessons(EnumLessons.PHYSICS.getLesson(), 5.0);
        students.add(ivanov);
        students.add(viktorov);
        students.add(denisov);
        students.add(petrov1);
        students.add(maksimov);

        return students;
    }



    private List<Student> getStudentForGroup3214() {
        List<Student> students = new ArrayList<>();

        Student durak1 = new Student("Ivan1", "Durak1", 21, State.MALE);
        durak1.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 2.5);
        durak1.setMarksByLessons(EnumLessons.PHYSICS.getLesson(), 2.0);
        durak1.setMarksByLessons(EnumLessons.COMPUTER_SCIENCE.getLesson(), 2.0);

        Student jonson1 = new Student("Jon1", "Jonson1", 21, State.MALE);
        jonson1.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 3.1);
        jonson1.setMarksByLessons(EnumLessons.GEOMETRY.getLesson(), 3.0);
        jonson1.setMarksByLessons(EnumLessons.COMPUTER_SCIENCE.getLesson(), 2.9);


        Student viktorovna1 = new Student("Vika1", "Viktorovna1", 21, State.FEMALE);
        viktorovna1.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 2.8);
        viktorovna1.setMarksByLessons(EnumLessons.GEOMETRY.getLesson(), 2.7);
        viktorovna1.setMarksByLessons(EnumLessons.COMPUTER_SCIENCE.getLesson(), 2.6);


        Student elenina = new Student("Elena", "Elenina", 19, State.FEMALE);
        elenina.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 3.7);
        elenina.setMarksByLessons(EnumLessons.GEOMETRY.getLesson(), 3.6);
        elenina.setMarksByLessons(EnumLessons.PHYSICS.getLesson(), 3.5);
        Student denisova1 = new Student("Kate1", "Denisova1", 22, State.FEMALE);
        denisova1.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 4.0);
        denisova1.setMarksByLessons(EnumLessons.GEOMETRY.getLesson(), 3.9);
        denisova1.setMarksByLessons(EnumLessons.GEOMETRY.getLesson(), 3.8);

        students.add(durak1);
        students.add(jonson1);
        students.add(viktorovna1);
        students.add(elenina);
        students.add(denisova1);


        return students;
    }

    public List<Student> getStudentForGroup2134() {
        List<Student> students = new ArrayList<>();
        Student ivanov1 = new Student("Ivan1", "Ivanov1", 20, State.MALE);
        ivanov1.setMarksByLessons(EnumLessons.GEOMETRY.getLesson(), 4.7);
        ivanov1.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 4.8);
        ivanov1.setMarksByLessons(EnumLessons.COMPUTER_SCIENCE.getLesson(), 4.9);

        Student viktorov1 = new Student("Viktor1", "Viktorov1", 21, State.MALE);
        viktorov1.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 4.6);
        viktorov1.setMarksByLessons(EnumLessons.PHYSICS.getLesson(), 4.5);
        viktorov1.setMarksByLessons(EnumLessons.GEOMETRY.getLesson(), 4.4);

        Student denisov1 = new Student("Denis1", "Denisov1", 18, State.MALE);
        denisov1.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 4.3);
        denisov1.setMarksByLessons(EnumLessons.PHYSICS.getLesson(), 4.2);
        denisov1.setMarksByLessons(EnumLessons.COMPUTER_SCIENCE.getLesson(), 4.1);


        Student elenina1 = new Student("Elena1", "Elenina1", 19, State.FEMALE);
        elenina1.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 3.7);
        elenina1.setMarksByLessons(EnumLessons.GEOMETRY.getLesson(), 3.6);
        elenina1.setMarksByLessons(EnumLessons.PHYSICS.getLesson(), 3.5);

        Student maksimov1 = new Student("Maks1", "Maksimov1", 21, State.MALE);
        maksimov1.setMarksByLessons(EnumLessons.ALGEBRA.getLesson(), 3.4);
        maksimov1.setMarksByLessons(EnumLessons.PHYSICS.getLesson(), 3.3);
        maksimov1.setMarksByLessons(EnumLessons.COMPUTER_SCIENCE.getLesson(), 3.2);

        students.add(ivanov1);
        students.add(viktorov1);
        students.add(denisov1);
        students.add(elenina1);
        students.add(maksimov1);

        return students;
    }



}
