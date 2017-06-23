package com.pb.javatraining.model;

public class Lesson {

    public String title;
    public double credits;

    // TODO override equals


    public Lesson(String title, double credits) {
        this.title = title;
        this.credits = credits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lesson lesson = (Lesson) o;

        if (Double.compare(lesson.credits, credits) != 0) return false;
        return title.equals(lesson.title);
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "title='" + title + '\'' +
                ", credits=" + credits +
                '}';
    }
}
