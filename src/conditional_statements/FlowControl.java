package conditional_statements;

public class FlowControl {
    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            if (i == 3 || i == 7){
//                continue;
//
//            }
//            System.out.println("i = " + i);
//        }

//        for (int i = 0; i < 10; i++) {
//            if (i == 3 || i == 7) {
//                break;
//
//            }
//            System.out.println("i = " + i);
        int i = someMethod(0);
        System.out.println("i = " + i);
        }




    public static int someMethod(int val) {
        if (val == 0) {
            System.out.println("will this print 0000");
            return 0;
        } else if (val == 1) {
            System.out.println("will this print11111");
            return 1;
        } else {
            System.out.println("will this print-1-1-1-1");
            return -1;
        }

    }
}

