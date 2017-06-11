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
        System.out.println("1. all lessons:");
        allLessons
                .forEach(lesson -> System.out.println("\t" + lesson.getTitle()));
        System.out.println();

        int amountOfGroupsWhereBadStudents = service.getAmountOfGroupsWhereBadStudents();
        System.out.println("2. amount of groups where bad students: " + amountOfGroupsWhereBadStudents);
        System.out.println();

        Map<Group, Integer> averageMarksWithinGroups = service.getAverageMarksWithinGroups();
        System.out.println("3. average marks within groups:");
        averageMarksWithinGroups
                .forEach((k, v) -> System.out.println("\tgroup: " + k.getTitle() + " average mark: " + v));
        System.out.println();

        Map<Lesson, Double> averageMarksWithinLessons = service.getAverageMarksWithinLessons();
        System.out.println("4. average marks within lessons:");
        averageMarksWithinLessons
                .forEach((k, v) -> System.out.println("\tlesson: " + k.getTitle() + " average mark: " + v));
        System.out.println();

        Collection<Group> groupsWhereAtLeastTwoExcelentStudents = service.getGroupsWhereAtLeastTwoExcelentStudents();
        System.out.println("5. groups where at least two excelent students:");
        groupsWhereAtLeastTwoExcelentStudents
                .forEach(group -> System.out.println(group.getTitle()));
        System.out.println();

        Collection<String> groupTitlesWhereStudentsAreMen = service.getGroupTitlesWhereStudentsAreMen();
        System.out.println("6. group titles where students are men:");
        groupTitlesWhereStudentsAreMen
                .forEach(System.out::println);
        System.out.println();

        Branch branch = new Branch("information systems");
        Collection<String> studentFullNamesFromSpecifiedBranch = service.getStudentFullNamesFromSpecifiedBranch(branch);
        System.out.println("7. student full names from specified branch:");
        studentFullNamesFromSpecifiedBranch
                .forEach(System.out::println);
        System.out.println();

        Collection<Student> studentsSuitableForArmy = service.getStudentsSuitableForArmy();
        System.out.println("8. students suitable for army:");
        studentsSuitableForArmy
                .forEach(student -> System.out.println("\t" + student.getSurname() + " "
                        + student.getAge() + " "
                        + student.getState()));

    }
}
