package com.pb.javatraining.service;

import com.pb.javatraining.model.*;

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

        groups = data.stream()
                .flatMap(group -> group.getGroups().stream())
                .collect(Collectors.toList());

    }

    public int getAmountOfGroupsWhereBadStudents() {
        // TODO

        return (int) groups.stream()
                .filter(group -> group.getStudents().stream()
                        .mapToDouble(student -> student.getMarksByLessons().values().stream()
                                .mapToDouble(value -> value)
                                .average()
                                .getAsDouble())
                        .anyMatch(avr -> avr < 3.0))
                .count();

    }

    public Map<Group, Double> getAverageMarksWithinGroups() {

        // TODO

        return groups.stream()
                .collect(Collectors.toMap(g -> g, g -> g.getStudents().stream()
                        .mapToDouble(student -> student.getMarksByLessons().values()
                                .stream()
                                .mapToDouble(value -> value)
                                .average()
                                .getAsDouble())
                        .average()
                        .getAsDouble()));
    }

    public Collection<String> getGroupTitlesWhereStudentsAreMen() {

        // TODO
        return groups.stream()
                .filter(group -> group.getStudents()
                        .stream()
                        .allMatch(student -> student.getState() == State.MALE))
                .map(Group::getTitle)
                .collect(Collectors.toList());
    }

    public Collection<String> getStudentFullNamesFromSpecifiedBranch(Branch branch) {

        // TODO
        return data.stream()
                .filter(br -> br.getTitle().equals(branch.getTitle()))
                .flatMap(br -> br.getGroups().stream())
                .flatMap(group -> group.getStudents().stream())
                .map(student -> student.getName() + " " + student.getSurname())
                .collect(Collectors.toList());
    }

    public Map<Lesson, Double> getAverageMarksWithinLessons() {

        // TODO


        return getAllLessons().stream()
                .collect(Collectors.toMap(lesson -> lesson, lesson -> groups.stream()
                        .flatMap(group -> group.getStudents().stream())
                        .flatMap(student -> student.getMarksByLessons().entrySet().stream())
                        .filter(l -> l.getKey().equals(lesson))
                        .mapToDouble(Map.Entry::getValue)
                        .average()
                        .getAsDouble()));
    }

    public Collection<Student> getStudentsSuitableForArmy() {

        // TODO

        return groups.stream()
                .flatMap(group -> group.getStudents().stream())
                .filter(student -> student.getState() == State.MALE && student.getAge() >= 18 && student.getAge() < 27)
                .collect(Collectors.toList());
    }

    public Collection<Lesson> getAllLessons() {

        // TODO

        return groups.stream()
                .flatMap(group -> group.getStudents().stream())
                .flatMap(student -> student.getMarksByLessons().entrySet().stream())
                .map(Map.Entry::getKey)
                .distinct()
                .collect(Collectors.toList());
    }

    public Collection<Group> getGroupsWhereAtLeastTwoExcelentStudents() {

        // TODO

        return groups.stream()
                .filter(group -> group.getStudents().stream()
                        .filter(student -> student.getMarksByLessons().values().stream()
                                .mapToDouble(mark -> mark)
                                .average()
                                .getAsDouble() >= 4.5)
                        .count() > 2)
                .collect(Collectors.toList());
    }

}
