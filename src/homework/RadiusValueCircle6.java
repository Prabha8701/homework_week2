package homework;

import java.util.Scanner;

public class RadiusValueCircle6 {
    /**
     * a program to enter any radius value of the circle and find out the
     * area.(Formula of Area A=PI*r*r).
     */


    public static void circleRadius() {
        System.out.println("Enter Radius value : ");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double ans = Math.PI * r * r;
        System.out.println("The area of the circle is : " + ans);
    }

    public static void main(String[] args) {
         circleRadius();
    }
}
