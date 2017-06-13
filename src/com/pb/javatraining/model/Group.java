package com.pb.javatraining.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Group {

    private String title;
    private int groupNumber;
    private Collection<Student> students =  new ArrayList<>();

    public Group(String title, int groupNumber) {
        this.title = title;
        this.groupNumber = groupNumber;
    }

    public void addStudent(Student student){
       if (!students.contains(student))
           students.add(student);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Collection<Student> getStudents() {
        return students;
    }

    public void setStudents(Collection<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "title='" + title + '\'' +
                ", groupNumber=" + groupNumber +
                ", students=" + students +
                '}';
    }

    // TODO override equals

    public boolean equals(Group group){
        return Objects.equals(title,group.title)&&
               groupNumber == group.groupNumber&&
               students.containsAll(group.students);
    }

}
