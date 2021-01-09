package labs_examples.arrays.videos;

public class MulitArray {
    public static void main(String[] args) {
//        int [][] vals = new int[4][6];
//
//        int count = 0;
//
//        for (int i = 0; i < vals.length; i++) {
//            for(int x = 0; x < vals[i].length; x++){
//                vals[i][x] = count;
//                count++;
//            }
//        }
//        for (int i = 0; i < vals.length; i++) {
//            for(int x = 0; x < vals[i].length; x++){
//                System.out.print(vals[i][x] + "|");
//            }
//            System.out.println();
//        }

        int[][] NewArray = new int[4][6];

        int count = 0;
        // using a nested for loop, please populate every index in the 2-D Array
        for (int i = 0; i < NewArray.length; i++) {
            for (int x = 0; x < NewArray[i].length; x++) {
                NewArray[i][x] = count;
                count++;
            }
        }

        // once populated, use a nested for loop to print each element in the 2-D array
        for (int i = 0; i < NewArray.length; i++) {
            for (int x = 0; x < NewArray[i].length; x++) {
                System.out.print(NewArray[i][x] + "|");
            }
            System.out.println();
        }
    }
}
