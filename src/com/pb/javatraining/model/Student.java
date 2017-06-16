package com.pb.javatraining.model;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;
    private String surname;
    private int age;
    private State state;
    private Map<Lesson, Double> marksByLessons;

    public Student(String name, String surname, int age, State state) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.state = state;
        marksByLessons = new HashMap<>();
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

    public void setMarksByLesson(Lesson lesson, Double mark) {
        marksByLessons.put(lesson,mark);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (!name.equals(student.name)) return false;
        if (!surname.equals(student.surname)) return false;
        if (state != student.state) return false;
        return marksByLessons.equals(student.marksByLessons);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + age;
        result = 31 * result + state.hashCode();
        result = 31 * result + marksByLessons.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", state=" + state +
                ", marksByLessons=" + marksByLessons +
                "}\n";
    }
}
