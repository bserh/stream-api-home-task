package com.pb.javatraining.service;

import com.pb.javatraining.model.*;

import java.util.ArrayList;
import java.util.Collection;

import static java.util.Collections.emptyList;

class DummyDataService {

    /**
     * Build a collection of university branches contain chains of groups and students within
     */
    Collection<Branch> getDummyData() {


        ArrayList<Branch> allBranch = new ArrayList<>();

        Branch maths = createMathsProperties();
        Branch economics = createEconomicsProperties();

        allBranch.add(maths);
        allBranch.add(economics);

        return allBranch;
    }

    private Branch createMathsProperties() {
        Branch maths = new Branch("Branch of mathematics and informatics");
        createGroupsForMaths(maths);
        return maths;
    }

    private void createGroupsForMaths(Branch maths) {
        Group mathsNoneProfile = new Group("Applied mathematics and informatics", 3235);
        Group mathsProfileModeling = new Group("Applied mathematics and informatics " +
                "(mathematical and computer modeling)", 4236);
        addStudentsPropertiesForMaths(mathsNoneProfile);
        addStudentsPropertiesForMaths(mathsProfileModeling);

        maths.setGroups(mathsNoneProfile);
        maths.setGroups(mathsProfileModeling);
    }
    private void addStudentsPropertiesForMaths(Group group){
        Lesson modeling = new Lesson("Computer modelling", 18);
        Lesson java = new Lesson("Programming language JAVA", 25);

        Student pavlov = new Student("Ivan", "Pavlov", 20, State.MALE);
        pavlov.setMarksByLesson(modeling, 5.0);
        pavlov.setMarksByLesson(java, 4.3);

        Student primka = new Student("Victoria", "Primka", 19, State.FEMALE);
        primka.setMarksByLesson(modeling, 3.5);
        primka.setMarksByLesson(java, 2.0);

        Student trutenko = new Student("Tolia", "Trutenko", 19, State.MALE);
        trutenko.setMarksByLesson(modeling, 4.9);
        trutenko.setMarksByLesson(java, 4.5);

        Student boyko = new Student("Roman", "Boyko", 20, State.MALE);
        boyko.setMarksByLesson(modeling, 4.8);
        boyko.setMarksByLesson(java, 3.9);

        Student sharko = new Student("Anastasia", "Sharko", 20, State.FEMALE);
        sharko.setMarksByLesson(modeling, 5.0);
        sharko.setMarksByLesson(java, 5.0);

        group.setStudent(pavlov);
        group.setStudent(primka);
        group.setStudent(trutenko);
        group.setStudent(boyko);
        group.setStudent(sharko);
    }

    private Branch createEconomicsProperties() {
        Branch economics = new Branch("Branch of economics and management");
        createGroupsForEconomics(economics);
        return economics;
    }

    private void createGroupsForEconomics(Branch economics) {
        Group economicsProfileFirm = new Group("Economy (economy of firm)", 1806);
        Group economicsNoneProfile = new Group("Economic security", 2813);

        addStudentsPropertiesForEconomics(economicsNoneProfile);
        addStudentsPropertiesForEconomics(economicsProfileFirm);

        economics.setGroups(economicsNoneProfile);
        economics.setGroups(economicsProfileFirm);
    }
    private void addStudentsPropertiesForEconomics(Group group) {
        Lesson economy = new Lesson("Economy", 29);
        Lesson management = new Lesson("Personnel Management", 30);

        Student glasko = new Student("Vadim", "Glasko", 20, State.MALE);
        glasko.setMarksByLesson(management, 5.0);
        glasko.setMarksByLesson(economy, 4.8);

        Student farik = new Student("Vadim", "Farik", 19, State.MALE);
        farik.setMarksByLesson(management, 4.7);
        farik.setMarksByLesson(economy, 4.6);

        Student morozko = new Student("Dima", "Morozko", 21, State.MALE);
        morozko.setMarksByLesson(management, 3.9);
        morozko.setMarksByLesson(economy, 4.5);

        Student mara = new Student("Svetlana", "Mara", 19, State.FEMALE);
        mara.setMarksByLesson(management, 5.0);
        mara.setMarksByLesson(economy, 5.0);

        Student tokar = new Student("Tania", "Tokar", 20, State.FEMALE);
        tokar.setMarksByLesson(management, 4.6);
        tokar.setMarksByLesson(economy, 5.0);

        group.setStudent(glasko);
        group.setStudent(farik);
        group.setStudent(morozko);
        group.setStudent(mara);
        group.setStudent(tokar);
    }
}
