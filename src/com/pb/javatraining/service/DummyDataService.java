package com.pb.javatraining.service;

import com.pb.javatraining.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static java.util.Collections.emptyList;

public class DummyDataService {

    /**
     * Build a collection of university branches contain chains of groups and students within
     */
    public Collection<Branch> getDummyData() {

        //  Each branch should contain at least two groups
        //  Each group should contain at least five students
        //  Each student should contain at least 2 lessons with marks
        //  Additional requirement: each entity should being filled by you

        Student student1 = new Student("Student1 ", "Surname1 ", 20, State.MALE);
        Student student2 = new Student("Student2 ", "Surname2 ", 23, State.MALE);
        Student student3 = new Student("Student3 ", "Surname3 ", 25, State.MALE);
        Student student4 = new Student("Student4 ", "Surname4 ", 23, State.MALE);
        Student student5 = new Student("Student5 ", "Surname5 ", 22, State.MALE);
        Student student6 = new Student("Student6 ", "Surname6 ", 18, State.MALE);
        Student student7 = new Student("Student7 ", "Surname7 ", 16, State.FEMALE);
        Student student8 = new Student("Student8 ", "Surname8 ", 20, State.MALE);
        Student student9 = new Student("Student9 ", "Surname9 ", 18, State.FEMALE);
        Student student10 = new Student("Student10", "Surname10", 19, State.FEMALE);
        Student student11 = new Student("Student11", "Surname11", 20, State.FEMALE);
        Student student12 = new Student("Student12", "Surname12", 18, State.MALE);
        Student student13 = new Student("Student13", "Surname13", 22, State.MALE);
        Student student14 = new Student("Student14", "Surname14", 21, State.FEMALE);
        Student student15 = new Student("Student15", "Surname15", 23, State.MALE);
        Student student16 = new Student("Student16", "Surname16", 17, State.MALE);
        Student student17 = new Student("Student17", "Surname17", 17, State.MALE);
        Student student18 = new Student("Student18", "Surname18", 19, State.FEMALE);
        Student student19 = new Student("Student19", "Surname19", 20, State.FEMALE);
        Student student20 = new Student("Student20", "Surname20", 21, State.FEMALE);


        Lesson lesson1 = new Lesson("Lesson1", 80.0);
        Lesson lesson2 = new Lesson("Lesson2", 95.0);
        Lesson lesson3 = new Lesson("Lesson3", 93.0);
        Lesson lesson4 = new Lesson("Lesson4", 92.0);
        Lesson lesson5 = new Lesson("Lesson5", 86.0);
        Lesson lesson6 = new Lesson("Lesson6", 54.0);
        Lesson lesson7 = new Lesson("Lesson7", 55.0);

        student1.getMarksByLessons().put(lesson1, 60.0);
        student1.getMarksByLessons().put(lesson2, 80.0);
        student1.getMarksByLessons().put(lesson3, 60.0);

        student2.getMarksByLessons().put(lesson1, 88.0);
        student2.getMarksByLessons().put(lesson2, 85.0);
        student2.getMarksByLessons().put(lesson3, 90.0);

        student3.getMarksByLessons().put(lesson1, 95.0);
        student3.getMarksByLessons().put(lesson2, 100.0);
        student3.getMarksByLessons().put(lesson3, 100.0);

        student4.getMarksByLessons().put(lesson1, 91.0);
        student4.getMarksByLessons().put(lesson2, 100.0);
        student4.getMarksByLessons().put(lesson3, 95.0);

        student5.getMarksByLessons().put(lesson1, 87.0);
        student5.getMarksByLessons().put(lesson2, 85.0);
        student5.getMarksByLessons().put(lesson3, 72.0);


        student6.getMarksByLessons().put(lesson3, 100.0);
        student6.getMarksByLessons().put(lesson4, 100.0);
        student6.getMarksByLessons().put(lesson5, 100.0);

        student7.getMarksByLessons().put(lesson3, 95.0);
        student7.getMarksByLessons().put(lesson4, 99.0);
        student7.getMarksByLessons().put(lesson5, 97.0);

        student8.getMarksByLessons().put(lesson3, 10.0);
        student8.getMarksByLessons().put(lesson4, 60.0);
        student8.getMarksByLessons().put(lesson5, 60.0);

        student9.getMarksByLessons().put(lesson3, 80.0);
        student9.getMarksByLessons().put(lesson4, 85.0);
        student9.getMarksByLessons().put(lesson5, 72.0);

        student10.getMarksByLessons().put(lesson3, 88.0);
        student10.getMarksByLessons().put(lesson4, 80.0);
        student10.getMarksByLessons().put(lesson5, 72.0);

        student11.getMarksByLessons().put(lesson4, 50.0);
        student11.getMarksByLessons().put(lesson5, 45.0);
        student11.getMarksByLessons().put(lesson6, 5.0);

        student12.getMarksByLessons().put(lesson4, 68.0);
        student12.getMarksByLessons().put(lesson5, 85.0);
        student12.getMarksByLessons().put(lesson6, 72.0);

        student13.getMarksByLessons().put(lesson4, 60.0);
        student13.getMarksByLessons().put(lesson5, 88.0);
        student13.getMarksByLessons().put(lesson6, 73.0);

        student14.getMarksByLessons().put(lesson4, 62.0);
        student14.getMarksByLessons().put(lesson5, 83.0);
        student14.getMarksByLessons().put(lesson6, 75.0);

        student15.getMarksByLessons().put(lesson4, 89.0);
        student15.getMarksByLessons().put(lesson5, 43.0);
        student15.getMarksByLessons().put(lesson6, 84.0);

        student16.getMarksByLessons().put(lesson5, 90.0);
        student16.getMarksByLessons().put(lesson6, 46.0);
        student16.getMarksByLessons().put(lesson7, 80.0);

        student17.getMarksByLessons().put(lesson5, 97.0);
        student17.getMarksByLessons().put(lesson6, 62.0);
        student17.getMarksByLessons().put(lesson7, 80.0);

        student18.getMarksByLessons().put(lesson5, 30.0);
        student18.getMarksByLessons().put(lesson6, 46.0);
        student18.getMarksByLessons().put(lesson7, 87.0);

        student19.getMarksByLessons().put(lesson5, 95.0);
        student19.getMarksByLessons().put(lesson6, 91.0);
        student19.getMarksByLessons().put(lesson7, 90.0);

        student20.getMarksByLessons().put(lesson5, 90.0);
        student20.getMarksByLessons().put(lesson6, 41.0);
        student20.getMarksByLessons().put(lesson7, 52.0);


        List<Student> students1 = new ArrayList<>(Arrays.asList(
                student1, student2, student3, student4, student5
        ));
        List<Student> students2 = new ArrayList<>(Arrays.asList(
                student6, student7, student8, student9, student10
        ));
        List<Student> students3 = new ArrayList<>(Arrays.asList(
                student11, student12, student13, student14, student15
        ));
        List<Student> students4 = new ArrayList<>(Arrays.asList(
                student16, student17, student18, student19, student20
        ));

        Group group1 = new Group("group1", 1111, students1);
        Group group2 = new Group("group2", 2222, students2);
        Group group3 = new Group("group3", 3333, students3);
        Group group4 = new Group("group4", 4444, students4);

        List<Group> groups1 = new ArrayList<>(Arrays.asList(group1, group2));
        List<Group> groups2 = new ArrayList<>(Arrays.asList(group3, group4));

        Branch branch1 = new Branch("branch1", groups1);
        Branch branch2 = new Branch("branch2", groups2);

        List<Branch> branches = new ArrayList<>(Arrays.asList(branch1,branch2));

        return branches;
    }

}
