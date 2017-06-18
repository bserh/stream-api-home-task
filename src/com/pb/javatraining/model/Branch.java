package com.pb.javatraining.model;

import java.util.ArrayList;
import java.util.Collection;

public class Branch {

    private String title;
    private Collection<Group> groups;

    public Branch(String title, Collection<Group> groups) {
        this.title = title;
        this.groups = groups;
    }

    public Branch(String title) {
        this(title, null);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Collection<Group> getGroups() {
        return groups;
    }

    public void setGroups(Collection<Group> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Branch branch = (Branch) o;

        return title.equals(branch.title);
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}
