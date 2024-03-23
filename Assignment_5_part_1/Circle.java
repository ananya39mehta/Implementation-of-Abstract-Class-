package Assignment_5.Assignment_5_part_1;

import Assignment_5.Assignment_5_part_1.shape;

import java.util.Scanner;
public class Circle implements shape {
    private double radius;
    public Circle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
    }
    @Override
    public double getArea() {
        return radius * radius * 3.141592653589793;
    }
    @Override
    public double getPerimeter() {

        return 2 * 3.141592653589793 * radius;
    }
}