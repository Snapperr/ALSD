package Minggu3.AssignmentPyramid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Square Pyramid
        System.out.println("Enter the length of the base side of the square pyramid:");
        double baseSideLength = scanner.nextDouble();
        System.out.println("Enter the height of the square pyramid:");
        double height = scanner.nextDouble();
        SquarePyramid squarePyramid = new SquarePyramid(baseSideLength, height);
        System.out.println("Surface Area of Square Pyramid: " + squarePyramid.calculateSurfaceArea());
        System.out.println("Volume of Square Pyramid: " + squarePyramid.calculateVolume());

        // Sphere
        System.out.println("Enter the radius of the sphere:");
        double radius = scanner.nextDouble();
        Sphere sphere = new Sphere(radius);
        System.out.println("Surface Area of Sphere: " + sphere.calculateSurfaceArea());
        System.out.println("Volume of Sphere: " + sphere.calculateVolume());

        scanner.close();
    }
}