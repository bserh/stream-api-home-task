package com.pb.javatraining;

import com.pb.javatraining.model.Branch;
import com.pb.javatraining.model.Group;
import com.pb.javatraining.model.Lesson;
import com.pb.javatraining.model.Student;
import com.pb.javatraining.service.StatementService;

import java.util.Collection;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        StatementService service = new StatementService();

        // Get data to produce statement in further
        Collection<Lesson> allLessons = service.getAllLessons();
        System.out.println("Lessons: ");
        allLessons.forEach(System.out::println);

        int amountOfGroupsWhereBadStudents = service.getAmountOfGroupsWhereBadStudents();
        System.out.println("Amount of groups where bad students is " + amountOfGroupsWhereBadStudents);

        Map<Group, Integer> averageMarksWithinGroups = service.getAverageMarksWithinGroups();
        System.out.println("Average marks within groups");
        averageMarksWithinGroups.forEach((k, v) -> System.out.println(k + " " + v));

        Map<Lesson, Double> averageMarksWithinLessons = service.getAverageMarksWithinLessons();
        System.out.println("Average marks within lessons");
        averageMarksWithinLessons.forEach((k, v) -> System.out.println(k + " " + v));

        Collection<Group> groupsWhereAtLeastTwoExcelentStudents = service.getGroupsWhereAtLeastTwoExcelentStudents();
        System.out.println("Groups Where At Least Two Excelent Students");
        groupsWhereAtLeastTwoExcelentStudents.forEach(System.out::println);

        Collection<String> groupTitlesWhereStudentsAreMen = service.getGroupTitlesWhereStudentsAreMen();
        System.out.println("Group Titles Where Students Are Men");
        groupTitlesWhereStudentsAreMen.forEach(System.out::println);

        Branch branch = new Branch("FKN"); // TODO initialize your branch and pass it to #getStudentFullNamesFromSpecifiedBranch in afterwards
        Collection<String> studentFullNamesFromSpecifiedBranch = service.getStudentFullNamesFromSpecifiedBranch(branch);
        System.out.println("Student Full Names From branch " + branch.getTitle());
        studentFullNamesFromSpecifiedBranch.forEach(System.out::println);

        Collection<Student> studentsSuitableForArmy = service.getStudentsSuitableForArmy();
        System.out.println("Students Suitable For Army ");
        studentsSuitableForArmy.forEach(System.out::println);
    }

}
