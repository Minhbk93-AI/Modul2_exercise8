package exercise3;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point.setXY(2.0f, 3.0f);
        System.out.println(point);

        Point point2 = new Point(1.0f, 2.0f);
        System.out.println(point2);

        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint.setXY(3.0f, 4.0f);
        System.out.println(moveablePoint);

        moveablePoint.move();
        System.out.println(moveablePoint);
    }
    }

