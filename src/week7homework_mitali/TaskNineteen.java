package week7homework_mitali;

//19. Write a Java program to calculate the average value of array elements
public class TaskNineteen {
    public static void main(String[] args) {
        double[] numbers = {20, 30, 25, 35};
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;
        System.out.format("The average is: %.2f", average);
    }
}
