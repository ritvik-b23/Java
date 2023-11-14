/* Write a program in java which takes an array of 10 floating point numbers. Find the min,
max and average of the numbers. */

import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] arr = new float[10];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextFloat();
        }

        float min = arr[0], max = arr[0], average = 0;

        for (int i = 0; i < 10; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }

            average += arr[i];
        }

        average = average/10;

        System.out.println("Minimum of arr: "+min);
        System.out.println("Maximum of arr: "+max);
        System.out.println("Average of arr: "+average);
    }
}
