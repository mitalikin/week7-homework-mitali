
package week7homework_mitali;


import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

public class TaskEight {
    public static void main(String[] args) {

        String ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabet A to F");
        char in = sc.next().charAt(0);
        if (in == 'A') {
            System.out.println("ahmedabad ");
        } else if (in == 'b') {
            System.out.println("Baroda ");

        } else if (in == 'C') {
            System.out.println("Chandigarh");

        } else if (in == 'E') {
            System.out.println("Edinburgh");
        } else if (in == 'D') {
            System.out.println("Delhi");
        } else if (in == 'F') {
            System.out.println("Fiji");
        } else
            System.out.println("invalid entry");
        sc.close();
    }
}