package variable_scope;

public class VariableScope {

    static int globalVar = 10;

    public static void main(String[] args){
        Vehicles myCar = new Vehicles();
        myCar.make = "Nissan";
        myCar.model = "Xterra";
        myCar.year = 1970;

        if (myCar.make.equalsIgnoreCase("Toyota")){
            String message = "its a Toyota";
            System.out.println(message);
        }
    }

    public static int multiply(int a, int b){

        int result = a * b * globalVar;
        return result;
    }
    public static int divid (int a, int b){
        int val = globalVar / a / b;
        return val;
    }
}
