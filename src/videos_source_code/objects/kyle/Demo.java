package videos_source_code.objects.kyle;

public class Demo {
    public static void main(String[] args) {
        Oven myOven = new Oven(true, 500, "GE");
        DishWasher myDishWasher = new DishWasher(true, "Ge", 5);
        Refigerator myRefigerator = new Refigerator(true, "kenmore",150);
        Sink sink = new Sink(true, "sinkBrand", "stainless steel");
        Kitchen mykitchen = new Kitchen(myDishWasher, myOven, myRefigerator, sink);

//        System.out.println("My kitchen has a " + mykitchen.getOven().getBrand() + " oven " + "with a max temp of " + mykitchen.getOven().getMaxTemp());
        System.out.println(mykitchen.toString());
    }
}
