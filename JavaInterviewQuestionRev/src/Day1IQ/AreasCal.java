package Day1IQ;

import java.util.Scanner;

public class AreasCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Geometry Calculator");
            System.out.println("1. Find area of a Circle");
            System.out.println("2. Find perimeter of a Circle");
			System.out.println("3. Find area of a Rectangle");
            System.out.println("4. Find perimeter of a Rectangle");
            System.out.println("5. Find area of a Triangle");
            System.out.println("6. Find perimeter of a Triangle");
            System.out.println("7. Find area of a Square");
            System.out.println("8. Find perimeter of a Square");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateCircleArea(scanner);
                    break;
                case 2:
                    calculateCirclePerimeter(scanner);
                    break;
                case 3:
                    calculateRectangleArea(scanner);
                    break;
                case 4:
                    calculateRectanglePerimeter(scanner);
                    break;
                case 5:
                    calculateTriangleArea(scanner);
                    break;
                case 6:
                    calculateTrianglePerimeter(scanner);
                    break;
                case 7:
                    calculateSquareArea(scanner);
                    break;
                case 8:
                    calculateSquarePerimeter(scanner);
                    break;
                case 9:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void calculateCircleArea(Scanner scanner) {
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("Area of the circle: " + area);
    }

    public static void calculateCirclePerimeter(Scanner scanner) {
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;

        System.out.println("Perimeter of the circle: " + perimeter);
    }

    public static void calculateRectangleArea(Scanner scanner) {
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.println("Area of the rectangle: " + area);
    }

    public static void calculateRectanglePerimeter(Scanner scanner) {
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);

        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    public static void calculateTriangleArea(Scanner scanner) {
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Area of the triangle: " + area);
    }

    public static void calculateTrianglePerimeter(Scanner scanner) {
        System.out.print("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();

        double perimeter = side1 + side2 + side3;

        System.out.println("Perimeter of the triangle: " + perimeter);
    }

    public static void calculateSquareArea(Scanner scanner) {
        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();

        double area = sideLength * sideLength;

        System.out.println("Area of the square: " + area);
    }

    public static void calculateSquarePerimeter(Scanner scanner) {
        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();

        double perimeter = 4 * sideLength;

        System.out.println("Perimeter of the square: " + perimeter);
    }
}
