package exercise5;

    public class Main {
        public static void main(String[] args) {
            double circleArea1 = StaticMethod.calCircleArea(3.5);
            double circleArea2 = StaticMethod.calCircleArea(6.0);
            System.out.println("Circle area with radius 3.5: " + circleArea1);
            System.out.println("Circle area with radius 6.0: " + circleArea2);

            double rectangleArea1 = StaticMethod.calRectangleArea(2.5, 6);
            double rectangleArea2 = StaticMethod.calRectangleArea(4, 7);
            System.out.println("Rectangle area with width 2.5 and height 6: " + rectangleArea1);
            System.out.println("Rectangle area with width 4 and height 7: " + rectangleArea2);

            double triangleArea1 = StaticMethod.calTriangleArea(3, 4, 5);
            double triangleArea2 = StaticMethod.calTriangleArea(4.5, 7, 6);
            System.out.println("Triangle area with sides 3, 4, 5: " + triangleArea1);
            System.out.println("Triangle area with sides 4.5, 7, 6: " + triangleArea2);
        }
    }

