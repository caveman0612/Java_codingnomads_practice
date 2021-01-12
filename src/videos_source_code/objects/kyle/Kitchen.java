package videos_source_code.objects.kyle;

public class Kitchen {
    DishWasher dishWasher;
    Oven oven;
    Refigerator fridge;
    Sink sink;

    public Kitchen(DishWasher dishWasher, Oven oven, Refigerator fridge, Sink sink) {
        this.dishWasher = dishWasher;
        this.oven = oven;
        this.fridge = fridge;
        this.sink = sink;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setDishWasher(DishWasher dishWasher) {
        this.dishWasher = dishWasher;
    }

    public Oven getOven() {
        return oven;
    }

    public void setOven(Oven oven) {
        this.oven = oven;
    }

    public Refigerator getFridge() {
        return fridge;
    }

    public void setFridge(Refigerator fridge) {
        this.fridge = fridge;
    }

    public Sink getSink() {
        return sink;
    }

    public void setSink(Sink sink) {
        this.sink = sink;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "\ndishWasher=" + dishWasher.toString() +
                ", \noven=" + oven.toString() +
                ", \nfridge=" + fridge.toString() +
                ", \nsink=" + sink.toString() +
                '}';

    }
}
