package homework;

import java.util.Scanner;

public class Temprature7 {
    /**
     * a program to insert any temperature value in degree Fahrenheit and
     * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
     */
    public static void cel() {
        Scanner temp = new Scanner(System.in);
        System.out.println("Enter Temprature : ");
        double f = temp.nextDouble();
        double c = ((f - 32) * 5 / 9);
        System.out.println(" Temprature in Celcius is : " + c);

    }

    public static void main(String[] args) {
        cel();
    }

}
