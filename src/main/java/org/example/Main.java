package org.example;

/**
 * Exercise: https://www.youtube.com/watch?v=N9ZYqTm6ZFc&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=11
 * @author Farida Fatali
 */

// Sorting entered 3 numbers from largest to smallest.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the 2nd number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the 3rd number: ");
        int number3 = scanner.nextInt();
        System.out.println();

        int maximum = 0;
        if (number1 > number2 && number1 > number3){
            maximum = number1;
        } else if (number2 > number1 && number2 > number3) {
            maximum = number2;
        } else if(number3 > number1 && number3 > number2){
            maximum = number3;
        }

        int minimum = 0;
        if (number1 < number2 && number1 < number3){
            minimum = number1;
        } else if (number2 < number1 && number2 < number3) {
            minimum = number2;
        } else if(number3 < number1 && number3 < number1){
            minimum = number3;
        }

        int middle = number1 + number2 + number3 - maximum - minimum;
        System.out.println(maximum + "\n" + middle + "\n" + minimum);
    }
}