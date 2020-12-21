 
/**
 * This program uses methods to find the area and perimeter of a triangle
 * Adam Lee
 * program #5 CS 1050, Section 001
 * Java Version 1.6.0_51,JGRASP, MacOS
 * Vocabulary word: physics - The science of matter and energy, and their properties
 * and interactions in fields including mechanics, acoustics, optics, heat,
 * electricity, magnetism, radiation, and atomic and nuclear science.
 * (yourdictionary.com)
 * "Everybody is a genius. But if you judge a fish by its ability to climb
 * a tree, it will live its whole life believing that it is stupid."
 * - Albert Einstein (1879 - 1955)(goodreads.com)
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class assignment5 {

    static Scanner console =  new Scanner (System.in);

    public static void main (String  [] args) {

        // Variables
        double side1,side2,side3;   // Input Values
        double perimeter;           // side1 + side2 + side3
        double semiP;               // Perimeter / 2.0
        double area;                // Math.sqrt(semiP * (semiP-side1) * (semiP-side2) * (semiP-side3))

        explain();

        // Prompt the user to input the sides of a triangle
        side1 = getOneSide("first");
        side2 = getOneSide("second");
        side3 = getOneSide("third");

        // Uses a method to calculate the perimeter
        perimeter = calcPerimeter(side1, side2, side3);

        // Uses a method to calculate the area
        area = calcArea(side1, side2, side3);

        // Displays the output
        output(side1,side2,side3,area,perimeter);

        System.exit(0);
    }     // End Main

    // Explains to the user what the program does
    public static void explain() {
        System.out.println("This program calculates the area and perimeter" +
                " of a triangle using methods and if statements." +
                " \nAdam Lee");

    }     // End void method for explain

    public static double getOneSide(String str) {
        double side;

        // Input from the user
        System.out.print("Input " + str + " side of a triangle: ");
        side = console.nextDouble();
        if (side <= 0) {
            System.out.println("Enter a side greater than 0");
            System.exit(0);
        }
        return side;
    }     // End void method for input

    public static double calcPerimeter(double side1,double side2, double side3) {

        return side1 + side2 + side3;


    }     // End call method for perimeter

    public static double calcArea(double side1, double side2, double side3) {
        double semiP;
        semiP = calcPerimeter(side1, side2, side3) / 2.0;
        return Math.sqrt(semiP * (semiP-side1) * (semiP-side2) * (semiP-side3));
    }     // End void method for area

    public static void output(double side1,double side2, double side3,
                              double area, double perimeter) {
        String tempPerimeter;
        String tempSide;
        DecimalFormat dFormat = new DecimalFormat("0.00");
        System.out.print("The sides are " + dFormat.format(side1) + ", " + dFormat.format(side2) +
                ", " + dFormat.format(side3) + "\nThe perimeter of the triangle is " +
                dFormat.format(perimeter) + "\nThe area of the triangle is " +
                dFormat.format(area) + "\nAdamLee");
    }
}