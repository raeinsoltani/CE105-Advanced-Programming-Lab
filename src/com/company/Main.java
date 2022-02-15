package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please choose between mathematical functions + - * / : ");
        char function = scanner.next().charAt(0);
        System.out.print("Please enter first number: ");
        int var1 = scanner.nextInt();
        System.out.print("Please enter second number: ");
        int var2 = scanner.nextInt();
        double res = Main.calMethod(function, var1, var2);
        System.out.print("Result is: " + res);
    }

    static double calMethod(char function, int var1, int var2){
        double res = 0;
        switch (function){
            case '+' -> res = var1 + var2;
            case '-' -> res = var1 - var2;
            case '*' -> res = var1 * var2;
            case '/' -> res = 1.0* var1 / var2;
        }
        return res;
    }
}
