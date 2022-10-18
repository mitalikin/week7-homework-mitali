package week7homework_mitali;

import java.util.Arrays;

//17. Write a Java program to sort a numeric array and a string array.
public class TaskSeventeen {
    public static void main(String[] args) {
        int[] array1 = {11, 15, 13, 20, 16, 14};
        String[] array2 = {"java", "python", "c++", "c programming"};

        System.out.println("original numeric array: " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("sorted numeric array : " + Arrays.toString(array1));

        System.out.println("original string array: " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("sorted string array : " + Arrays.toString(array2));
    }
}
