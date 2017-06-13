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

        System.out.println(" <<< All lessons >>>");
        Collection<Lesson> allLessons = service.getAllLessons();
        allLessons.forEach(System.out::println);

        System.out.print("\n <<< Amount of groups where bad students: ");
        int amountOfGroupsWhereBadStudents = service.getAmountOfGroupsWhereBadStudents();
        System.out.println(amountOfGroupsWhereBadStudents);

        System.out.println("\n <<< Average marks within groups >>>");
        Map<Group, Double> averageMarksWithinGroups = service.getAverageMarksWithinGroups();
        averageMarksWithinGroups.forEach((g,m) -> System.out.println(g.getTitle()+" "+m));

        System.out.println("\n <<< Average marks within lessons >>>");
        Map<Lesson, Double> averageMarksWithinLessons = service.getAverageMarksWithinLessons();
        averageMarksWithinLessons.forEach((l,m) -> System.out.println(l.getTitle()+" "+m));

        System.out.println("\n <<< Groups where at least two excelent students >>>");
        Collection<Group> groupsWhereAtLeastTwoExcelentStudents = service.getGroupsWhereAtLeastTwoExcelentStudents();
        groupsWhereAtLeastTwoExcelentStudents.forEach(System.out::println);

        System.out.println("\n <<< Group titles where students are men >>>");
        Collection<String> groupTitlesWhereStudentsAreMen = service.getGroupTitlesWhereStudentsAreMen();
        groupTitlesWhereStudentsAreMen.forEach(System.out::println);

        System.out.println("\n <<< Student full names from specified branch >>>");
        Branch branch = new Branch("IKITN"); // TODO initialize your branch and pass it to #getStudentFullNamesFromSpecifiedBranch in afterwards
        Collection<String> studentFullNamesFromSpecifiedBranch = service.getStudentFullNamesFromSpecifiedBranch(branch);
        studentFullNamesFromSpecifiedBranch.forEach(System.out::println);

        System.out.println("\n <<< Students suitable for army >>>>");
        Collection<Student> studentsSuitableForArmy = service.getStudentsSuitableForArmy();
        studentsSuitableForArmy.forEach(System.out::println);

    }

}
