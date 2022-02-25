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
        grade = 0;
    }

}
