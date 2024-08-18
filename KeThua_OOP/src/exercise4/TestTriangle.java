package exercise4;
import java.util.Scanner;

    public class TestTriangle {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter side1: ");
            double side1 = scanner.nextDouble();
            System.out.print("Enter side2: ");
            double side2 = scanner.nextDouble();
            System.out.print("Enter side3: ");
            double side3 = scanner.nextDouble();


            System.out.print("Enter color: ");
            String color = scanner.next();

            Triangle triangle = new Triangle(side1, side2, side3, color);


            System.out.println(triangle.toString());
        }
    }

