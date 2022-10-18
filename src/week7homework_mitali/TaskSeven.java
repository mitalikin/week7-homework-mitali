package week7homework_mitali;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class TaskSeven {
    public static void main(String[] args) {
        double commission;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sales ID: ");
        int salesID = sc.nextInt();
        System.out.println("Enter seller's name: ");
        String sellerName = sc.next();
        System.out.println("Enter sales amount: ");
        double Salesamount = sc.nextDouble();
        System.out.println("Enter Basic salary: ");
        int Basicsalary = sc.nextInt();

        if (Salesamount >= 50000) {
            commission = Salesamount * 35 / 100;
            System.out.println("Commission is 35% on more than 50000 sales amount:" + commission);
        } else if (Salesamount >= 30000) {
            commission = Salesamount * 20 / 100;
            System.out.println("Commission is 20% on more than 30000 sales amount" + commission);
        } else if (Salesamount >= 20000) {
            commission = Salesamount * 10 / 100;
            System.out.println("Commission is 10% on more than 20000 sales amount" + commission);
        } else if (Salesamount >= 10000) {
            commission = Salesamount * 5 / 100;
            System.out.println("Commission is 5% on more than 10000 sales amount" + commission);
        } else {
            commission = Salesamount * 2 / 100;
            System.out.println("Commission is 2% on less than 10000 sales amount " + commission);
        }

    }
}
