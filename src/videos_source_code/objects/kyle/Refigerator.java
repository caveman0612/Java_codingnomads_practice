package videos_source_code.objects.kyle;

public class Refigerator {

    private boolean isDoubleWide;
    private String brand;
    private double volume;

    public Refigerator(boolean isDoubleWIde, String brand, double volume){
        this.isDoubleWide = isDoubleWIde;
        this.brand = brand;
        this.volume = volume;

    }

    public boolean isDoubleWide(){
        return isDoubleWide;
    }
    public void setDoubleWide(boolean isDoubleWide){
        this.isDoubleWide = isDoubleWide;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public double getVolume(){
        return volume;
    }
    public void setVolume(double volume){
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Refigerator{" +
                "isDoubleWide=" + isDoubleWide +
                ", brand='" + brand + '\'' +
                ", volume=" + volume +
                '}';
    }
}
