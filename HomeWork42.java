package com.itacademy.lesson4;

import java.util.Scanner;

public class HomeWork42 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value:");
        int value = scanner.nextInt();

        int firstFibonacciNumber = 0;
        int secondFibonacciNumber = 1;

        while (firstFibonacciNumber <= value) {

            System.out.println(firstFibonacciNumber);
            int sum = firstFibonacciNumber + secondFibonacciNumber;
            firstFibonacciNumber = secondFibonacciNumber;
            secondFibonacciNumber = sum;

        }

    }

}
