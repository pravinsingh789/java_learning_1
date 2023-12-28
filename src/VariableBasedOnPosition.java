package src;

public class VariableBasedOnPosition {
    //instance variable
    int x;
    //static variable
    static  int y;


    public static void main(String[] args) {
        y=10;
        VariableBasedOnValue var = new VariableBasedOnValue();
        var.x=20;
        System.out.println(var.x+" "+y);

        //local variable
        int z=30;
        System.out.println(z);


    }

}
