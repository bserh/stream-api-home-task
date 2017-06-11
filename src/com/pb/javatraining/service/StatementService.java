package com.pb.javatraining.service;

import com.pb.javatraining.model.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;
import static java.util.Collections.emptySet;

public class StatementService {

    private final Collection<Branch> data;
    private List<Group> groups = new ArrayList<>();


    public StatementService() {
        DummyDataService dataService = new DummyDataService();
        this.data = dataService.getDummyData();
        getGroups();
    }

    private void getGroups(){
        for (Branch branch: data)
            groups.addAll(branch.getGroups());
    }

    private List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        for (Group group: groups)
            students.addAll(group.getStudents());
        return students;
    }

    public int getAmountOfGroupsWhereBadStudents() {
        return (int) groups.stream()
                .filter(group -> group.getStudents().stream()
                        .mapToDouble(student -> student.getMarksByLessons().entrySet().stream()
                                .mapToDouble(Map.Entry::getValue)
                                .average()
                                .getAsDouble())
                        .anyMatch(average -> average < 60))
                .count();
    }

    public Map<Group, Integer> getAverageMarksWithinGroups() {

        // TODO

        return emptyMap();
    }

    public Collection<String> getGroupTitlesWhereStudentsAreMen() {
       return groups.stream()
                .filter(group -> group.getStudents().stream().
                        allMatch(student -> student.getState() == State.MALE))
                .map(Group::getTitle)
                .collect(Collectors.toList());
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
        return getAllStudents().stream()
                .filter(student -> student.getState() == State.MALE && student.getAge()>=18)
                .collect(Collectors.toList());
    }

    public Collection<Lesson> getAllLessons() {

        // TODO
        
        return emptySet();
    }

    public Collection<Group> getGroupsWhereAtLeastTwoExcelentStudents() {
        return groups.stream()
                .filter(group -> group.getStudents().stream()
                        .filter(student -> student.getMarksByLessons().entrySet().stream()
                                .mapToDouble(Map.Entry::getValue)
                                .average()
                                .getAsDouble()==100)
                        .count()>=2)
                .collect(Collectors.toList());
    }

}
