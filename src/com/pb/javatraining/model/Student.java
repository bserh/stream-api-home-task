package com.pb.javatraining.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {

    private String name;
    private String surname;
    private int age;
    private State state;
    private Map<Lesson, Double> marksByLessons = new HashMap<>();

    public Student(String name, String surname, int age, State state) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.state = state;
    }

    public void addMarkByLesson(Lesson lesson, double mark){
       if (mark >= 0 && mark <= lesson.getCredits())
           marksByLessons.put(lesson, mark);
//        System.out.println(marksByLessons.entrySet().stream().mapToDouble(Map.Entry::getValue).average());
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", state=" + state +
                '}';
    }

    // TODO override equals

    public boolean equals(Student student){
        return Objects.equals(this.name,student.getName())&&
               Objects.equals(this.surname,student.getSurname())&&
               this.age == student.getAge()&&
               this.state == student.getState();
    }

}
