/** Calculate mileage reimbursement based on a table
 *
 *
 * Adam Lee
 * program #7 CS 1050,Section 001
 * Java Version 1.6.0_51,JGRASP,MacOS
 * Vocabulary word: Discombobulate - to cause to be confused confuse
 *                 emotionally (wordgenerator.net)
 * "To have faith is to trust yourself to the water.
 * When you swim you don't grab hold of the water,
 * because if you do you will sink and drown.
 * Instead you relax, and float."
 * -Alan Watts (1915 - 1973)(brainyquote.com)
 */
 
import java.util.Scanner;
import java.io.*;

public class assignment7 {

    static Toolkit tools = new Toolkit();

    public static void main (String [] args) throws IOException {

       // File name for input and output
        final String INPUT_FILE  = "input.txt";
        final String OUTPUT_FILE = "output.txt";

        // Variables
        double mileage;
        double base;
        double reimb;
        double rate;
        double overage;
        int number;

        double mileageTotal = 0;
        double reimbTotal = 0;
        int mileagePositive = 0;
        number = 0;
        String line;
        String line2;

        // Access the input/output files

        File inputDataFile = new File(INPUT_FILE);
        Scanner inputFile  = new Scanner(inputDataFile);
        FileWriter outputDataFile = new FileWriter(OUTPUT_FILE);
        PrintWriter outputFile    = new PrintWriter(outputDataFile);
        System.out.println("Reading file " + INPUT_FILE + "\r\n" +
                "Creating file " + OUTPUT_FILE);

        line = "    Mileage \t Reimbursement";
        line2 = "--------------------------------------";
        System.out.println(line);
        outputFile.println(line);
        System.out.println(line2);
        outputFile.println(line2);

        // Reads the mileage
        number = inputFile.nextInt();

        // Read input files and sum the numbers
        while (inputFile.hasNext()) {
            mileage = inputFile.nextDouble();

            // Calculate the sum method

            if (mileage <= 0) {
                outputFile.println(Toolkit.leftPad(mileage, 10, "#0.0", " ") +
                        "\t     *****");
                System.out.println(Toolkit.leftPad(mileage, 10, "#0.0", " ") +
                        "\t     *****");
                continue;
            }
            if (mileage < 400) {
                base = 0; rate = 0.18; overage = mileage;
            }
            else if (mileage >= 400 && mileage < 900) {
                base = 65.00; rate = 0.15; overage = mileage - 400;
            }
            else if (mileage >= 900 && mileage < 1300) {
                base = 115; rate = 0.12; overage = mileage - 900;
            }
            else if (mileage >= 1300 && mileage < 1900) {
                base = 140.00; rate = 0.10; overage = mileage - 1300;
            }
            else if (mileage >= 1900 && mileage < 2600) {
                base = 165.00; rate = 0.08; overage = mileage - 1900;
            }
            else {
                base = 195.00; rate = 0.06; overage = mileage - 2600;
            }

            // Calculation of numbers in file
            reimb = base + (rate * overage);
            mileageTotal += mileage;
            reimbTotal += reimb;
            mileagePositive++;

            // Print Mileage and Reimb
            outputFile.println(Toolkit.leftPad(mileage, 10, "#0.0", " ") + "\t" +
                    Toolkit.leftPad(reimb, 10, "#0.00", " "));

            System.out.println(Toolkit.leftPad(mileage, 10, "#0.0", " ") + "\t" +
                    Toolkit.leftPad(reimb, 10, "#0.00", " "));
        } 

        outputFile.println("The total Reimbursement is " + reimbTotal);
        outputFile.println("The number of mileage proccessed " + number);
        outputFile.println("The mileage that is greater than 0 is " + mileagePositive);

        inputFile.close();
        outputFile.close();
        System.exit(0);

    } 
}