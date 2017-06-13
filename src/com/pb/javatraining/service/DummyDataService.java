package com.pb.javatraining.service;

import com.pb.javatraining.model.*;
import javafx.stage.Stage;

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

        Lesson oop = new Lesson("OOP",100);
        Lesson java = new Lesson("Java",100);
        Lesson cpp = new Lesson("C++",100);
        Lesson economy = new Lesson("The economy of the sea",100);
        Lesson management = new Lesson("Management",100);

        Student kulyk = new Student("Alexey","Kulyk", 21, State.MALE);
        Student galstyan = new Student("Emma","Galstyan", 20, State.FEMALE);
        Student livak = new Student("Max", "Livak", 21, State.MALE);
        Student misura = new Student("Denis", "Misura", 21, State.MALE);
        Student volkov = new Student("Dmitro", "Volkov", 21, State.MALE);

        Student gnedoy = new Student("Dmitriy","Gnedoy", 20, State.MALE);
        Student titov = new Student("Vlad","Titov", 21, State.MALE);
        Student lyawkov = new Student("Andrey", "Lyawkov",21, State.MALE);
        Student tydoi = new Student("Michael", "Tydoi", 20, State.MALE);
        Student osipenko = new Student("Denis", "Osipenko", 22, State.MALE);

        Student petrov = new Student("Petr","Petrov", 19, State.MALE);
        Student alekina = new Student("Alla","Alekina", 20, State.FEMALE);

        Student piskyn = new Student("Alina","Piskyn",21,State.FEMALE);
        Student lozhinskaya = new Student("Svetlana","Lozhinskaya",21,State.FEMALE);

        kulyk.addMarksByLessons(oop,92);
        kulyk.addMarksByLessons(java,96);
        kulyk.addMarksByLessons(cpp,90);

        galstyan.addMarksByLessons(oop,89);
        galstyan.addMarksByLessons(java,78);
        galstyan.addMarksByLessons(cpp,84);

        livak.addMarksByLessons(oop,90);
        livak.addMarksByLessons(java,90);
        livak.addMarksByLessons(cpp,95);

        misura.addMarksByLessons(oop,63);
        misura.addMarksByLessons(java,85);
        misura.addMarksByLessons(cpp,57);

        volkov.addMarksByLessons(oop,89);
        volkov.addMarksByLessons(java,78);
        volkov.addMarksByLessons(cpp,84);


        gnedoy.addMarksByLessons(oop,74);
        gnedoy.addMarksByLessons(java,85);
        gnedoy.addMarksByLessons(cpp,76);

        titov.addMarksByLessons(oop,59);
        titov.addMarksByLessons(java,74);
        titov.addMarksByLessons(cpp,60);

        lyawkov.addMarksByLessons(oop,74);
        lyawkov.addMarksByLessons(java,85);
        lyawkov.addMarksByLessons(cpp,76);

        tydoi.addMarksByLessons(oop,74);
        tydoi.addMarksByLessons(java,85);
        tydoi.addMarksByLessons(cpp,76);

        osipenko.addMarksByLessons(oop,74);
        osipenko.addMarksByLessons(java,85);
        osipenko.addMarksByLessons(cpp,76);


        petrov.addMarksByLessons(economy,78);
        petrov.addMarksByLessons(management,57);

        alekina.addMarksByLessons(economy,91);
        alekina.addMarksByLessons(management,96);

        piskyn.addMarksByLessons(economy,97);
        piskyn.addMarksByLessons(management,100);

        lozhinskaya.addMarksByLessons(economy,78);
        lozhinskaya.addMarksByLessons(management,51);

        Group group1 = new Group("3141",3141);
        Group group2 = new Group("3142",3142);
        Group group3 = new Group("3151",3151);
        Group group4 = new Group("3152",3152);

        group1.addStudent(new Student[] {kulyk,galstyan,livak,misura,volkov} );
        group2.addStudent(new Student[] {gnedoy,titov,lyawkov,tydoi,osipenko} );
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
