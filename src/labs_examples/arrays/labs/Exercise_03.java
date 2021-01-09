package labs_examples.arrays.labs;

import java.util.Arrays;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int twoDArray[][] = new int[5][5];
        int multipleOf3 = 0;
        for (int i = 0; i < twoDArray.length; i++){
            for(int j=0; j < twoDArray[i].length; j++){
                twoDArray[i][j] = multipleOf3 += 3;
            }
        }

//        System.out.println(Arrays.deepToString(twoDArray));


        for(int[] rows : twoDArray){
            for (int columns : rows){
                System.out.print(columns + "|");
            }
            System.out.println();
        }

        
    }
}
