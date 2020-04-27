
/**
 *
 * @author christian
 */
public class Book 
{
    // Parameters
    private String title;
    private String author;
    private int isbn;
    private int year;
    final private String publisher = "Vanier";
    private int amountOfBooks = 0;
    /**
     * 
     * @param title the title of the book
     * @param author the author of the book
     * @param isbn the isbn of the book
     * @param year the year of the book
     */
    
    // Constructor
    public Book(String title, String author, int isbn, int year)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        amountOfBooks++;
    }
    // Setter method for title
    public void setTitle(String title)
    {
        this.title = title;
    }
    // Setter method for author
    public void setAuthor(String author)
    {
        this.author = author;
    }
    // Setter method for isbn
    public void setIsbn(int isbn)
    {
        this.isbn = isbn;
    }
    // Setter method for year
    public void setYear(int year)
    {
        this.year = year;
    }
    // Getter method for title
    public String getTitle()
    {
        return this.title;
    }
    // Getter method for author
    public String getAuthor()
    {
        return this.author;
    }
    // Getter method for isbn
    public int getIsbn()
    {
        return this.isbn;
    }
    //  Getter method for year
    public int getYear()
    {
        return this.year;
    }
    // Overriding the toString mehtod and using a nice output format to return the information that 
    // has been inputted by the user
    @Override public String toString()
    {
        return "\n" + String.format("%-5s", "Book 1 Information\n") 
                + String.format("%-5s","Title: " + this.title + "\n")
                + String.format("%-5s","Author: " + this.author + "\n")
                + String.format("%-5s","ISBN: " + this.isbn + "\n")
                + String.format("%-5s","Year: " + this.year + "\n")
                + String.format("%-5s","Publisher: " + this.publisher + "\n")
                + String.format("%-5s","Amount of books: " + this.amountOfBooks);
    }
    // Equals method returns true and outputs they are the same book if they are equal
    // and returns false and outputs they are not the same book if they are not equal
    public boolean equals(Book book)
    {
        if(this.isbn == book.isbn)
        {
            System.out.println("They are the same book!");
            return true;
        }
        else if (this.publisher == book.publisher)
        {
            System.out.println("They have the same publisher!");
            return true;
        }
        else if (this.amountOfBooks == book.amountOfBooks)
        {
            System.out.println("They have the same amount of books!");
            return true;
        }
        else return false;
            
    }

}
