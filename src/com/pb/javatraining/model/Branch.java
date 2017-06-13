package com.pb.javatraining.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Branch {

    private String title;
    private Collection<Group> groups = new ArrayList<>();

    public Branch(String title) {
        this.title = title;
    }

    public void addGroup(Group group){
        if (!groups.contains(group))
            groups.add(group);
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

    // TODO override equals

    public boolean equals(Branch branch){
        return Objects.equals(this.title, branch.getTitle());
    }

}
