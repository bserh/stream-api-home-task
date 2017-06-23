package com.pb.javatraining.model;

import java.util.Collection;

public class Group {

    public String title;
    public int groupNumber;
    public Collection<Student> students;

    public Group(String title, int groupNumber, Collection<Student> students) {
        this.title = title;
        this.groupNumber = groupNumber;
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public Collection<Student> getStudents() {
        return students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (groupNumber != group.groupNumber) return false;
        if (!title.equals(group.title)) return false;
        return students.equals(group.students);
    }

    @Override
    public String toString() {
        return "Group{" +
                "title='" + title + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
