package com.pb.javatraining.service;

import com.pb.javatraining.model.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
                                                                                        .anyMatch(entry -> entry.getValue()<60)))
                .count();
    }

    public Map<Group, Integer> getAverageMarksWithinGroups() {
        return groups.stream().collect(Collectors.toMap(group -> group,Group::avarageMarksInGroup));
    }


    public Collection<String> getGroupTitlesWhereStudentsAreMen() {

        return groups.stream()
                .filter(group -> group.getStudents().stream().allMatch(student -> student.getState().equals(State.MALE)))
                .map(Group::getTitle)
                .collect(Collectors.toList());
    }

    public Collection<String> getStudentFullNamesFromSpecifiedBranch(Branch branch) {
        return data.stream()
                .filter(x -> x.equals(branch))
                .map(Branch::getGroups)
                .flatMap(Collection::stream)
                .map(Group::getStudents)
                .flatMap(Collection::stream)
                .map(student -> student.getName()+" "+student.getSurname())
                .collect(Collectors.toList());
    }

    public Map<Lesson, Double> getAverageMarksWithinLessons() {
        return groups.stream()
                .map(Group::getStudents)
                .flatMap(Collection::stream)
                .map(student -> student.getMarksByLessons().entrySet())
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.mapping(Map.Entry::getValue,Collectors.averagingDouble(x -> x))));
    }

    public Collection<Student> getStudentsSuitableForArmy() {
        return groups.stream()
                .flatMap(group -> group.getStudents().stream())
                .filter(student -> (student.getAge()>=18 && student.getAge()<=27 && student.getState().equals(State.MALE)))
                .collect(Collectors.toList());
    }

    public Collection<Lesson> getAllLessons() {
        return groups.stream()
                .flatMap(group -> group.getStudents().stream())
                .flatMap(student -> student.getMarksByLessons().entrySet().stream())
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

    public Collection<Group> getGroupsWhereAtLeastTwoExcelentStudents() {
        return groups.stream()
                .filter(group -> group.getStudents().stream()
                                                    .filter(student -> student.avarageMark() >= 90)
                                                    .count() >= 2)
                .collect(Collectors.toList());
    }
}
