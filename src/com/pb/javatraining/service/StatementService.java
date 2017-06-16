package com.pb.javatraining.service;

import com.pb.javatraining.model.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import static java.util.Collections.*;

public class StatementService {

    private final Collection<Branch> data;
    private List<Group> groups;
    private List<Student> students;

    public StatementService() {
        DummyDataService dataService = new DummyDataService();
        this.data = dataService.getDummyData();

        groups = data.stream().flatMap(branch -> branch.getGroups().stream()).collect(Collectors.toList());
    }

    public int getAmountOfGroupsWhereBadStudents() {

        return (int)groups.stream()
                .flatMap(group -> group.getStudents().stream())
                .flatMap(student -> student.getMarksByLessons().values().stream())
                .filter(aDouble -> aDouble.doubleValue()<=3)
                .count();

    }

    public Map<Group, Double> getAverageMarksWithinGroups() {

        return groups.stream()
                .collect(Collectors.toMap(group -> group, group2 -> group2
                        .getStudents().stream()
                        .mapToDouble(g -> g
                                .getMarksByLessons()
                                .values().stream()
                                .mapToDouble(e -> e)
                                .average()
                                .getAsDouble())
                        .average()
                        .getAsDouble()));

    }

    public Collection<String> getGroupTitlesWhereStudentsAreMen() {

        return groups.stream()
                .filter(group -> group
                        .getStudents().stream()
                        .allMatch(student -> student
                                .getState() == State.MALE))
                .map(Group::getTitle)
                .collect(Collectors.toList());

    }

    public Collection<String> getStudentFullNamesFromSpecifiedBranch(Branch branch) {

        return data.stream()
                .filter(bran -> bran.getTitle().equals(branch.getTitle()))
                .flatMap(branch1 -> branch1.getGroups().stream())
                .flatMap(group -> group.getStudents().stream())
                .map(student -> student.getName() + " " + student.getSurname())
                .collect(Collectors.toList());

    }

    public Map<Lesson, Double> getAverageMarksWithinLessons() {

        return getAllLessons().stream().collect(Collectors.toMap(lesson -> lesson, lesson -> groups.stream()
                .flatMap(group -> group.getStudents().stream())
                .flatMap(student -> student.getMarksByLessons().entrySet().stream())
                .filter(lesson2 -> lesson2.getKey().equals(lesson))
                .mapToDouble(value -> value.getValue())
                .average()
                .getAsDouble()));

    }

    public Collection<Student> getStudentsSuitableForArmy() {

        return groups.stream()
                .flatMap(group -> group.getStudents().stream()
                        .filter(student -> student.getAge() >= 20))
                .filter(student -> student.getState() == State.MALE)
                .collect(Collectors.toList());
    }

    public Collection<Lesson> getAllLessons() {

        return groups.stream()
                .flatMap(group -> group
                        .getStudents().stream()
                        .flatMap(student -> student
                                .getMarksByLessons()
                                .keySet().stream()))
                .distinct()
                .collect(Collectors.toList());

    }

    public Collection<Group> getGroupsWhereAtLeastTwoExcelentStudents() {

        return groups.stream().peek(group -> group.getStudents().stream()
                .filter(student -> student.getMarksByLessons().values().stream()
                        .filter(value -> value.doubleValue() == 5)
                        .mapToDouble(value -> value.doubleValue())
                        .count() >= 2))
                .collect(Collectors.toList());

    }

}
