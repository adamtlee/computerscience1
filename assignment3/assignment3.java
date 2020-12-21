/** Interactive Triangle program with JOptionPane
 *  This program asks the user to input 3 sides of a triangle
 *  Calculates the area of the triangle using JOptionPane
 *  Adam Lee
 *  Program #3 CS 1050, section 001
 *  Java Version 1.6.0_51,JGRASP,MACOS
 *  Vocabulary Word:Gedankenexperiment - an experiment carried out in thought only
 *  "The 1st period is won by the best technician. The 2nd period is won by
 *   the kid in the best shape. The 3rd period is won by the kid with the biggest heart."
 *  -Dan Gable (b. 1948)
 */
 
import java.util.*;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class assignment3 {

    public static void main (String [] args) {
        
        double   a,b,c;      
        double   area;       
        double   perimeter;  
        double   semiP;      
      
        String inputStr;  
        StringTokenizer st;

        inputStr = JOptionPane.showInputDialog(
                "Enter sides of a triangle seperated by spaces");

        st = new StringTokenizer(inputStr);
        a = Double.parseDouble(st.nextToken());
        b = Double.parseDouble(st.nextToken());
        c = Double.parseDouble(st.nextToken());


        // Calculations
        perimeter = a + b + c;

        semiP = perimeter/2.0;

        area = Math.sqrt(semiP*(semiP-a)*(semiP-b)*(semiP-c));

        // Creating a DecimalFormat objects.
        DecimalFormat fmt1 = new DecimalFormat("#0.0");
        DecimalFormat fmt2 = new DecimalFormat("#0.00");

        // Output to the user using JOptionPane
        JOptionPane.showMessageDialog(null,"The sides are " + fmt2.format(a) + ", " +
                fmt2.format(b) + " , and " + fmt2.format(c) +
                "\nThe perimeter is " + fmt1.format(perimeter)  +
                "\nThe formatted area is " + fmt1.format(area) +
                "\nThe unformatted area is " + area +
                "\nAdam Lee.");

        // Safely ends the JOptionPane
        System.exit(0);

    }  
}   
