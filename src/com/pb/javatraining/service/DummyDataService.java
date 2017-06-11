package com.pb.javatraining.service;

import com.pb.javatraining.model.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

        //Create lessons
        Lesson algorithmization = new Lesson("algorithmization",92.8);
        Lesson oop = new Lesson("oop", 66.9);
        Lesson networkTechnologies = new Lesson("network technologies", 73.3);
        Lesson databases = new Lesson("databases", 72.4);
        Lesson operatingSystem = new Lesson("operating system", 88.9);
        Lesson numericalMethods = new Lesson("numerical methods",50.8);
        Lesson hardware = new Lesson("hardware", 99.9);
        Lesson securityInformation = new Lesson("security information", 71.7);
        Lesson web = new Lesson("web", 53.3);

        //Create students
        Student johnSnr = new Student("John Snr", "Dou", 23, State.MALE);
        Student georgeSnr = new Student("George Snr", "Michael", 20, State.MALE);
        Student monikaSnr = new Student("Monika Snr", "Rose", 22, State.FEMALE);
        Student harrySnr = new Student("Harry Snr", "Dirty", 21, State.MALE);
        Student oliviaSnr = new Student("Olivia Snr", "Williams",22, State.FEMALE);
        Student lilySnr = new Student("Lily Snr", "Moore", 23, State.FEMALE);
        Student danielSnr = new Student("Daniel Snr", "Brown", 20, State.MALE);
        Student jamesSnr = new Student("James Snr", "Taylor", 21, State.MALE);
        Student anthonySnr = new Student("Anthony Snr", "Miller", 23, State.MALE);
        Student joshuaSnr = new Student("Joshua Snr", "Davies", 20, State.MALE);

        Student johnJr = new Student("John Jr", "Dou", 19, State.MALE);
        Student georgeJr = new Student("George Jr", "Michael", 18, State.MALE);
        Student monikaJr = new Student("Monika Jr", "Rose", 17, State.FEMALE);
        Student harryJr = new Student("Harry Jr", "Dirty", 20, State.MALE);
        Student oliviaJr = new Student("Olivia Jr", "Williams",17, State.FEMALE);
        Student lilyJr = new Student("Lily Jr", "Moore", 19, State.FEMALE);
        Student danielJr = new Student("Daniel Jr", "Brown", 16, State.MALE);
        Student jamesJr = new Student("James Jr", "Taylor", 18, State.MALE);
        Student anthonyJr = new Student("Anthony Jr", "Miller", 18, State.MALE);
        Student joshuaJr = new Student("Joshua Jr", "Davies", 19, State.MALE);

        //Add lessons with marks to each student
        //Mjr
        johnSnr.getMarksByLessons().put(algorithmization, 95.9);
        johnSnr.getMarksByLessons().put(oop, 100d);
        johnSnr.getMarksByLessons().put(numericalMethods, 91.4);

        georgeSnr.getMarksByLessons().put(networkTechnologies, 68.4);
        georgeSnr.getMarksByLessons().put(databases,71.1);
        georgeSnr.getMarksByLessons().put(web, 50.5);


        monikaSnr.getMarksByLessons().put(operatingSystem, 92.4);
        monikaSnr.getMarksByLessons().put(hardware, 93.7);
        monikaSnr.getMarksByLessons().put(databases, 99.5);

        harrySnr.getMarksByLessons().put(oop, 56.9);
        harrySnr.getMarksByLessons().put(numericalMethods, 43.2);
        harrySnr.getMarksByLessons().put(securityInformation,65.2);

        oliviaSnr.getMarksByLessons().put(operatingSystem, 43.5);
        oliviaSnr.getMarksByLessons().put(databases, 23.1);
        oliviaSnr.getMarksByLessons().put(numericalMethods, 23.8);

        lilySnr.getMarksByLessons().put(web, 54.4);
        lilySnr.getMarksByLessons().put(hardware, 61.3);
        lilySnr.getMarksByLessons().put(networkTechnologies, 87.3);

        danielSnr.getMarksByLessons().put(securityInformation, 76.2);
        danielSnr.getMarksByLessons().put(algorithmization, 52.9);
        danielSnr.getMarksByLessons().put(databases, 44.4);

        jamesSnr.getMarksByLessons().put(oop, 85.4);
        jamesSnr.getMarksByLessons().put(numericalMethods, 55.2);
        jamesSnr.getMarksByLessons().put(web, 43.4);

        anthonySnr.getMarksByLessons().put(hardware, 40.3);
        anthonySnr.getMarksByLessons().put(networkTechnologies, 40.4);
        anthonySnr.getMarksByLessons().put(securityInformation, 40.7);

        joshuaSnr.getMarksByLessons().put(databases, 77.7);
        joshuaSnr.getMarksByLessons().put(networkTechnologies, 57.3);
        joshuaSnr.getMarksByLessons().put(numericalMethods, 88.8);

        //jr
        johnJr.getMarksByLessons().put(algorithmization, 48.4);
        johnJr.getMarksByLessons().put(oop, 67.1);
        johnJr.getMarksByLessons().put(numericalMethods, 46.9);

        georgeJr.getMarksByLessons().put(networkTechnologies, 77.4);
        georgeJr.getMarksByLessons().put(databases,88.8);
        georgeJr.getMarksByLessons().put(web, 67.2);

        monikaJr.getMarksByLessons().put(operatingSystem, 46.2);
        monikaJr.getMarksByLessons().put(hardware, 76.2);
        monikaJr.getMarksByLessons().put(databases, 48.2);

        harryJr.getMarksByLessons().put(oop, 74.3);
        harryJr.getMarksByLessons().put(numericalMethods, 94.5);
        harryJr.getMarksByLessons().put(securityInformation, 75.1);

        oliviaJr.getMarksByLessons().put(operatingSystem, 88.2);
        oliviaJr.getMarksByLessons().put(databases, 72.9);
        oliviaJr.getMarksByLessons().put(numericalMethods, 91.3);

        lilyJr.getMarksByLessons().put(web, 36.1);
        lilyJr.getMarksByLessons().put(hardware, 75.1);
        lilyJr.getMarksByLessons().put(networkTechnologies, 67.2);

        danielJr.getMarksByLessons().put(securityInformation, 96.9);
        danielJr.getMarksByLessons().put(algorithmization, 92.7);
        danielJr.getMarksByLessons().put(databases, 97.4);

        jamesJr.getMarksByLessons().put(oop, 45d);
        jamesJr.getMarksByLessons().put(numericalMethods, 50.2);

        anthonyJr.getMarksByLessons().put(hardware, 90.3);
        anthonyJr.getMarksByLessons().put(networkTechnologies, 99.9);
        anthonyJr.getMarksByLessons().put(securityInformation, 91.6);

        joshuaJr.getMarksByLessons().put(databases, 96.5);
        joshuaJr.getMarksByLessons().put(networkTechnologies, 91.3);
        joshuaJr.getMarksByLessons().put(numericalMethods, 100.0);


        //create groups
        Group group1 = new Group("1212tz", 1212);
        Group group2 = new Group("2440r", 2440);
        Group group3 = new Group("3113q", 3113);
        Group group4 = new Group("4790n", 4790);

        //add students to each group
        group1.getStudents().add(anthonySnr);
        group1.getStudents().add(jamesSnr);
        group1.getStudents().add(danielSnr);
        group1.getStudents().add(joshuaSnr);
        group1.getStudents().add(johnSnr);

        group2.getStudents().add(danielSnr);
        group2.getStudents().add(joshuaSnr);
        group2.getStudents().add(oliviaSnr);
        group2.getStudents().add(harrySnr);
        group2.getStudents().add(georgeSnr);

        group3.getStudents().add(anthonyJr);
        group3.getStudents().add(jamesJr);
        group3.getStudents().add(lilyJr);
        group3.getStudents().add(monikaJr);
        group3.getStudents().add(johnJr);

        group4.getStudents().add(danielJr);
        group4.getStudents().add(joshuaJr);
        group4.getStudents().add(oliviaJr);
        group4.getStudents().add(harryJr);
        group4.getStudents().add(georgeJr);

        //create branch
        Branch branch1 = new Branch("software engineering");
        branch1.getGroups().add(group1);
        branch1.getGroups().add(group2);
        Branch branch2 = new Branch("information systems");
        branch2.getGroups().add(group3);
        branch2.getGroups().add(group4);

        //add branches to list
        List<Branch> branches = new ArrayList<>();
        branches.add(branch1);
        branches.add(branch2);

        return branches;
    }

}
