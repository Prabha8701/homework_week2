package homework;

import java.util.Scanner;

public class AreaTriangle8 {
    /**
     * a program to calculate the area of a triangle.
     */
    public static void tri() {
        Scanner height = new Scanner(System.in);
        System.out.println("Enter Height value : ");
        double h = height.nextDouble();
        Scanner base = new Scanner(System.in);
        System.out.println("Enter Base value : ");
        double b = base.nextDouble();
        double a = (b*h/2);
        System.out.println("The area of triangle is : " + a);

    }

    public static void main(String[] args) {
        tri();
    }
}
