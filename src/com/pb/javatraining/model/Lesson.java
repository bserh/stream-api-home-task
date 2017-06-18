package com.pb.javatraining.model;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lesson lesson = (Lesson) o;

        return title.equals(lesson.title);
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "title='" + title + '\'' +
                '}';
    }
}
