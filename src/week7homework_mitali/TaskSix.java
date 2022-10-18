package week7homework_mitali;

import java.util.Scanner;

//6. Write a java program to input any number and find out if it is odd or even
public class TaskSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any  number: ");
        int number = sc.nextInt();
        sc.close();
        if (number % 2 == 0)
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");
    }
}
