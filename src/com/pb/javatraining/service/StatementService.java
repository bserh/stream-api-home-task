package com.pb.javatraining.service;

import com.pb.javatraining.model.Branch;
import com.pb.javatraining.model.Group;
import com.pb.javatraining.model.Lesson;
import com.pb.javatraining.model.Student;

import java.util.Collection;
import java.util.Map;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;
import static java.util.Collections.emptySet;

public class StatementService {

    private final Collection<Branch> data;

    public StatementService() {
        DummyDataService dataService = new DummyDataService();
        this.data = dataService.getDummyData();
    }

    public int getAmountOfGroupsWhereBadStudents() {

        // TODO

        return 0;
    }

    public Map<Group, Integer> getAverageMarksWithinGroups() {

        // TODO

        return emptyMap();
    }

    public Collection<String> getGroupTitlesWhereStudentsAreMen() {

        // TODO

        return emptyList();
    }

    public Collection<String> getStudentFullNamesFromSpecifiedBranch(Branch branch) {

        // TODO

        return emptyList();
    }

    public Map<Lesson, Double> getAverageMarksWithinLessons() {

        // TODO

        return emptyMap();
    }

    public Collection<Student> getStudentsSuitableForArmy() {

        // TODO

        return emptyList();
    }

    public Collection<Lesson> getAllLessons() {

        // TODO

        return emptySet();
    }

    public Collection<Group> getGroupsWhereAtLeastTwoExcelentStudents() {

        // TODO

        return emptyList();
    }

}
