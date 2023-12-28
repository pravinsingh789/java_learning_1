package src;
//1.primitive type
//2.reference type
public class VariableBasedOnValue {
    int x;
    public static void main(String[] args) {
        //primitive type
        int a =10;
        //reference type
        VariableBasedOnValue var;
        var = new VariableBasedOnValue();
        var.x=10;
        System.out.println(a);


    }
}
