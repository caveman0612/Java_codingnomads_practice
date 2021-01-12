package videos_source_code.objects.kyle;

public class Sink {
    private  boolean dualSink;
    private String brand;
    private String basicType;

    public Sink(boolean dualSink, String brand, String basicType) {
        this.dualSink = dualSink;
        this.brand = brand;
        this.basicType = basicType;
    }

    public boolean isDualSink() {
        return dualSink;
    }

    public void setDualSink(boolean dualSink) {
        this.dualSink = dualSink;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBasicType() {
        return basicType;
    }

    public void setBasicType(String basicType) {
        this.basicType = basicType;
    }

    @Override
    public String toString() {
        return "Sink{" +
                "dualSink=" + dualSink +
                ", brand='" + brand + '\'' +
                ", basicType='" + basicType + '\'' +
                '}';
    }
}
