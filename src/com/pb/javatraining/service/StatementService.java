package com.pb.javatraining.service;

import com.pb.javatraining.model.Branch;
import com.pb.javatraining.model.Group;
import com.pb.javatraining.model.Lesson;
import com.pb.javatraining.model.Student;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;
import static java.util.Collections.emptySet;

public class StatementService {

    private final Collection<Branch> data;
    private List<Group> groups;

    public StatementService() {
        DummyDataService dataService = new DummyDataService();
        this.data = dataService.getDummyData();

        this.groups=data.stream()
                .map(Branch::getGroups)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public int getAmountOfGroupsWhereBadStudents() {

        return (int) groups.stream()
                .filter(group -> group.getStudents().stream()
                                        .anyMatch(student -> student.getMarksByLessons().entrySet().stream()
                                                                                        .anyMatch(x -> x.getValue()<60)))
                .count();
    }

    public Map<Group, Integer> getAverageMarksWithinGroups() {
        //   ??  return data.stream().collect(Collectors.toMap();
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
