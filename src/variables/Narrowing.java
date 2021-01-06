package variables;

public class Narrowing {
    public static void main(String[] args){
        short x = 900;

        byte b = (byte) x;

        System.out.println(b);

    }
}
