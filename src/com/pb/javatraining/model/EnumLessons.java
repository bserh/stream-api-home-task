package com.pb.javatraining.model;

/**
 * Created by dima on 11.06.17.
 */
public enum  EnumLessons {
    ALGEBRA("Algebra",100),
    PHYSICS("Physics",99),
    GEOMETRY("Geometry",98),
    COMPUTER_SCIENCE("Computer Science",110);

    private final Lesson lesson;
   EnumLessons(String title,int credit){
       this.lesson = new Lesson(title, credit);
   }

    public Lesson getLesson() {
        return lesson;
    }
}
