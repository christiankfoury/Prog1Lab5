import java.util.*;
/**
 *
 * @author christian
 */
public class BookDriver 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        // Asking user input for the title of the book.
        System.out.print("What is the title of the book: ");
        String title = input.nextLine();
        
        //Asking user input for the author of the book.
        System.out.print("Who is the author of the book: ");
        String author = input.nextLine();
        
        //Asking user input for the ISBN of the book.
        System.out.print("What is the ISBN: ");
        int isbn = input.nextInt();
        
        //Asking user input for the year of publication.
        System.out.print("What is the year of publication: ");
        int year = input.nextInt();
        
        // Made a new Scanner because of a bug.
        Scanner userInput = new Scanner(System.in);
        
        //Asking user input for the title of a 2nd book.
        System.out.print("What is the title of the book: ");
        String title2 = userInput.nextLine();
        
        //Asking user input for the author of the 2nd book.
        System.out.print("Who is the author of the book: ");
        String author2 = userInput.nextLine();
        
        //Asking user input for the ISBN of the 2nd book.
        System.out.print("What is the ISBN: ");
        int isbn2 = userInput.nextInt();
        
        //Asking user input for the year of publication of the 2nd book.
        System.out.print("What is the year of publication: ");
        int year2 = userInput.nextInt();
        
        // Creating the first book.
        Book book = new Book(title, author, isbn, year);
        
        // Creating the 2nd book.
        Book book2 = new Book(title2, author2, isbn2, year2);
        
        //Comparing the 2 books.
        book.equals(book2);
        
        //Testing all the methods.
        book.setAuthor("Paul");
        book.setTitle("Titanic");
        book.setYear(2002);
        book.setIsbn(12345);
        System.out.println("\nThe title of the book is: " + book.getTitle());
        System.out.println("The author of the book is: " + book.getAuthor());
        System.out.println("The ISBN of the book is: " + book.getIsbn());
        System.out.println("The year of publication of the book is: " + book.getYear());
        
        // Outputting the attributes of the book.
        System.out.println(book);
    } 
    
}
