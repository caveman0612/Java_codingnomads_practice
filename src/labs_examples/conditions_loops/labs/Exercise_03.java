package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 * <p>
 * Take in a number from the user and print "January", "February", ... "December", or "Other"
 * if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 */

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" input number for month");
        int month = scanner.nextInt();
//        for (int month = 1; month < 14; month++) {
            switch (month) {
                case 1:
                    System.out.println("jan");
                    break;
                case 2:
                    System.out.println("feb");
                    break;
                case 3:
                    System.out.println("mar");
                    break;
                case 4:
                    System.out.println("apr");
                    break;
                case 5:
                    System.out.println("may");
                    break;
                case 6:
                    System.out.println("jun");
                    break;
                case 7:
                    System.out.println("jul");
                    break;
                case 8:
                    System.out.println("aut");
                    break;
                case 9:
                    System.out.println("sep");
                    break;
                case 10:
                    System.out.println("oct");
                    break;
                case 11:
                    System.out.println("nov");
                    break;
                case 12:
                    System.out.println("dec");
                    break;
                default:
                    System.out.println("out side of range");
            }
//        }
    }

}
