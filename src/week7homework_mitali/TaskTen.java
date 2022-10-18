package week7homework_mitali;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * , *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class TaskTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number ");
        int num1 = sc.nextInt();
        System.out.println("Input second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter your Symbol: ");
        char ch = sc.next().charAt(0);
        if (ch == '+') {
            int sum = num1 + num2;
            System.out.println("Addition of two number:" + sum);
        } else if (ch == '-') {
            int sub = num1 - num2;
            System.out.println("Difference of two numbers:" + sub);
        } else if (ch == '*') {
            int mul = num1 * num2;
            System.out.println("Multiplication of two numbers:" + mul);
        } else if (ch == '/') {
            int div = num1 / num2;
            System.out.println("Division of two numbers: " + div);
        }
        sc.close();
    }
}
