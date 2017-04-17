package com.example.dadriaunna01.menulesson;

import java.io.Serializable;

/**
 * Created by cmltdstudent on 4/15/17.
 */

public class Student implements Serializable {

    public String name;
    public double grade;
    public int photoId;

    public Student(String name, double grade, int photoId) {
        this.name = name;
        this.grade = grade;
        this.photoId = photoId;
    }


}
