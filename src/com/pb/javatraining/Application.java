package com.pb.javatraining;

import com.pb.javatraining.model.Branch;
import com.pb.javatraining.model.Group;
import com.pb.javatraining.model.Lesson;
import com.pb.javatraining.model.Student;
import com.pb.javatraining.service.StatementService;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {


        StatementService service = new StatementService();

        // Get data to produce statement in further
        Collection<Lesson> allLessons = service.getAllLessons();

        int amountOfGroupsWhereBadStudents = service.getAmountOfGroupsWhereBadStudents();

        Map<Group, Double> averageMarksWithinGroups = service.getAverageMarksWithinGroups();

        Map<Lesson, Double> averageMarksWithinLessons = service.getAverageMarksWithinLessons();

        Collection<Group> groupsWhereAtLeastTwoExcelentStudents = service.getGroupsWhereAtLeastTwoExcelentStudents();

        Collection<String> groupTitlesWhereStudentsAreMen = service.getGroupTitlesWhereStudentsAreMen();

        Branch branch = new Branch("IKITN"); // TODO initialize your branch and pass it to #getStudentFullNamesFromSpecifiedBranch in afterwards
        Collection<String> studentFullNamesFromSpecifiedBranch = service.getStudentFullNamesFromSpecifiedBranch(branch);

        Collection<Student> studentsSuitableForArmy = service.getStudentsSuitableForArmy();
    }

}
