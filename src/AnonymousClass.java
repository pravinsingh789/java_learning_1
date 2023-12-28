package src;
class Machine{
    void print(){
        System.out.println("printing from machine class....");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        Machine mac = new Machine(){
            @Override
            void print() {
                System.out.println("from main");
            }
        };
        mac.print();
    }
}
