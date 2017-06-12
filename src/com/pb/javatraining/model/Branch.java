package com.pb.javatraining.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Branch {

    public String title;
    public Collection<Group> groups = new ArrayList<>();

    public Branch(String title) {
        this.title = title;
    }

    public void addGroups(Group [] groups) {
        Collections.addAll(this.groups, groups);
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



}
