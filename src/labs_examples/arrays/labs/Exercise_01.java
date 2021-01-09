package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        int[] List = new int[10];
        for (int i = 0; i < 10; i++){
            Scanner scanner = new Scanner(System.in);
            int var = scanner.nextInt();
            List[i] = var;
        }
        double sum = 0;
        for(double num : List){
            sum += num;
        }
        double average = sum / 10;
        System.out.println(sum);
        System.out.println(average);

    }

}