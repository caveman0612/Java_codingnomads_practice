package conditional_statements;

public class conditionalstatements {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        boolean bool1 = true;
        boolean bool2 = false;


        if (a<b && bool2){
            System.out.println("a is less than b");
        }else if (b > 30){
            System.out.println("a is not less than b");
        }else {
            if (bool1){
                System.out.println("why!!!!!");
                System.out.println("yes!!!!");
            }
            System.out.println("a does not exist");
        }
    }
}
