package variables;

public class variables {

    //global variable
    static double val = 123.45;

    public static void main(String[] args) {

        person myPerson = new person("kyle", 35);
        person yourPerson = new person("jack", 40);
        person thePerson = new person("dave", 10);
        person ellen = new person("Ellen", 55);

        System.out.println(myPerson.toString());
        System.out.println(yourPerson.toString());
        System.out.println(thePerson.toString());
        System.out.println(ellen.toString());

        double x = multiple(val, val * 2);
    }
    public static double multiple(double a, double b){
        double result = a * b;
        printNum(result);
        return result;
    }
    public static void printNum(double num){
        System.out.println(num);
    }
}
