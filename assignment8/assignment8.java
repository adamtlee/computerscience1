/** Print out the test scores of students in a table with a message
 *
 *
 * Adam Lee
 * program #8 CS 1050,Section 001
 * Java Version 1.6.0_51,JGRASP,MacOS
 * Vocabulary word: Mediaeligvalism - The method or spirit of the Middle
 * Ages devotion to the institutions and practices of the Middle Ages a
 * survival from the Middle Ages. (www.wordgenerator.net)
 * "If the purpose for learning is to score well on a test,
 *  we've lost sight of the real reason for learning."
 * -Jeannie Fulbright(unknown - present)(teachingenglish.org)
 */
 
import java.util.Scanner;
import java.io.*;

public class assignment8 {

    static Toolkit tools = new Toolkit();

    public static void main (String [] args) throws IOException {

//*******************************************************************
        // Input File and Output file name
        final String INPUT_FILE  = "input.txt";
        final String OUTPUT_FILE = "output.txt";

//*******************************************************************

        // Declarations

        int numberOfGrades = 0;    // Amount of Grades in the File
        int rangeCount = 0;        // Amount of Grades between x & y
        double rangeSum = 0;       // Sum of numbers in x & y
        double grade;              // A Letter grade which reads from the file

        String line;               // A String declaration to print out the assigned message
        String line2;              //
        String line3;
        String msg = "";
        String student;
        String strAverage;

//*******************************************************************

        // Access the input files & create output files
        File inputDataFile = new File(INPUT_FILE);
        Scanner inputFile  = new Scanner(inputDataFile);
        FileWriter outputDataFile = new FileWriter(OUTPUT_FILE);
        PrintWriter outputFile    = new PrintWriter(outputDataFile);
        System.out.println("Reading file " + INPUT_FILE + "\r\n" +
                "Creating file " + OUTPUT_FILE);

//*******************************************************************

        // Method to print header of the table
        line = "   Grade Reports";
        line2 = "    Name \t          Grade \tMessage\n";
        line3 = "--------------------------------------";
        outputFile.println(line);
        outputFile.println(line2);
        outputFile.println(line3);


        // Read the content in the files
        while (inputFile.hasNext()) {
            numberOfGrades++;
            grade   = inputFile.nextInt();
            student = inputFile.nextLine();
            student = student.trim();

//*******************************************************************

            // If grade is >= the message will print "OUTSTANDING".
            if (grade >= 90) {
                msg = "OUTSTANDING";
            }

            // If the grade is > 70 && grade <= 89 the message will print "Satisfactory".
            else if (grade >= 70 && grade <= 89) {
                msg = "Satisfactory";
                rangeCount++;
                rangeSum += grade;
            }
            // If the test scores were something else the message will print "FAILING".
            else {
                msg = "FAILING";
            }

            /** Method to print the students name, grade, and message in the table
             also uses Toolkit.padString to line up the colums
             */
            outputFile.println(Toolkit.padString(student, 20, "", " ")
                    + "\t" +
                    Toolkit.leftPad(grade, 5, "#0", " ") + "\t"
                    + "\t" + msg);

        } // Ends the while loop for grades

//***************************************************************

        // Calculates the average of the grades
        if (rangeCount > 0) {
            strAverage= Toolkit.leftPad((double) rangeSum / rangeCount, 5, "#0.0", " ");
        }
        else  {
            strAverage = "none";
        }


//*******************************************************************
        outputFile.println("Number of names processed: " + numberOfGrades);
        outputFile.println("Number of grades in range 70 to 89: " +
                rangeCount);
        outputFile.println("Average of grades in this range: " +
                strAverage);


//*******************************************************************

        inputFile.close();
        outputFile.close();
        System.exit(0);

    }  // End main method
}     // End Class