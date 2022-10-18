package week7homework_mitali;
/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        sc.close();
        String result = number % 2 == 0 ? "Even" : "odd";
        System.out.println(number + " is " + result);
    }
}
