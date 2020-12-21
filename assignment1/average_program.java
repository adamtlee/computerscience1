/**Interactive Average Program
 *        This program asks the user to input two real numbers
 *        calculates the aveage of these numbers and prints the results
 * Adam Lee
 * program #1 CS 1050,Section 001
 * Java Version 1.6.0_51,JGRASP,MacOS
 * Vocabulary work: Tenative - done without confidence; hesitant
 * "It's not the size of the dog in the fight, it's the size of
 * the fight in the dog." Mark Twain, Brainyquote.com, (Nov,30,1835-Apr,21,1910)
 */

import java.util.*;
public class average_program {
    public static void main (String  [] args) {
        Scanner console=new Scanner(System.in);
        double num1,num2; 
        double average;   

        System.out.println("This program averages two real numbers.");

        System.out.print("Input your first number: ");
        num1 = console.nextDouble();

        System.out.print("Input your second number: ");
        num2 = console.nextDouble();

        average = (num1 + num2)/2.0;

        System.out.print("The average of " + num1);
        System.out.println(" and " + num2 + " is " + average);
        System.out.println("Adam Lee");

    } 
} 