package com.pb.javatraining.model;

import java.util.ArrayList;
import java.util.Collection;

public class Group {

    private String title;
    private int groupNumber;
    private Collection<Student> students;

    public Group(String title, int groupNumber) {
        this.title = title;
        this.groupNumber = groupNumber;
        students = new ArrayList<>();
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

    // TODO override

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (groupNumber != group.groupNumber) return false;
        if (title != null ? !title.equals(group.title) : group.title != null) return false;
        return students != null ? students.equals(group.students) : group.students == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + groupNumber;
        result = 31 * result + (students != null ? students.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Group{" +
                "title='" + title + '\'' +
                ", groupNumber=" + groupNumber +
                ", students=" + students +
                '}';
    }
}
