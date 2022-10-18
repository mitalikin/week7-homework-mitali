package week7homework_mitali;

import com.sun.org.apache.xpath.internal.objects.XNumber;

//16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//“ZERO”
import java.util.Scanner;

public class TaskSixteen {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to check: ");
        number = sc.nextInt();
        if (number > 0) {
            System.out.println(number + " is positive number");
        } else if (number < 0) {
            System.out.println(number + " is negative number");
        } else {
            System.out.println(number + " is zero number ");
        }
    }
}
