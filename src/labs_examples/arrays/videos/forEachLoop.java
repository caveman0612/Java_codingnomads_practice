package labs_examples.arrays.videos;

public class forEachLoop {
    public static void main(String[] args) {
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++){
            nums[i] = i * 14;
        }
        for(int elem : nums){
            System.out.println(elem);
        }
        int [][] twoDArray = new int[3][5];

        for(int i = 0; i < twoDArray.length; i++){
            for(int j = 0; j < twoDArray[i].length; j++){
                twoDArray[i][j] = i * j;
            }
        }
        for(int[] vals : twoDArray){
            for (int i : vals){
                System.out.print(i + " ");
            }
            System.out.println("***");
        }
        System.out.println(twoDArray[2][2]);
    }
}
