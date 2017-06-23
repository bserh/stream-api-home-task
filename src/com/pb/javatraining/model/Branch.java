package com.pb.javatraining.model;

import java.util.Collection;

public class Branch {

    public String title;
    public Collection<Group> groups;

    // TODO override equals


    public Branch(String title) {
        this.title = title;
    }

    public Branch(String title, Collection<Group> groups) {
        this.title = title;
        this.groups = groups;
    }

    public String getTitle() {
        return title;
    }

    public Collection<Group> getGroups() {
        return groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Branch branch = (Branch) o;

        if (!title.equals(branch.title)) return false;
        return groups.equals(branch.groups);
    }
}
