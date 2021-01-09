package labs_examples.arrays.videos;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<String>();
//
//        arrayList.add("hello");
//        arrayList.add("world");
//        arrayList.add("bye");
//
//        arrayList.remove("bye");
//
////        arrayList.
////
//        for (String s : arrayList){
//            System.out.println(s);
//        }
//        System.out.println(arrayList.get(1));

//        String val = arrayList.get(1);
//        boolean check = arrayList.contains("hello");
//        System.out.println(val);
//        System.out.println(check);

        //YOUR CODE BELOW

        /*  1.  First create and initialize an ArrayList called guests.
                Remember, the syntax to create an ArrayList is:
                ArrayList<type> name = new ArrayList<type>();   */

        ArrayList<String> guests = new ArrayList<String>();


        /*  2.  Now add the following names to the list using .add() :
                Arnold, Gerald, Eugene, Helga, Phoebe in that order */

        guests.add("Arnold");
        guests.add("Gerald");
        guests.add("Eugene");
        guests.add("Helga");
        guests.add("Phoebe");


        /*  3.  Print the names using a ForEach loop.
                Remember, the syntax for the ForEach loop is:
                for(type element: collection) { code }          */

        for (String vals : guests){
            System.out.println(vals);
        }

        /*  4.  Eugene wont be able to make it.
                Remove him from the list using .remove() */

        guests.remove("Eugene");


        /*  5. Print the list again  */

        for (String vals : guests){
            System.out.println(vals);
        }

    }
}
