//package labs_examples.objects_classes_methods.labs.objects;

 class Example {

    public static void main(String[] args){
        Engine myEngine = new Engine(200.5, 150, "mag");
        Radio myRadio = new Radio("maxradio", 400, 87);

        System.out.println(myEngine.toString());
        System.out.println(myRadio.toString());
    }
}

class Engine{
    private double fullCapacity;
    private double topSpeed;
    private String brand;

    public Engine(double fullCapacity, double topSpeed, String brand) {
        this.fullCapacity = fullCapacity;
        this.topSpeed = topSpeed;
        this.brand = brand;
    }
    public double getFullCapacity(){
        return fullCapacity;
    }
    public void setFullCapacity(double fullCapacity) {
        this.fullCapacity = fullCapacity;
    }
    public double getTopSpeed(){
        return topSpeed;
    }
    public void setTopSpeed(double topSpeed){
        this.topSpeed = topSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Engine\n{" +
                "fullCapacity=" + fullCapacity +
                ", topSpeed=" + topSpeed +
                ", brand='" + brand + '\'' +
                '}';
    }
}
class Radio{
    private String brand;
    private double maxRange;
    private int assignedFreq;

    public Radio(String brand, double maxRange, int assignedFreq) {
        this.brand = brand;
        this.maxRange = maxRange;
        this.assignedFreq = assignedFreq;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(double maxRange) {
        this.maxRange = maxRange;
    }

    public int getAssignedFreq() {
        return assignedFreq;
    }

    public void setAssignedFreq(int assignedFreq) {
        this.assignedFreq = assignedFreq;
    }

    @Override
    public String toString() {
        return "Radio\n{" +
                "brand='" + brand + '\'' +
                ", maxRange=" + maxRange +
                ", assignedFreq=" + assignedFreq +
                '}';
    }
}