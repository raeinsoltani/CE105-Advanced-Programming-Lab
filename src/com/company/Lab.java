package com.company;

public class Lab {
    private Student[] students;

    private String teacherName;

    private String dayOfWeek; //Day of the week Lab is held at.

    private int maxSize;

    private int currentSize;

    private double avgGrade = 0;

    public Lab(String teacherName, String dayOfWeek, int maxSize){
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        students = new Student[maxSize]; //Used for creating an array of students with max size.
        currentSize = 0;
    }

    public void enrollStudent(Student student){
        if (currentSize < maxSize){
            students[currentSize] = student;
            currentSize +=  1;
        }
        else{
            System.out.println("Max Size of Lab Class has been reached!");
        }
    }

    public void calAvg(){
        for (int i = 0; i < currentSize; i++) {
            avgGrade += students[i].getId();
        }
    }

    public double getAvgGrade() {
        if (avgGrade == 0){
            System.out.println("Please Use calAvg method first, then recall this method");
            return 0;
        }
        else{
            return avgGrade;
        }
    }
}
