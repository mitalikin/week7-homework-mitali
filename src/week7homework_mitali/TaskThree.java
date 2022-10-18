package week7homework_mitali;
/**3. Write a java program to input student Name, roll No, and three subjects Math, Science and
      English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
      Input, Marks should between 0 to 100”) and find out total, percentage and result.
      If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
      %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * */
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        String name;
        String result;
        String Grade;
        int rollNo, english, maths, science;
        double per;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Name of student");
        String n = in.nextLine();
        System.out.println("Enter roll no");
        int RollNo = in.nextInt();
        System.out.println("Enter marks for Maths");
        int m = in.nextInt();
        System.out.println("Enter marks for science");
        int s = in.nextInt();
        System.out.println("Enter marks for English");
        int e = in.nextInt();
        int Total = m + s + e;
        double Per = (Total * 100) / 300;
        if (Per >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        if((m<35||s<35||e<35)) {
            result="Fail";
            Grade="";
           }
        if (Per >= 80)
            Grade = "A+";
        else if (Per >= 60)
            Grade = "A";
        else if (Per >= 50)
            Grade = "B";
        else if (Per >= 35)
            Grade = "C";
        else
            Grade = "";

        System.out.println("Name   :    " + n);
        System.out.println("RollNO :  " + RollNo);
        System.out.println("Total marks =" + Total);
        System.out.println("Percentage =" + Per);
        System.out.println("Result" + result);
        System.out.println("Grade =" + Grade);

        System.out.println("-----------------------------------");
        System.out.println("|                                 |");
        System.out.println("|          MARK SHEET             |");
        System.out.println("|_________________________________|");
        System.out.println("|    Name       :" + "          " + n + "    |");
        System.out.println("|    Roll No    :" + "          " + RollNo + "      |");
        System.out.println("|_________________________________|");
        System.out.println("|    Subject    :        Marks    |");
        System.out.println("|_________________________________|");
        System.out.println("|    Math       : " + " " + "        " + m + "     |");
        System.out.println("|    Science    : " + " " + "        " + s + "     |");
        System.out.println("|    English    : " + " " + "        " + e + "     |");
        System.out.println("|_________________________________|");
        System.out.println("|    Total      :   " + "      " + Total + "     |");
        System.out.println("|_________________________________|");
        System.out.println("|    Percentage :   " + "      " + Per + "    |");
        System.out.println("|    Result     :   " + "      " + result + "    |");
        System.out.println("|    Grade      :    " + "     " + Grade + "       |");
        System.out.println("|_________________________________|");
    }
}
