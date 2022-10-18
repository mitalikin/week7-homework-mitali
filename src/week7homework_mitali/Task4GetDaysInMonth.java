package week7homework_mitali;

import java.util.Scanner;

public class Task4GetDaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int DaysInMonth = 0;
        String MonthOfName = "unknown";
        System.out.println("Input a month number: ");
        int month = input.nextInt();
        System.out.println("Input a year number: ");
        int year = input.nextInt();
        switch (month) {
            case 1:
                MonthOfName = "january";
                DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    DaysInMonth = 29;
                } else {
                    DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "march";
                DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "august";
                DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "november";
                DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "december";
                DaysInMonth = 31;
                break;
        }
        System.out.println(MonthOfName + "" + year + "has" + DaysInMonth + "days\n");
    }
}
