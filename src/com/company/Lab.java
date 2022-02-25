package com.company;

public class Lab {
    private Student[] students;

    private String teacherName;

    private String dayOfWeek; //Day of the week Lab is held at.

    private int maxSize;

    private int currentSize;

    private double avgGrade;

    public Lab(String teacherName, String dayOfWeek, int maxSize){
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        students = new Student[maxSize]; //Used for creating an array of students with max size.
    }
}
