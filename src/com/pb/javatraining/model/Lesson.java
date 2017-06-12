package com.pb.javatraining.model;

public class Lesson {

    public String title;
    public double credits;

    public Lesson(String title, double credits) {
        this.title = title;
        this.credits = credits;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    // TODO override equals

}
