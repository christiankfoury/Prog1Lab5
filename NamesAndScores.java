// Importing needed classes
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 * @author Christian
 */

// This program reads the file input.txt that contains a list with a score. It output the highest score with its name, the lowest score
// with its name and the average of all scores
public class NamesAndScores {
    // Main method
    public static void main(String[] args) throws FileNotFoundException {
        // File path
        File inFile = new File("C:/Users/Chris/chris/NamesAndScoresInput.txt");
        // Reading the File with the scanner class
        Scanner scFile = new Scanner(inFile);
        // Declaring and intializing some needed variables
        double highScore = 0;
        double lowScore = 0;
        int count = 0;
        
        // Sudent 1 and his scores
        String student1 = scFile.next();
        double score1 = scFile.nextDouble();
        highScore = score1;
        lowScore = score1;
        // Count +1
        count++;

        // Student 2 and his scores
        String student2 = scFile.next();
        double score2 = scFile.nextDouble();
        // Count +1
        count++;
        // If statements for high and low scores
        if (score1 < score2) {
            highScore = score2;
        }
        if (score1 > score2){
            lowScore = score2;
        }

        // Student 3 and his scores
        String student3 = scFile.next();
        double score3 = scFile.nextDouble();
        // Count +1
        count++;
        // If statements for high and low scores
        if (score2 < score3) {
            highScore = score3;
        }
        if (score2 > score3){
            lowScore = score3;
        }

        // Student 4 and his scores
        String student4 = scFile.next();
        double score4 = scFile.nextDouble();
        // Count +1
        count++;
        // If statements for high and low scores
        if (score3 < score4) {
            highScore = score4;
        }
        if (score3 > score4){
            lowScore = score4;
        }

        // Comparing with if statements to find out who is the highest score and output the name
        if (highScore == score1) {
            System.out.println("The highest score was " + highScore + "% by " + student1);
        }
        else if (highScore == score2){
            System.out.println("The highest score was " + highScore + "% by " + student2);
        }
        else if (highScore == score3){
            System.out.println("The highest score was " + highScore + "% by " + student3);
        }
        else {
            System.out.println("The highest score was " + highScore + "% by " + student4);
        }
        
        // Comparing with if statements to find out who is the lowest score and output the name
        if (lowScore == score1) {
            System.out.println("The lowest score was " + lowScore + "% by " + student1);
        }
        else if (lowScore == score2){
            System.out.println("The lowest score was " + lowScore + "% by " + student2);
        }
        else if (lowScore == score3){
            System.out.println("The lowest score was " + lowScore + "% by " + student3);
        }
        else {
            System.out.println("The lowest score was " + lowScore + "% by " + student4);
        }
        // Calculating the average
        double average = (score1 + score2 + score3 + score4) / count;
        // Rounding up the average
        average = Math.round(average);
        // Output the average
        System.out.println("The average of all the scores processed is " + average + "%");

    }
}