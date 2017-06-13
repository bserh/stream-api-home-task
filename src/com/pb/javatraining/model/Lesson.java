package com.pb.javatraining.model;

import java.util.Objects;

public class Lesson {

    private String title;
    private double credits;

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

    @Override
    public String toString() {
        return title;
    }

    // TODO override equals

    public boolean equals(Lesson lesson){
        return Objects.equals(this.title,lesson.getTitle());
    }

}
