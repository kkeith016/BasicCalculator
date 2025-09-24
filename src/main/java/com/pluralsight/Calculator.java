package com.pluralsight;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       System.out.print("Enter the first number:");
               int num1 = scan.nextInt();

        System.out.print("Enter the second number:");
        int num2 = scan.nextInt();

        System.out.println("Now we will calculate you number");

        int result = num1 * num2;

        System.out.println("The result of multiplying " + num1 + " and " + num2 + " is: " + result);
    }
}
