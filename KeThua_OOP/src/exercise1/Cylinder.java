package exercise1;

public class Cylinder extends Circle {
        private double height;


        public Cylinder() {
            super();
            this.height = 1.0;
        }

        public Cylinder(double radius, double height) {
            super(radius);
            this.height = height;
        }

        public Cylinder(double radius, double height, String color) {
            super(radius, color);
            this.height = height;
        }

        // Getter và Setter cho height
        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getVolume() {
            return getArea() * height;  // Sử dụng phương thức getArea() từ lớp Circle
        }

        @Override
        public String toString() {
            return "Cylinder[radius=" + getRadius() + ", height=" + height + ", color=" + getColor() +
                    ", area=" + getArea() + ", volume=" + getVolume() + "]";
        }
    }

