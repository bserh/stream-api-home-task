package com.pb.javatraining.model;

import java.util.HashMap;
import java.util.Map;

public class Student {

    public String name;
    public String surname;
    public int age;
    public State state;
    public Map<Lesson, Double> marksByLessons = new HashMap<>();

    public Student(String name, String surname, int age, State state) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Map<Lesson, Double> getMarksByLessons() {
        return marksByLessons;
    }

    public void setMarksByLessons(Map<Lesson, Double> marksByLessons) {
        this.marksByLessons = marksByLessons;
    }

    public void addMarksByLessons(Lesson lesson, double mark) {
        this.marksByLessons.put(lesson,mark);
    }

    public Double avarageMark () {
        return marksByLessons.entrySet().stream().mapToDouble(x -> x.getValue()).average().getAsDouble();
    }

    // TODO override equals

}
