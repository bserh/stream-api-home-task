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
        Student petrov = new Student("Петя", "Петров", 20, State.MALE);
        petrov.addMarkByLesson(math,95);
        petrov.addMarkByLesson(history,90);

        Student ivanov = new Student("Иван", "Иванов", 19, State.MALE);
        ivanov.addMarkByLesson(math,50);
        ivanov.addMarkByLesson(oop,60);

        Student kotov = new Student("Василий","Котов",20,State.MALE);
        kotov.addMarkByLesson(math,70);
        kotov.addMarkByLesson(linux,100);

        Student shatalina = new Student("Шаталина","Оксана",19,State.FEMALE);
        shatalina.addMarkByLesson(math,100);
        shatalina.addMarkByLesson(linux,100);
        shatalina.addMarkByLesson(history,100);

        Student jelo = new Student("Жело","Денис", 20, State.MALE);
        jelo.addMarkByLesson(math,80);
        jelo.addMarkByLesson(history,90);

        Student misura = new Student("Мисюра","Денис", 20, State.MALE);
        misura.addMarkByLesson(math,80);
        misura.addMarkByLesson(history,90);

        Student tcachenko = new Student("Ткаченко","Андрей", 21, State.MALE);
        tcachenko.addMarkByLesson(oop,100);
        tcachenko.addMarkByLesson(linux,100);

        Student galstyan = new Student("Галстян","Эмма", 19, State.FEMALE);
        galstyan.addMarkByLesson(math,80);
        galstyan.addMarkByLesson(history,90);

        Student kulik = new Student("Кулик", "Олексей", 20, State.MALE);
        kulik.addMarkByLesson(oop,90);
        kulik.addMarkByLesson(linux,94);
        kulik.addMarkByLesson(history,100);
        kulik.addMarkByLesson(math,95);






        Group group3141 = new Group("3141", 3141);
        group3141.addStudent(petrov);
        group3141.addStudent(ivanov);


        Group group3142 = new Group("3142", 3142);
        group3142.addStudent(misura);
        group3142.addStudent(jelo);

        Branch ikitn = new Branch("IKITN");
        ikitn.addGroup(group3141);
        ikitn.addGroup(group3142);


        Group group3151 = new Group("3151",3151);
        group3151.addStudent(kotov);
        group3151.addStudent(shatalina);
        group3151.addStudent(tcachenko);

        Group group3152 = new Group("3152",3152);
        group3151.addStudent(galstyan);
        group3151.addStudent(kulik);

        Branch bzas = new Branch("Bzas");
        bzas.addGroup(group3151);
        bzas.addGroup(group3152);



        List<Branch> branches = new ArrayList<>();
        branches.add(ikitn);
        branches.add(bzas);

        return branches;
    }

}
