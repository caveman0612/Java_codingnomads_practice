package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input lower and upper bound numbers");
        int lower_num = scanner.nextInt();
        int high_num = scanner.nextInt();
        int sum = 0;
        double average = 0;
        for (int i = lower_num; i <= high_num; i++){
            sum += i;
        }
        double Lower_Num = lower_num;
        double High_Num = high_num;
        average = (Lower_Num + High_Num) / 2;
        System.out.println(average);
        System.out.println(sum);
    }
}
