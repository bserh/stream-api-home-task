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
        return marksByLessons.entrySet().stream().mapToDouble(Map.Entry::getValue).average().getAsDouble();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", state=" + state +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (surname != null ? !surname.equals(student.surname) : student.surname != null) return false;
        if (state != student.state) return false;
        return marksByLessons != null ? marksByLessons.equals(student.marksByLessons) : student.marksByLessons == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (marksByLessons != null ? marksByLessons.hashCode() : 0);
        return result;
    }
}
