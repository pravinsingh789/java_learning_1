package src;

import java.util.ArrayList;

public class Generics {


    public static void main(String[] args) {

        //        generics
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        for (int x : ar){
            System.out.println(x);
        }

        ArrayList<String> arr = new ArrayList<>();
        arr.add("one");
        arr.add("two");
        for (String s : arr){
            System.out.println(s);
        }



    }
}
