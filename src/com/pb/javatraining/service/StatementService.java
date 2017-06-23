package com.pb.javatraining.service;

import com.pb.javatraining.model.*;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;
import static java.util.Collections.emptySet;

public class StatementService {

    private final Collection<Branch> data;
    private List<Group> groupList;
    private List<Student> studentList;

    public StatementService() {
        DummyDataService dataService = new DummyDataService();
        this.data = dataService.getDummyData();

        groupList = data.stream()
                .map(b -> b.getGroups())
                .flatMap(l -> l.stream())
                .collect(Collectors.toList());

        studentList = groupList.stream()
                .map(group -> group.getStudents())
                .flatMap(s -> s.stream())
                .collect(Collectors.toList());
    }

    public int getAmountOfGroupsWhereBadStudents() {
        int count = 0;

        for (Group g : groupList) {
            if (
                    g.getStudents().stream()
                            .filter(student -> student.getMarksByLessons()
                                    .entrySet()
                                    .stream()
                                    .mapToDouble(entry -> entry.getValue())
                                    .average()
                                    .orElse(0.0) < 60.0)
                            .count() > 0) {
                count++;
            }
        }
        return count;
    }

    public Map<Group, Integer> getAverageMarksWithinGroups() {
        Map<Group, Double> groupDoubleMap = groupList
                .stream()
                .collect(Collectors.
                        toMap(group -> group,
                                group -> group.getStudents()
                                        .stream().map(student -> student.getMarksByLessons().entrySet()
                                                .stream()
                                                .mapToDouble(Map.Entry::getValue)
                                                .average()
                                                .orElse(new Double(0.0)))
                                        .mapToInt(Double::intValue)
                                        .average().orElse(new Integer(0))
                        ));


        return groupDoubleMap.entrySet()
                .stream().sorted(Comparator.comparing(Map.Entry::getValue))
                .collect(Collectors.toMap(Map.Entry::getKey,
                        i -> i.getValue().intValue()
                ));
    }

    public Collection<String> getGroupTitlesWhereStudentsAreMen() {
        List<Group> tmpGrpList = groupList.stream()
                .filter(group -> group.getStudents().stream()
                        .allMatch(student -> student.getState() == State.MALE))
                .collect(Collectors.toList());

        return tmpGrpList.stream()
                .map(group -> group.getTitle())
                .collect(Collectors.toList());
    }

    public Collection<String> getStudentFullNamesFromSpecifiedBranch(Branch branch) {

        List<Group> tmpBranches = data.stream()
                .filter(b -> b.getTitle().equals(branch.getTitle()))
                .map(b1 -> b1.getGroups())
                .flatMap(groups -> groups.stream())
                .collect(Collectors.toList());

        Collection<String> studentFullName = tmpBranches.stream()
                .map(g -> g.getStudents())
                .flatMap(g -> g.stream())
                .collect(Collectors.toList())
                .stream()
                .map(student -> "Name: " + student.getName() + " Surname: " + student.getSurname())
                .collect(Collectors.toList());

        return studentFullName;
    }

    public Map<Lesson, Double> getAverageMarksWithinLessons() {

        return studentList.stream()
                .map(student -> student.getMarksByLessons().entrySet())
                .flatMap(mark -> mark.stream())
                .collect(Collectors.groupingBy(e -> e.getKey(),
                        Collectors.mapping(e -> e.getValue(),
                                Collectors.averagingDouble(p -> p))));
    }

    public Collection<Student> getStudentsSuitableForArmy() {

        return studentList.stream()
                .filter(student -> student.getAge() >= 18
                        && student.getAge() <= 27
                        && student.getState() == State.MALE)
                .collect(Collectors.toList());
    }

    public Collection<Lesson> getAllLessons() {

        Set<Lesson> lessonList = studentList.stream()
                .map(student -> student.getMarksByLessons().entrySet())
                .flatMap(m -> m.stream())
                .map(entry -> entry.getKey())
                .collect(Collectors.toSet());

        return lessonList;
    }

    public Collection<Group> getGroupsWhereAtLeastTwoExcelentStudents() {

        return groupList.stream()
                .filter(group -> group.getStudents()
                        .stream()
                        .filter(student -> student.getMarksByLessons()
                                .entrySet()
                                .stream()
                                .mapToDouble(entry -> entry.getValue())
                                .average()
                                .orElse(0.0) >= 90.0)
                        .count() >= 2)
                .collect(Collectors.toList());

    }

}
