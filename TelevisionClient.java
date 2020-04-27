// Importing all Java classes
import java.util.*;
/**
 * @author Christian
 */
// This program uses the Television class and its methods that includes get, set and toString() methods, constructers.
// This program asks for the input of the user for the television brand names and their prices and by the end of the program
// it uses the equals() method to compare if two of the televisions are equal
public class TelevisionClient {
    
    public static void main(String[] args) {

        // Using the Scanner class
        Scanner kb = new Scanner(System.in);
        // Declaring some variables
        String brand;
        double price;
        
        // Prompting the user
        System.out.println("Enter the first television name:");
        // Getting input from the user
        brand = kb.next();
        
        // Prompting the user
        System.out.println("Enter the first television price");
        // Getting input from the user
        price = kb.nextDouble();
        // Creating Television1 Object using constructor
        Television television1 = new Television(brand, price);

        // Propmpting the user
        System.out.println("Enter Television2 Name:");
        // Getting input from the user
        brand = kb.next();
        
        // Prompting the user
        System.out.println("Enter Television2 Price:");
        // Getting input from the user
        price = kb.nextDouble();

        // Creating Television2 using default constructor
        Television television2 = new Television();
        // Testing set methods
        television2.setBrand(brand);
        television2.setPrice(price);

        // Testing get methods and outputting to the user
        System.out.println("getBrand(): "+ television1.getBrand());
        System.out.println("getPrice(): "+ television1.getPrice() + "$");

        // Testing toString() method and outputting to the user
        System.out.println("toString() method result: " + television1);
        
        // Having some nice output
        System.out.println("--------------------------");
        // Testing get methods and outputting to the user
        System.out.println("getBrand(): "+ television2.getBrand());
        System.out.println("getPrice(): "+ television2.getPrice() + "$");

        // Testgin toString() method and outputting to the user
        System.out.println("toString() method result: "+ television2);

        // Having some nice output
        System.out.println("**************************");
        // Testing if both televisions are equal using the equals method
        System.out.println("Are both televisions equal?");
        if(television1.equals(television2)) {
            System.out.println("YES, both televisions are equals");
        } else {
            System.out.println("NO, both televisions are not equals");
        }

    }
}