package com.pb.javatraining.service;

import com.pb.javatraining.model.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.util.Collections.emptyList;

class DummyDataService {

    /**
     * Build a collection of university branches contain chains of groups and students within
     */
    Collection<Branch> getDummyData() {

        // TODO should produce at least two branches.
        //  Each branch should contain at least two groups
        //  Each group should contain at least five students
        //  Each student should contain at least 2 lessons with marks
        //  Additional requirement: each entity should being filled by you

        // lessons
        Lesson oop = new Lesson("OOP",100);
        Lesson java = new Lesson("Java",100);
        Lesson cpp = new Lesson("C++",100);
//        Lesson databases = new Lesson("Databases",100);
//        Lesson web = new Lesson("Web",100);
//        Lesson math = new Lesson("Math methods",100);
//        Lesson softwareDesign = new Lesson("Software Design",100);
        Lesson economy = new Lesson("The economy of the sea",100);
        Lesson management = new Lesson("Management",100);

        // students
        Student kulyk = new Student("Alexey","Kulyk", 21, State.MALE);
        Student galstyan = new Student("Emma","Galstyan", 20, State.FEMALE);

        Student gnedoy = new Student("Dmitriy","Gnedoy", 20, State.MALE);
        Student buzunova = new Student("Margarita","Buzunova", 21, State.FEMALE);

        Student petrov = new Student("Petr","Petrov", 19, State.MALE);
        Student alekina = new Student("Alla","Alekina", 20, State.FEMALE);

        Student piskyn = new Student("Alina","Piskyn",21,State.FEMALE);
        Student lozhinskaya = new Student("Svetlana","Lozhinskaya",21,State.FEMALE);


        // adding lessons with marks
        kulyk.addMarksByLessons(oop,92);
        kulyk.addMarksByLessons(java,96);
        kulyk.addMarksByLessons(cpp,90);

        galstyan.addMarksByLessons(oop,89);
        galstyan.addMarksByLessons(java,78);
        galstyan.addMarksByLessons(cpp,84);

        gnedoy.addMarksByLessons(oop,74);
        gnedoy.addMarksByLessons(java,85);
        gnedoy.addMarksByLessons(cpp,76);

        buzunova.addMarksByLessons(oop,59);
        buzunova.addMarksByLessons(java,74);
        buzunova.addMarksByLessons(cpp,60);


        petrov.addMarksByLessons(economy,78);
        petrov.addMarksByLessons(management,57);

        alekina.addMarksByLessons(economy,91);
        alekina.addMarksByLessons(management,96);

        piskyn.addMarksByLessons(economy,97);
        piskyn.addMarksByLessons(management,100);

        lozhinskaya.addMarksByLessons(economy,78);
        lozhinskaya.addMarksByLessons(management,51);

        // gropus

        Group group1 = new Group("3141",3141);
        Group group2 = new Group("3142",3142);
        Group group3 = new Group("3151",3151);
        Group group4 = new Group("3152",3152);

        group1.addStudent(new Student[] {kulyk,galstyan} );
        group2.addStudent(new Student[] {gnedoy,buzunova} );
        group3.addStudent(new Student[] {petrov,alekina} );
        group4.addStudent(new Student[] {piskyn,lozhinskaya} );

        Branch ikitn = new Branch("IKITN");
        Branch economyOfSea = new Branch("Economy of Sea");

        ikitn.addGroups(new Group[] {group1, group2});
        economyOfSea.addGroups(new Group[] {group3, group4});

        List<Branch> branches = new ArrayList<>();
        branches.add(ikitn);
        branches.add(economyOfSea);

        return branches;
    }

}
