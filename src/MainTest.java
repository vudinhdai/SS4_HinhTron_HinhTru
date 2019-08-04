public class MainTest {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle.toString());
        circle = new Circle(5,"red");
        System.out.println(circle.toString());
        System.out.println("dien tich cua hinh tron la "+circle.getArea());
        System.out.println("\n");




        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.toString());
        cylinder = new Cylinder(3.5);
        System.out.println(cylinder);


    }
}
