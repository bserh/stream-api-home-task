package com.pb.javatraining.service;

import com.pb.javatraining.model.*;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StatementService {

    private final Collection<Branch> data;
    private List<Group> groups;

    public StatementService() {
        DummyDataService dataService = new DummyDataService();
        this.data = dataService.getDummyData();

        groups = data.stream()
                .map(Branch::getGroups)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public int getAmountOfGroupsWhereBadStudents() {
        int countGroupsWithBadStudents = 0;

        for (Group group : groups) {
          if (group.getStudents().stream()
                    .filter(student -> student.getMarksByLessons()
                            .entrySet()
                            .stream()
                            .mapToDouble(Entry::getValue)
                            .average()
                            .orElse(0d) < 50)
                  .count() > 0) {

              countGroupsWithBadStudents++;
          }

        }
        return countGroupsWithBadStudents;
    }

    public Map<Group, Integer> getAverageMarksWithinGroups() {
        Map<Group, Double> groupDoubleMap = groups
                .stream()
                .collect(Collectors.
                        toMap(group -> group,
                                group -> group.getStudents()
                                        .stream().map(student -> student.getMarksByLessons().entrySet()
                                                .stream()
                                                .mapToDouble(Entry::getValue)
                                                .average()
                                                .orElse(new Double(0)))
                                        .mapToInt(Double::intValue)
                                        .average().orElse(new Double(0))
                        ));


        return groupDoubleMap.entrySet()
                .stream().sorted(Comparator.comparing(Entry::getValue))
                .collect(Collectors.toMap(Entry::getKey,
                                        i -> i.getValue().intValue()
                ));
    }

    public Collection<String> getGroupTitlesWhereStudentsAreMen() {
       return groups.stream()
               .filter(group -> group.getStudents().stream().filter(student -> student.getState()== State.FEMALE).count() == 0)
               .collect(Collectors.toList())
               .stream()
               .map(Group::getTitle)
               .collect(Collectors.toList());
    }

    public Collection<String> getStudentFullNamesFromSpecifiedBranch(Branch branch) {
        data.stream()
                .filter(b-> b.getTitle().equals(branch.getTitle()))
                .findAny()
                .orElseThrow(()->new RuntimeException("branch is absent"));

        return  data.stream()
                .filter(b -> b.getTitle().equals(branch.getTitle()))
                .map(Branch::getGroups)
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                .stream()
                .map(Group::getStudents)
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                .stream()
                .map(student -> student.getName() +" "+ student.getSurname())
                .collect(Collectors.toList());
    }

    public Map<Lesson, Double> getAverageMarksWithinLessons() {
       return groups.stream()
                .map(Group::getStudents)
                .flatMap(Collection::stream)
                .collect(Collectors.toList()).stream()
                .map(student -> student.getMarksByLessons().entrySet())
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(Entry::getKey, Collectors.mapping(Map.Entry::getValue,Collectors.averagingDouble(p->p))));
    }

    public Collection<Student> getStudentsSuitableForArmy() {
        return groups.stream()
                .map(Group::getStudents)
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                .stream()
                .filter(student -> student.getAge() > 17 & student.getAge() <  21 & student.getState() == State.MALE)
                .sorted(Comparator.comparing(Student::getAge))
                .collect(Collectors.toList());
    }

    public Collection<Lesson> getAllLessons() {
        return groups.stream()
                .map(Group::getStudents)
                .flatMap(Collection::stream)
                .collect(Collectors.toList()).stream()
                .map(student -> student.getMarksByLessons().entrySet())
                .flatMap(Collection::stream)
                .map(Entry::getKey).collect(Collectors.toList())
                .stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public Collection<Group> getGroupsWhereAtLeastTwoExcellentStudents() {
        groups.stream()
                .filter(group -> group.getStudents()
                        .stream()
                        .filter(student -> student.getMarksByLessons()
                                .entrySet()
                                .stream()
                                .mapToDouble(Entry::getValue)
                                .average()
                                .orElse(0d) > 90).count() >= 2)
                .findAny()
                .orElseThrow(()-> new RuntimeException("Not groups with excellent students"));

        return groups.stream()
                .filter(group -> group.getStudents()
                        .stream()
                        .filter(student -> student.getMarksByLessons()
                                .entrySet()
                                .stream()
                                .mapToDouble(Entry::getValue)
                                .average()
                                .orElse(0d) > 90).count() >= 2)
                .collect(Collectors.toList());
    }
}
