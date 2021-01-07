package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        Scanner scanner = new Scanner(System.in);
        // 2) prompt user
        System.out.println("input number to get day of the week");
        // 3) assign input to variable as int
        int day = scanner.nextInt();
        // 4) write completed code here
        if (day < 8 && day > 0) {
            if (day == 1) {
                System.out.println("mon");
            }
            if (day == 2) {
                System.out.println("tue");
            }
            if (day == 3) {
                System.out.println("wed");
            }
            if (day == 4) {
                System.out.println("thur");
            }
            if (day == 5) {
                System.out.println("fri");
            }
            if (day == 6) {
                System.out.println("sat");
            }
            if (day == 7) {
                System.out.println("sun");
            }
        }
        else{
            System.out.println("out side of range");
        }

    }
}
