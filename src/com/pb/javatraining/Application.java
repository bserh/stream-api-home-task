package com.pb.javatraining;

import com.pb.javatraining.model.*;
import com.pb.javatraining.service.DummyDataService;
import com.pb.javatraining.service.StatementService;

import java.util.*;

public class Application {



    public static void main(String[] args) {

        StatementService service = new StatementService();

        // Get data to produce statement in further
        Collection<Lesson> allLessons = service.getAllLessons();
        System.out.println("All Lessons: ");
        allLessons.stream().forEach(System.out::println);


        int amountOfGroupsWhereBadStudents = service.getAmountOfGroupsWhereBadStudents();
        System.out.println("\namountOfGroupsWhereBadStudents: " + amountOfGroupsWhereBadStudents);

        Map<Group, Double> averageMarksWithinGroups = service.getAverageMarksWithinGroups();
        System.out.println("\naverageMarksWithinGroups: ");
        System.out.println(averageMarksWithinGroups);


        Map<Lesson, Double> averageMarksWithinLessons = service.getAverageMarksWithinLessons();
        System.out.println("\naverageMarksWithinLessons: ");
        System.out.println(averageMarksWithinLessons);

        Collection<Group> groupsWhereAtLeastTwoExcellentStudents = service.getGroupsWhereAtLeastTwoExcelentStudents();
        System.out.println("\ngroupsWhereAtLeastTwoExcellentStudents: ");
        groupsWhereAtLeastTwoExcellentStudents.stream().forEach(System.out::println);


        Collection<String> groupTitlesWhereStudentsAreMen = service.getGroupTitlesWhereStudentsAreMen();
        System.out.println("\ngroupTitlesWhereStudentsAreMen: ");
        groupTitlesWhereStudentsAreMen.stream().forEach(System.out::println);

        Branch branch = new Branch("branch1");
        Collection<String> studentFullNamesFromSpecifiedBranch = service.getStudentFullNamesFromSpecifiedBranch(branch);
        System.out.println("\nStudents from " + branch.getTitle());
        studentFullNamesFromSpecifiedBranch.stream().forEach(System.out::println);


        Collection<Student> studentsSuitableForArmy = service.getStudentsSuitableForArmy();
        System.out.println("\nstudentsSuitableForArmy");
        studentsSuitableForArmy.stream().forEach(System.out::println);

    }

}