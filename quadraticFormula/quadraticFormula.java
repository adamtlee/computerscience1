import java.util.*;
public class quadraticFormula {

    static Toolkit tools = new Toolkit();

    public static double getValidNumber(String prompt) {

        // Scanner for user input
        Scanner mc = new Scanner(System.in);

        //*********************************************************************

        // While loop to loop for the user to enter a valid number not a string
        while (true) {
            System.out.print(prompt + " : ");
            String line = mc.nextLine();
            try {
                double val = Double.parseDouble(line);
                return val;
            } catch (Exception e) {
                System.out.println("Please Enter a valid number");
            }// end catch exception e
        } // end while loop

    } // end get getvalidnumber

    //*********************************************************************

    public static void main (String [] args) {

        Scanner mc = new Scanner(System.in);
        double a;
        double b;
        double c;

        // Print method to show what the program is doing
        System.out.println("This program calculates an equation using the quadratic " +
                " formula");
        System.out.println("ax^2 + bx + c");

        //*********************************************************************

        a = getValidNumber("enter the first coeffecient a ");

        b = getValidNumber("enter the second coeffecient b ");

        c = getValidNumber("enter the constant c ");


        double d; /* declared variable to calculate the
                  descriminent*/
        // method for descriminent (b^2 - 4ac)
        d = b*b - 4*a*c;

        // declared variables for numbers or imaginary numbers
        double num1, num2;
        double imagN;

        if(d > 0) {
            num1 = (-b + Math.sqrt(d))/(2*a);
            num2 = (-b - Math.sqrt(d))/(2*a);

            // Prints the solutions
            String str = "The two real numbers: ";
            // Rounds the numbers
            if (roundsToInt(num1)) {
                str += (int)num1;
            } else {
                str += (tools.leftPad(num1,5,"#0.00", " "));
            }
            str += " and ";
            if (roundsToInt(num2)) {
                str += (int) num2;
            } else {
                str += num2;
            }

            // Prints the result
            System.out.println(str);
        } else if (d < 0) {
            imagN = Math.sqrt(-d)/(2*a);
            System.out.println("The two imaginary numbers are: " +
                    tools.leftPad((b/(2*a)), 5, "#0.00", " ") + " +/- " +
                    tools.leftPad(imagN, 5, "#0.00", " ") + "i");
        } else {
            num1 = -b/(2*a);
            System.out.println("The one real number: " + num1);
        }




    } // End Main

    // dount the int up
    public static double roundtoint(double result) {
        double fract = result % 1;
        if (fract < .00001) {
            result = Math.floor(result);
        } else if (fract > .99999) {
            result = Math.ceil(result);
        }
        return result;
    }

    // round the int down
    public static boolean roundsToInt(double val) {
        double fract = val % 1.0;
        return (fract < .00001) || (fract > .99999);
    }
}    // End Class 