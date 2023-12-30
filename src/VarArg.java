package src;

public class VarArg {
    public  static void printSomething(int... x){
        for(int a : x){
            System.out.print(a);
        }
        System.out.println();
    }

    public static void printCombination(String str,int... y){
        System.out.println(str);
        for (int a: y){
            System.out.print(a);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printSomething(1,2);
        printSomething(1,2,3);
        printSomething(1,2,3,4);

        printCombination("pravin",1,2,3);

    }
}
