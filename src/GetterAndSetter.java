package src;
class Something{
    private int a;
    public void setA(int a){
        this.a=a;
    }
    public int getA(){
        return a;
    }
    private int b;
    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
public class GetterAndSetter {
    public static void main(String[] args) {
        Something sObj = new Something();
        sObj.setA(10);
        System.out.println(sObj.getA());
        sObj.setB(20);
        System.out.println(sObj.getB());

    }
}
