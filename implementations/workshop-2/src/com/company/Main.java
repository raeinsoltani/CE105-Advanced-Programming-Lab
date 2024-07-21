package com.company;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Ali", "Shamsabadi", 40031070);
        Student student2 = new Student("Dennis", "Ritchie", 11111111);

        student1.setGrade(18);
        student2.setGrade(20);

        student1.printStudentInfo();
        student2.printStudentInfo();
    }
}
