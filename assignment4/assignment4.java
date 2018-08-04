import java.util.Scanner;
import java.io.*;

public class assignment4 {

    public static void main (String [] args) throws IOException {


        // File name (input/output)
        final String INPUT_FILE  = "Input.txt";
        final String OUTPUT_FILE = "Output.txt";

        // Variables
        String line;               // Holds one oupput line
        int numberOfNumbers = 0;   // Number of numbers in the input file
        double sum = 0;            // The sum of the numbers
        double average = 0;        // The average of the numbers read
        double oneNumber;          // An individual number read from the file

        // Access the input/output files
        File inputDataFile = new File(INPUT_FILE);
        Scanner inputFile  = new Scanner(inputDataFile);
        FileWriter outputDataFile = new FileWriter(OUTPUT_FILE);
        PrintWriter outputFile = new PrintWriter(outputDataFile);
        System.out.println("Reading file " + INPUT_FILE + "\r\n" +
                "Creating file " + OUTPUT_FILE);

        // Read the input files and sum the numbers
        while (inputFile.hasNext()) {
            numberOfNumbers++;
            oneNumber = inputFile.nextDouble();

            // Calculation of sum
            sum += oneNumber;
            line = "Number = " + oneNumber + "\t" +
                    "sum = " + sum;
            System.out.println(line);
            outputFile.println(line);
        }  // End While Loop

        // Assures that denomenator is not 0
        if (numberOfNumbers > 0) {
            average = sum/numberOfNumbers;      // Calculation of average
        }

        // Output to console
        outputFile.println("The sum of the " + numberOfNumbers +

                " numbers is " + sum + "\n" +
                "and the average is " + average);
        System.out.println("The sum of the " + numberOfNumbers +

                " numbers is " + sum + "\n" +
                "and the average is " + average);

        inputFile.close();    // Close input file
        outputFile.close();   // Close output file
        System.exit(0);       // Safely exits system

    }   
}    