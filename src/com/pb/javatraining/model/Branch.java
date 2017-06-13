package com.pb.javatraining.model;

import java.util.ArrayList;
import java.util.Collection;

public class Branch {

    private String title;
    private Collection<Group> groups;

    public Branch(String title) {
        this.title = title;
        groups = new ArrayList<>();
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

    public void setGroups(Group group) {
        groups.add(group);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Branch branch = (Branch) o;

        if (!title.equals(branch.title)) return false;
        return groups.equals(branch.groups);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + groups.hashCode();
        return result;
    }
}
