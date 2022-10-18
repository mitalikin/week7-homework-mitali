package week7homework_mitali;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        String city;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character from A to F");
        city = sc.nextLine();

        switch (city) {
            case "A":
                System.out.println("Agra");
                break;
            case "B":
                System.out.println("Bombay");
                break;
            case "C":
                System.out.println("Calcutta");
                break;
            case "D":
                System.out.println("Delhi");
                break;
            case "E":
                System.out.println("France");
                break;
            case "F":
                System.out.println("Baroda");
                break;
            case "G":
                System.out.println("Florida");
                break;
            default:
                System.out.println("Invalid city");
        }
        sc.close();
    }
}

