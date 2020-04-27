// Importing all Java classes
/**
 * @author Christian
 */
import java.util.*;
// This class uses a scanner to read to numbers by using a type safe input and then calculating the GCD of the two numbers
// by using the Euclidean algorithm. A method is created to create the Euclidean algorithm. The Euclidean algorithm consists of
// taking the biggest number of the two numbers inputed hopping it is the first number (if it is not the case, 
// it will loop and the first number inputted will take place of the second number) 
// of the numbers inputted and then doing the REMAINDER of number1 by dividing it by number2 until number2 is equal to 0. Then it will
// output number 1 which is the answer to the solution 
public class gcd { 
    // Main method
    public static void main(String args[]){ 
        // Declaring some variables
        int number1 = 0;
        int number2 = 0;

        // Using the scanner class
        Scanner kb = new Scanner(System.in);
        // Prompt the user for a number
        System.out.println("Please enter first number to find GCD");
        // BY using a type-safe input, the program will recieve a integer
        if (kb.hasNextInt())
            {
            number1 = kb.nextInt(); 
            }

        // Prompt the user for another number
        System.out.println("Please enter second number to find GCD"); 
        // BY using a type-safe input, the program will recieve a integer
        if (kb.hasNextInt())
            {
            number2 = kb.nextInt();
            } 
        // Output the answer by using the method useEuclidean
         System.out.println("GCD of two numbers " + number1 +" and " + number2 +" is :" + useEuclidean(number1,number2)); 
    } 

        
         // Creating a method name useEuclidean. Private = it will only be used in this class, it is a static method, and 
         // it returns an integer and it recieves to integers
         private static int useEuclidean(int number1, int number2) { 
             // if number 2 is equal to 0 output number 1
             if(number2 == 0){ 
                 return number1; 
                } 
                // number2 to is now in the place of number1 and number2 is equal to the remainder number2 in number 1
                // THEN the method will LOOP
                 return useEuclidean(number2, number1 % number2); } 
                }
