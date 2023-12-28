package src.SuperAndThis;

class Machine{
    Machine(){
        System.out.println("Machine is running");
    }
    Machine(String val){
        System.out.println(val+" is running");
    }

}
class Camera extends Machine{
    Camera(){
        //super("singh");
        this("singh");
        System.out.println("camera snapping");
    }
    Camera(String val){
        System.out.println(val+" ohohohoh");
    }
}

public class SAT {
    public static void main(String[] args) {
        Camera cam = new Camera();

    }
}
