package src;

import java.util.ArrayList;

public class Generics {
    //wild card
    //1. upper bound
    //2. lower bound
    public static void printList(ArrayList<?> list){
        for (Object obj : list){
            System.out.println(obj);
        }
    }



    public static void main(String[] args) {

        //        generics
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);


        ArrayList<String> arr = new ArrayList<>();
        arr.add("one");
        arr.add("two");

        //calling method wildcard
        printList(ar);
        printList(arr);



    }
}
