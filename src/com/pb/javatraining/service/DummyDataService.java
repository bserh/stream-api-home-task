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

    // TODO should produce at least two branches.
    //  Each branch should contain at least two groups
    //  Each group should contain at least five students
    //  Each student should contain at least 2 lessons with marks
    //  Additional requirement: each entity should being filled by you

    Collection<Branch> getDummyData() {
        //lessons
        Lesson math = new Lesson("Math",100);
        Lesson oop = new Lesson("OOP",100);
        Lesson history = new Lesson("History",100);
        Lesson linux = new Lesson("Linux",100);

        //students
        Student petrov = new Student("Petro", "Petrov", 20, State.MALE);
        petrov.addMarkByLesson(math,95);
        petrov.addMarkByLesson(history,90);
        Student ivanov = new Student("Ivan", "Ivanov", 19, State.MALE);
        ivanov.addMarkByLesson(math,50);
        ivanov.addMarkByLesson(oop,60);
        Student kotov = new Student("Vasya","Kotov",20,State.MALE);
        kotov.addMarkByLesson(math,70);
        kotov.addMarkByLesson(linux,100);
        Student shatalina = new Student("Shatalina","Oksana",19,State.FEMALE);
        List<Group> groups1 = new ArrayList<>();
        shatalina.addMarkByLesson(math,100);
        shatalina.addMarkByLesson(linux,100);
        shatalina.addMarkByLesson(history,100);




        Group group3141 = new Group("3141", 3141);
        group3141.addStudent(petrov);


        Group group3142 = new Group("3142", 3142);

        group3142.addStudent(ivanov);

        groups1.add(group3141);
        groups1.add(group3142);


        Branch ikitn = new Branch("IKITN");
        ikitn.setGroups(groups1);

        List<Group> groups2 = new ArrayList<>();

        Group group3151 = new Group("3151",3151);
        group3151.addStudent(kotov);

        group3151.addStudent(shatalina);

        groups2.add(group3151);

        Branch bzas = new Branch("Bzas");
        bzas.setGroups(groups2);


        List<Group> groups3 = new ArrayList<>();
        List<Group> groups4 = new ArrayList<>();




        List<Branch> branches = new ArrayList<>();
        branches.add(ikitn);
        branches.add(bzas);

        return branches;
    }

}
