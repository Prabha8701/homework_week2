package homework;

import java.util.Scanner;

public class UpperToLower9 {
    /**
     * a program to convert the upper case to lower case.
     */

    public static void alpha() {
        Scanner al= new Scanner(System.in);
        System.out.println("Enter Upper case letter :");
        char uppercase = al.next().charAt(0);
        char lowercase = Character.toLowerCase(uppercase);
        System.out.println("The lowercase Letter is : " + lowercase);

    }

    public static void main(String[] args) {
        alpha();

    }
}