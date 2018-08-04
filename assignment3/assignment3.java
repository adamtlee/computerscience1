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
