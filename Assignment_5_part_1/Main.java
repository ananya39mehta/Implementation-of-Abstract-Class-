package Assignment_5.Assignment_5_part_1;
import Assignment_5.Assignment_5_part_1.Circle;
import Assignment_5.Assignment_5_part_1.Rectangle;
import Assignment_5.Assignment_5_part_1.Triangle;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the shape (circle, triangle, rectangle): ");
        String shape = scanner.nextLine();
        Assignment_5.Assignment_5_part_1.shape shapes;
        switch (shape.toLowerCase()) {
            case "circle":
                shapes = new Circle();
                break;
            case "triangle":
                shapes = new Triangle();
                break;
            case "rectangle":
                shapes = new Rectangle();
                break;
            default:
                System.out.println("Invalid shape. Please enter circle, triangle, or rectangle.");
                return;
        }
        System.out.println("Area of the " + shape + ": " + shapes.getArea());
        System.out.println("Perimeter of the " + shape + ": " +
                shapes.getPerimeter());
    }
}