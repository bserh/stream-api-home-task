package com.pb.javatraining.model;

import java.util.Collection;

public class Group {

    private String title;
    private int groupNumber;
    private Collection<Student> students;

    public Group(String title, int groupNumber, Collection<Student> students) {
        this.title = title;
        this.groupNumber = groupNumber;
        this.students = students;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        return title.equals(group.title);
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    @Override
    public String toString() {
        return "Group{" +
                "title='" + title + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
