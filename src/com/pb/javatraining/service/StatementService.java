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
        groups = data.stream()
                .flatMap(branch -> branch.getGroups().stream())
                .collect(Collectors.toList());
    }

    private List<Student> getAllStudents(){
        return groups.stream()
                .flatMap(group -> group.getStudents().stream())
                .collect(Collectors.toList());
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



    public Map<Group, Double> getAverageMarksWithinGroups() {
        return groups.stream().collect(Collectors.toMap(group -> group,
                group ->  group.getStudents().stream()
                        .mapToDouble(student -> student.getMarksByLessons().entrySet().stream()
                                .mapToDouble(Map.Entry::getValue)
                                .average()
                                .getAsDouble())
                        .average()
                        .getAsDouble()));
    }

    public Collection<String> getGroupTitlesWhereStudentsAreMen() {
       return groups.stream()
                .filter(group -> group.getStudents().stream().
                        allMatch(student -> student.getState() == State.MALE))
                .map(Group::getTitle)
                .collect(Collectors.toList());
    }

    public Collection<String> getStudentFullNamesFromSpecifiedBranch(Branch branch) {
        return data.stream()
                .filter(b -> b.equals(branch))
                .flatMap(b -> b.getGroups().stream())
                .flatMap(group -> group.getStudents().stream())
                .map(student -> student.getName() + " " + student.getSurname())
                .collect(Collectors.toList());
    }

    public Map<Lesson, Double> getAverageMarksWithinLessons() {
        return getAllLessons().stream()
                .collect(Collectors.toMap(lesson -> lesson, lesson -> getAllStudents().stream()
                        .flatMap(student -> student.getMarksByLessons().entrySet().stream())
                        .filter(l -> l.getKey().equals(lesson))
                        .mapToDouble(Map.Entry::getValue)
                        .average()
                        .getAsDouble()));
    }

    public Collection<Student> getStudentsSuitableForArmy() {
        return getAllStudents().stream()
                .filter(student -> student.getState() == State.MALE && student.getAge()>=18)
                .collect(Collectors.toList());
    }

    public Collection<Lesson> getAllLessons() {
        return   getAllStudents().stream()
                .flatMap(student -> student.getMarksByLessons().entrySet().stream())
                .map(Map.Entry::getKey)
                .distinct()
                .collect(Collectors.toList());
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
