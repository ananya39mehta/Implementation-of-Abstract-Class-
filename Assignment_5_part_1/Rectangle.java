package Assignment_5.Assignment_5_part_1;

import Assignment_5.Assignment_5_part_1.shape;

import java.util.Scanner;
public class Rectangle implements shape {
    private final double length;
    private final double width;
    public Rectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();
    }
    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

