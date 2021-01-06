package conditional_statements;

public class whileloop {

    public static void main(String[] args) {

        int count = 0;
        int inner_count = 0;

        while (count <= 10){
            while (inner_count < 10) {
                System.out.println("count is " + count + " inner count is " + inner_count);

                inner_count++;
            }
            inner_count = 0;
            count++;
        }

    }
}
