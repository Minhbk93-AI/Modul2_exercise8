package exercise4;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;


    public Triangle() {
        super();  // Gọi constructor của lớp cha (Shape)
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }


    public Triangle(double side1, double side2, double side3) {
        super();  // Gọi constructor của lớp cha (Shape)
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Constructor có tham số cho cả ba cạnh và màu sắc
    public Triangle(double side1, double side2, double side3, String color) {
        super(color);  // Gọi constructor của lớp cha (Shape)
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }


    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }


    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle with sides: " + side1 + ", " + side2 + ", " + side3 +
                ". Color: " + getColor() + ". Area: " + getArea() +
                ". Perimeter: " + getPerimeter();
    }
}

