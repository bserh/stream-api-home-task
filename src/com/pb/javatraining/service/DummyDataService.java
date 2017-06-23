package com.pb.javatraining.service;

import com.pb.javatraining.model.*;

import java.util.*;

import static java.util.Collections.emptyList;

class DummyDataService {

    /**
     * Build a collection of university branches contain chains of groups and students within
     */

    List<Branch> branchList;

    {
        Lesson l1 = new Lesson("OOP", 3.0);
        Lesson l2 = new Lesson("GIS", 2.0);
        Lesson l3 = new Lesson("TAU", 2.5);
        Lesson l4 = new Lesson("MRBP", 1.5);
        Lesson l5 = new Lesson("English", 1.0);
        Lesson l6 = new Lesson("PE", 1.0);
        Lesson l7 = new Lesson("BD", 3.0);
        Lesson l8 = new Lesson("NN", 2.0);
        Lesson l9 = new Lesson("TRS", 3.25);
        Lesson l10 = new Lesson("OLAP", 2.0);

        Map<Lesson, Double> mapS1 = new HashMap<>();
        mapS1.put(l1, 90.0);
        mapS1.put(l5, 90.0);
        mapS1.put(l9, 100.0);
        mapS1.put(l2, 95.0);

        Map<Lesson, Double> mapS2 = new HashMap<>();
        mapS2.put(l2, 70.0);
        mapS2.put(l3, 80.0);
        mapS2.put(l4, 62.0);
        mapS2.put(l7, 64.0);

        Map<Lesson, Double> mapS3 = new HashMap<>();
        mapS3.put(l1, 90.0);
        mapS3.put(l5, 90.0);
        mapS3.put(l9, 100.0);
        mapS3.put(l2, 95.0);


        Map<Lesson, Double> mapS4 = new HashMap<>();
        mapS4.put(l1, 90.0);
        mapS4.put(l5, 90.0);
        mapS4.put(l9, 100.0);
        mapS4.put(l2, 95.0);

        Map<Lesson, Double> mapS5 = new HashMap<>();
        mapS5.put(l1, 90.0);
        mapS5.put(l5, 90.0);
        mapS5.put(l9, 100.0);
        mapS5.put(l2, 95.0);

        Map<Lesson, Double> mapS6 = new HashMap<>();
        mapS6.put(l1, 90.0);
        mapS6.put(l5, 90.0);
        mapS6.put(l9, 100.0);
        mapS6.put(l2, 95.0);

        Map<Lesson, Double> mapS7 = new HashMap<>();
        mapS7.put(l1, 90.0);
        mapS7.put(l5, 90.0);
        mapS7.put(l9, 100.0);
        mapS7.put(l2, 95.0);

        Map<Lesson, Double> mapS8 = new HashMap<>();
        mapS7.put(l5, 90.0);
        mapS7.put(l8, 90.0);
        mapS7.put(l9, 100.0);
        mapS7.put(l3, 95.0);

        Map<Lesson, Double> mapS9 = new HashMap<>();
        mapS7.put(l9, 90.0);
        mapS7.put(l4, 90.0);
        mapS7.put(l6, 100.0);
        mapS7.put(l10, 95.0);

        Map<Lesson, Double> mapS10 = new HashMap<>();
        mapS7.put(l5, 90.0);
        mapS7.put(l6, 90.0);
        mapS7.put(l9, 100.0);
        mapS7.put(l4, 95.0);

        Map<Lesson, Double> mapS11 = new HashMap<>();
        mapS1.put(l1, 90.0);
        mapS1.put(l5, 90.0);
        mapS1.put(l9, 100.0);
        mapS1.put(l2, 95.0);

        Map<Lesson, Double> mapS12 = new HashMap<>();
        mapS2.put(l2, 70.0);
        mapS2.put(l3, 80.0);
        mapS2.put(l4, 62.0);
        mapS2.put(l7, 64.0);

        Map<Lesson, Double> mapS13 = new HashMap<>();
        mapS3.put(l1, 90.0);
        mapS3.put(l5, 90.0);
        mapS3.put(l9, 100.0);
        mapS3.put(l2, 95.0);

        Map<Lesson, Double> mapS14 = new HashMap<>();
        mapS4.put(l1, 90.0);
        mapS4.put(l5, 90.0);
        mapS4.put(l9, 100.0);
        mapS4.put(l2, 95.0);

        Map<Lesson, Double> mapS15 = new HashMap<>();
        mapS5.put(l1, 90.0);
        mapS5.put(l5, 90.0);
        mapS5.put(l9, 100.0);
        mapS5.put(l2, 95.0);

        Map<Lesson, Double> mapS16 = new HashMap<>();
        mapS6.put(l1, 90.0);
        mapS6.put(l5, 90.0);
        mapS6.put(l9, 100.0);
        mapS6.put(l2, 95.0);

        Map<Lesson, Double> mapS17 = new HashMap<>();
        mapS7.put(l1, 90.0);
        mapS7.put(l5, 90.0);
        mapS7.put(l9, 100.0);
        mapS7.put(l2, 95.0);

        Map<Lesson, Double> mapS18 = new HashMap<>();
        mapS7.put(l5, 90.0);
        mapS7.put(l8, 61.0);
        mapS7.put(l9, 70.0);
        mapS7.put(l3, 91.0);

        Map<Lesson, Double> mapS19 = new HashMap<>();
        mapS7.put(l9, 90.0);
        mapS7.put(l4, 84.0);
        mapS7.put(l6, 74.0);
        mapS7.put(l10, 65.0);

        Map<Lesson, Double> mapS20 = new HashMap<>();
        mapS7.put(l5, 60.0);
        mapS7.put(l6, 58.0);
        mapS7.put(l9, 0.0);
        mapS7.put(l4, 26.0);

        Student s1 = new Student("Sergey", "Yakovenko", 28, State.MALE, mapS1);
        Student s2 = new Student("Anton", "Rogovoi", 22, State.MALE, mapS2);
        Student s3 = new Student("Alexander", "Mingalyov", 19, State.MALE, mapS3);
        Student s4 = new Student("Vladislav", "Bukhonko", 20, State.MALE, mapS4);
        Student s5 = new Student("Jon", "Snow", 25, State.MALE, mapS5);
        Student s6 = new Student("Anastasia", "Donets", 18, State.FEMALE, mapS6);
        Student s7 = new Student("Yaroslav", "Yakovenko", 17, State.MALE, mapS7);
        Student s8 = new Student("Vyacheslav", "Sosnovskii", 19, State.MALE, mapS8);
        Student s9 = new Student("Alina", "Bril", 20, State.FEMALE, mapS9);
        Student s10 = new Student("Irina", "Vasilchuk", 18, State.FEMALE, mapS10);
        Student s11 = new Student("Sergey", "Yakovenko", 28, State.MALE, mapS11);
        Student s12 = new Student("Anton", "Rogovoi", 22, State.MALE, mapS12);
        Student s13 = new Student("Alexander", "Mingalyov", 19, State.MALE, mapS13);
        Student s14 = new Student("Vladislav", "Bukhonko", 20, State.MALE, mapS14);
        Student s15 = new Student("Marina", "Plakhutina", 25, State.FEMALE, mapS15);
        Student s16 = new Student("Anastasia", "Donets", 18, State.FEMALE, mapS16);
        Student s17 = new Student("Yaroslav", "Yakovenko", 17, State.MALE, mapS17);
        Student s18 = new Student("Vyacheslav", "Sosnovskii", 19, State.MALE, mapS18);
        Student s19 = new Student("Alina", "Bril", 20, State.FEMALE, mapS19);
        Student s20 = new Student("Irina", "Vasilchuk", 18, State.FEMALE, mapS20);


        Group g301 = new Group("gr 301", 301, Arrays.asList(s1, s2, s3, s4, s5));
        Group g302 = new Group("gr 302", 302, Arrays.asList(s6, s7, s8, s9, s10));
        Group g303 = new Group("gr 303", 303, Arrays.asList(s11, s12, s13, s14, s15));
        Group g304 = new Group("gr 304", 304, Arrays.asList(s16, s17, s18, s19, s20));

        branchList = new ArrayList<>();
        branchList.add(new Branch("FKN", Arrays.asList(g301, g302)));
        branchList.add(new Branch("FEN", Arrays.asList(g303, g304)));

    }

    Collection<Branch> getDummyData() {
        return branchList;
    }

}
