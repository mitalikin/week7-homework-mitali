package week7homework_mitali;
//18. Write a Java program to sum values of an array
public class TaskEighteen {
    public static void main(String[] args) {
        int my_array[] = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i : my_array)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}
