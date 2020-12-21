/**average program using arrays
 *        This program uses arrays to calculate
 *        the average
 * Adam Lee
 * program #11 CS 1050,Section 001
 * Java Version 1.6.0_51,JGRASP,MacOS
 * Vocabulary word: Nepenthe - A drug used by the ancients to give relief
 * from pain and sorrow by some supposed to have been opium or hasheesh
 * Hence anything soothing and comforting.(http://www.wordgenerator.net)
 * "while (!(succeed = try())); "
 * - Author is a computer or Unknown
 */
 
import java.util.*;
public class assignment11 {
    static Toolkit tools = new Toolkit();

    //******************************************************************
    // Method to assure that the user inputs a valid number and nothing else
    public static double getValidNumber(String prompt) {

        // Scanner for user input
        Scanner mc = new Scanner(System.in);

        // While loop to loop for the user to enter a valid number (not a string etc..)
        while (true) {
            System.out.print(prompt + " : ");
            String line = mc.nextLine();

            // Parse input from the user to check
            try {
                double val = Double.parseDouble(line);
                // If the input is valid system will return the value
                return val;
                // This messeage will print continuously until the user enters a valid number
            } catch (Exception e) {
                System.out.println("\nPlease Enter a valid number");
            }// end catch exception e
        } // end while loop

    } // end get getvalidnumber

    //******************************************************************

    // Main method
    public static void main (String[] args) {

        // For scanner input from the user
        Scanner console = new Scanner(System.in);

        // Get array and store
        ArrayList<Integer> numbers = new ArrayList();

        // declarations
        int number;       // Number for the user input
        double average;   // sum of user input/# of user input
        double sum;       // total sum of user input

        //******************************************************************

        // Outputs to the console what the program does
        System.out.println("This program calculates the average of input numbers using arrays.");

        // do while loop for numbers > 0
        do {
            // Prints to console to enter as many valid numbers and 0 to quit the system
            number = (int)getValidNumber("Enter number #" +
                    // Since count starts at 0...+ 1 so it can output 1
                    (1 + numbers.size()) + " (or 0 to quit)");

            // If the numbers > 0 proceed
            if (number > 0) {

                // Insert element
                numbers.add(number);

            } // Close if

        } while (number > 0);

        //******************************************************************

        sum = 0;
        for (int i = 0; i < numbers.size(); i++) {

            // obtain i
            sum += numbers.get(i);
        } // End do

        // Calculates the average
        average = sum / numbers.size();

        //******************************************************************

        // Output to the console
        System.out.println("The sum of the numbers entered is: " + sum);

        System.out.println("You've entered " + numbers.size() + " numbers." );

        System.out.println("The average of the numbers entered is: " +
                tools.leftPad(average,5, "#0.00", " "));

        
    }  // End main
} // End Class