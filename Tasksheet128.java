public class Tasksheet128 {
    public interface Shape {
        double calculateArea();
        double calculatePerimeter();
    }

    public abstract class AbstractShape implements Shape {
        protected String color;
        protected double length;
        protected double width;

        public AbstractShape(String color, double length, double width) {
            this.color = color;
            this.length = length;
            this.width = width;
        }

        @Override
        public abstract double calculateArea();

        @Override
        public abstract double calculatePerimeter();
    }
    public class Circle extends AbstractShape {
        private double radius;
        public Circle(String color, double radius) {
            super(color, 0, 0);
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }
    public class Rectangle extends AbstractShape {
        public Rectangle(String color, double length, double width) {
            super(color, length, width);
        }

        @Override
        public double calculateArea() {
            return length * width;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * (length + width);
        }
    }

    public static void main(String[] args) {
        Tasksheet128 example = new Tasksheet128();

        Circle circle = example.new Circle("Red", 5);
        Rectangle rectangle = example.new Rectangle("Blue", 4, 6);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}
