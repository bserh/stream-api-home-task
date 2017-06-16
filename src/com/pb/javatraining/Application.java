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
        //System.out.println(allLessons);

        int amountOfGroupsWhereBadStudents = service.getAmountOfGroupsWhereBadStudents();
        //System.out.println(amountOfGroupsWhereBadStudents);

        Map<Group, Double> averageMarksWithinGroups = service.getAverageMarksWithinGroups();
        //System.out.println(averageMarksWithinGroups.toString());

        Map<Lesson, Double> averageMarksWithinLessons = service.getAverageMarksWithinLessons();
        //System.out.println(averageMarksWithinLessons);

        Collection<Group> groupsWhereAtLeastTwoExcelentStudents = service.getGroupsWhereAtLeastTwoExcelentStudents();
        //System.out.println(groupsWhereAtLeastTwoExcelentStudents);

        Collection<String> groupTitlesWhereStudentsAreMen = service.getGroupTitlesWhereStudentsAreMen();
        //System.out.println(groupTitlesWhereStudentsAreMen);

        Branch branch = new Branch("Branch of economics and management");
        Collection<String> studentFullNamesFromSpecifiedBranch = service.getStudentFullNamesFromSpecifiedBranch(branch);
        //System.out.println(studentFullNamesFromSpecifiedBranch);

        Collection<Student> studentsSuitableForArmy = service.getStudentsSuitableForArmy();
        //System.out.println(studentsSuitableForArmy);
    }

}
