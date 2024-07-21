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

    public void printLabInfo(){
        System.out.println(teacherName+ "'s Lab");
        System.out.println("Lab is held at: " + dayOfWeek + "'s\n");
        System.out.println("Students How enrolled at lab are");
        for (int i = 0; i < currentSize; i++) {
            System.out.println(students[i].getFirstname()
            + students[i].getLastname());
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

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
