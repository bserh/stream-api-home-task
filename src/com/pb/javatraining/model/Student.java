package com.pb.javatraining.model;

import java.util.Map;

public class Student {

    public String name;
    public String surname;
    public int age;
    public State state;
    public Map<Lesson, Double> marksByLessons;

    public Student(String name, String surname, int age, State state, Map<Lesson, Double> marksByLessons) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.state = state;
        this.marksByLessons = marksByLessons;
    }

    // TODO override equals


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public State getState() {
        return state;
    }

    public Map<Lesson, Double> getMarksByLessons() {
        return marksByLessons;
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", state=" + state +
                '}';
    }
}
