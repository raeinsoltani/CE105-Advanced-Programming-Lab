package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please choose between mathematical functions + - * / :");
        char function = scanner.next().charAt(0);
    }
}
