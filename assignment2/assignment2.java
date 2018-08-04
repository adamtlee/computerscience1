import java.util.*;

public class assignment2 {

    public static void main (String  [] args) {
        Scanner console = new Scanner(System.in);
        double side1,side2,side3;  
        double area;               
        double perimeter;          
        double semip;              

        System.out.println("This program calculates the Area and peremeter of a triangle   ");

        System.out.print("Input the first side: ");
        side1 = console.nextDouble();

        System.out.print("Input the second side: ");
        side2 = console.nextDouble();

        System.out.print("Input the third side: ");
        side3 = console.nextDouble();

        perimeter = side1 + side2 + side3;

        semip = perimeter / 2.0;

        area = Math.sqrt(semip*(semip-side1)*(semip-side2)*(semip-side3));

        System.out.println("The sides are " + side1 + ", " + side2 + " and " + side3);
        System.out.println("The perimeter of the triangle is " + perimeter);
        System.out.println("and the area is " + area);
        System.out.println("Adam Lee");

        console.close();

    }  
}     