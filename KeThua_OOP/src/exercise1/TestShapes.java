package exercise1;

public class TestShapes {
    public static void main(String[] args) {

        Circle circle = new Circle(2.5, "blue");
        System.out.println(circle.toString());


        Cylinder cylinder = new Cylinder(2.5, 4.0, "green");
        System.out.println(cylinder.toString());
    }
}

