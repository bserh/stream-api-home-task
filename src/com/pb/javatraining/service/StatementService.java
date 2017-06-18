package com.pb.javatraining.service;

import com.pb.javatraining.model.*;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

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

        return (int) data.stream()
                .flatMap(branch -> branch.getGroups().stream())
                .filter(group -> group.getStudents().stream()
                        .mapToDouble(student -> student.getMarksByLessons().values().stream()
                                .mapToDouble(value -> value)
                                .min()
                                .getAsDouble()
                        )
                        .anyMatch(minMark -> minMark < 60.0))
                .count();
    }

    public Map<Group, Double> getAverageMarksWithinGroups() {

        return data.stream().flatMap(branch -> branch.getGroups().stream())
                .collect(Collectors.toMap(group -> group,
                        group -> group.getStudents()
                                .stream()
                                .mapToDouble(value -> (int) value.getMarksByLessons()
                                        .values()
                                        .stream()
                                        .mapToDouble(mark -> mark)
                                        .average()
                                        .getAsDouble())
                                .average()
                                .getAsDouble()
                ));

    }

    public Collection<String> getGroupTitlesWhereStudentsAreMen() {

        return data.stream()
                .flatMap(branch -> branch.getGroups().stream())
                .filter(group -> group.getStudents()
                        .stream()
                        .allMatch(student -> student.getState().equals(State.MALE)))
                .map(group -> group.getTitle())
                .collect(Collectors.toList());

    }

    public Collection<String> getStudentFullNamesFromSpecifiedBranch(Branch branch) {

        return data.stream()
                .filter(branch1 -> branch.equals(branch1))
                .flatMap(branch1 -> branch1.getGroups().stream())
                .flatMap(group -> group.getStudents().stream())
                .map(student -> student.getName() + " " + student.getSurname())
                .collect(Collectors.toList());

    }

    public Map<Lesson, Double> getAverageMarksWithinLessons() {

        return getAllLessons().stream()
                .collect(Collectors.toMap(lesson -> lesson,
                        lesson -> data.stream()
                                .flatMap(branch -> branch.getGroups().stream())
                                .flatMap(group -> group.getStudents().stream())
                                .flatMap(student -> student.getMarksByLessons().entrySet().stream())
                                .filter(l -> l.getKey().equals(lesson))
                                .mapToDouble(Map.Entry::getValue)
                                .average()
                                .orElse(0.0)
                ));

    }

    public Collection<Student> getStudentsSuitableForArmy() {

        return data.stream()
                .flatMap(branch -> branch.getGroups().stream())
                .flatMap(group -> group.getStudents().stream())
                .filter(student -> student.getAge() >= 20 && student.getState().equals(State.MALE))
                .collect(Collectors.toList());
    }

    public Collection<Lesson> getAllLessons() {

        return data.stream()
                .flatMap(branch -> branch.getGroups().stream())
                .flatMap(group -> group.getStudents().stream())
                .flatMap(student -> student.getMarksByLessons().keySet().stream())
                .collect(Collectors.toSet());

    }

    public Collection<Group> getGroupsWhereAtLeastTwoExcelentStudents() {

        return data.stream()
                .flatMap(branch -> branch.getGroups().stream())
                .filter(group -> group.getStudents().stream()
                        .filter(student -> student.getMarksByLessons().values().stream()
                                .mapToDouble(value -> value)
                                .average()
                                .getAsDouble() > 90.0)
                        .count() >= 2)
                .collect(Collectors.toList());

    }

}
