package com.company;

public class Student {
    private String firstname;

    private String lastname;

    private int id; //id is set as an int unlike what the file has told to do

    private double grade;

    public Student(String firstname, String lastname, int id){
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        grade = 0; //initial Grading Maybe Zero.
    }

    public void printStudentInfo(){//prints student info in this class.
        System.out.println(firstname + " " + lastname
        + "\nID: " + id
        + "\nGRADE: " + grade);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
